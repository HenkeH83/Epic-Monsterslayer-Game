package tools;

/**
 * Handles the weapons in the Epic Monsterslayer Game.
 * Give constructor ("Name" max damage and minimum damage).
 * @author Henrik Hagström
 * @version 1,0
 * 
 */
public class Weapon {
	private String name;
	private int maxDmg;
	private int minDmg;
	/**
	 * Constructor for the Weapon class.
	 * Consider that player strength adds to the damage.
	 * @param name
	 * @param maxDmg
	 * @param minDmg
	 * 
	 */
	public Weapon(String name, int maxDmg, int minDmg){
		this.name = name;
		this.maxDmg = maxDmg;
		this.minDmg = minDmg;
	}
	/**
	 * gets the name of the weapon.
	 * @return weapon name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the name for the weapon, if needed.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * The set max damage for the weapon.
	 * @return max damge (-minimum damage).
	 */
	public int getMaxDmg(){
		return maxDmg;
	}
	/**
	 * The minimum damage the weapon can give.
	 * @return minimum damge.
	 */
	public int getMinDmg(){
		return minDmg;
	}
	/**
	 * Generates a random number for weapon.
	 * @return the random number generated between max damage and min damage.
	 * Remember this is the damage for weapon only, Player strength is added later.
	 * If the generated number is equal to max number plus min number, aka highest posible outcome, the dmg is doubled.
	 * It is only the weapon damage that is doubled, and not the total Player damage. 
	 */
	public int getDmg() {
		int dmg = myRandom.randomMaxMin(maxDmg, minDmg);
		if(dmg == (maxDmg-1) + minDmg){
			dmg *= 2;
			System.out.println("\n\n* Critical hit! *");
			return dmg;
		}
		else
		return dmg;
	}
}
