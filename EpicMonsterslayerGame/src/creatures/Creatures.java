package creatures;

import tools.*;

/**
 * Interface used by the Player class and the AbstractMonster class.
 * @author Henrik Hagström
 * @version 1,0
 * 
 */
public interface Creatures {

	
	/**
	 * Shows the current info about the creature. Health, weapon, damage range and such.
	 * 
	 * @return Everything you need to know in a nice package!
	 */
	String status();
	
	/**
	 * Checks if current health points is higher than zero.
	 * Sets the alive boolean to true or false depending on currentHp.
	 */
	boolean isAlive();


	/**
	 * Damage given from the creature.
	 * @return random generated weapon damage plus strength, and amulet modifier for players.
	 */
	int giveDmg();
	
	/**
	 * Damage taken from enemy creature.
	 * Reduces creature currentHp by (dmg - toughness), and - Amulet modifier for players.
	 */
	void takeDmg(int dmg);
	/**
	 * Parameter used to get the current damage that was given, so it can be printed out.
	 * @return the damage that the monster took.
	 */
	public int getDmgTaken();
	/**
	 * Get the name of the creature.
	 * @return name.
	 */
	String getName();
	/**
	 * Gets the currently equipped weapon.
	 * @return weapon.
	 */
	Weapon getWeapon();
	/**
	 * The maximum health points of the creature.
	 * @return healthPoints.
	 */
	int getHp();
	/**
	 * Get current health points.
	 * @return current health.
	 */
	int getCurrentHp();
	/**
	 *Get current toughness.
	 * @return the amount of toughness the creature has.
	 */
	int getToughness();
	/**
	 * Gets the current strength of the creature.	
	 * @return strength.
	 */
	int getStrength();
	/**
	 * get the current level.
	 * @return shows the level of the creature.
	 */
	int getLvl();
}
