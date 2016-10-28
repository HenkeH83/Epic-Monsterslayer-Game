package creatures;

import tools.*;

/**
 * Class used to create Monster classes. Uses the Creatures interface.
 * 
 * @author Henrik Hagström
 * @version 1,0
 * 
 */
public abstract class Monster implements Creatures {
	WeaponList weaponList = new WeaponList();
	private String name;
	private Weapon weapon;
	private boolean alive;
	private int lvl, hp, currentHp, dmgTaken, strength, toughness, xp, gold;

	/**
	 * Constructor, set all the parameters for monsters.
	 * 
	 * @param name
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public Monster(String name, int lvl, int strMod, int toughMod) {
		this.name = name;
		this.lvl = lvl;
		alive = true;
		hp = myRandom.randomMaxMin(5, 10) * lvl;
		currentHp = hp;
		strength = lvl + strMod;
		toughness = lvl + toughMod;
		xp = myRandom.randomMaxMin(5, 5) * lvl;
		gold = myRandom.randomMaxMin(5, 5) * lvl;
		weapon = weaponList.getWeapon(lvl);
	}

	public String status() {
		return "****************************" + "\n* Name: " + name + "\n* Level: " + lvl + "\n* Health Points: "
				+ currentHp + "\\" + hp + "\n* Strength: " + strength + "\n* Toughness: " + toughness + "\n* Weapon: "
				+ weapon.getName() + "\n* Potential damage: " + (strength + weapon.getMinDmg()) + " - "
				+ (strength + weapon.getMaxDmg() + weapon.getMinDmg()) + "\n**************************************";
	}

	@Override
	public boolean isAlive() {
		return alive = currentHp > 0 ? true : false;
	}

	/**
	 * Gives the gold.
	 * 
	 * @return The gold that creature had.
	 */
	public int giveGold() {
		return gold;
	}

	/**
	 * Gives the experience points that creature had.
	 * 
	 * @return experience points.
	 */
	public int giveXp() {
		return xp;
	}

	@Override
	public int giveDmg() {
		return weapon.getDmg() + strength;
	}

	@Override
	public void takeDmg(int dmg) {
		if (dmg <= toughness)
			dmgTaken = 0;
		else {
			currentHp -= (dmg - toughness);
			dmgTaken = (dmg - toughness);
		}
	}

	/**
	 * There is a 50/50 chance that the monster will scream at you then it
	 * attacks. And this is it.
	 */
	public void roar() {
		if (myRandom.fiftyFifty() == 0)
			System.out.println("\n* The " + this.getName()
					+ " screams with burning hatered:\n* -\"I'll cut you!\"");
		else
			System.out.println("\n* The " + this.getName()
					+ " spits through his clenched teeth:\n* -\"You die now!\"");
	}

	/**
	 * Upon death, there is a chance that the monster will cry out.
	 */
	public void deathCry() {
		if (myRandom.fiftyFifty() == 0)
			System.out.println("\n- The " + this.getName()
					+ " tries to use his last breath on this earth to speak, but all that comes out is blood...\n* -\"Ghraw....\"");
		else
			System.out.println("\n- The " + this.getName()
					+ " lies in a puddle of his own blood, eyes staring at the sky, as if he's searching for something. A faint smile touches his lips.. and he is gone.");
	}

	/**
	 * Set name for the monster
	 * 
	 * @param name,
	 *            what ever you wish.
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	/**
	 * Used to set a weapon for the monster.
	 * 
	 * @param name
	 * @param maxDmg
	 *            remember that the actual max damage is(max damage + min
	 *            damage).
	 * @param minDmg
	 */
	public void setWeapon(String name, int maxDmg, int minDmg) {
		weapon = new Weapon(name, maxDmg, minDmg);
	}

	/**
	 * Used by bosses to set health points.
	 * 
	 * @param hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Used by bosses to set xp.
	 * 
	 * @param xp
	 */
	public void setXp(int xp) {
		this.xp = xp;
	}

	/**
	 * Used by bosses to set gold.
	 * 
	 * @param gold
	 */
	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public int getDmgTaken() {
		return dmgTaken;
	}

	@Override
	public int getCurrentHp() {
		return currentHp;
	}

	@Override
	public int getToughness() {
		return toughness;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public int getLvl() {
		return lvl;
	}
	/**
	 * Only used to pass on via the Boss interface to the boss monsters.
	 */
	public void progress(){
		
	}
}
