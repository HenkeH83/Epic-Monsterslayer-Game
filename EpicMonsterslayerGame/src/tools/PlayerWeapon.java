package tools;
/**
 * Blueprint class for player weapon
 * @author Henrik Hagström
 *
 */
public class PlayerWeapon extends Weapon {
	private int price;
	/**
	 * Constructor for the players weapons that you find in the shop.
	 * @param name
	 * @param maxDmg
	 * @param minDmg
	 * @param price
	 */
	public PlayerWeapon(String name, int maxDmg, int minDmg, int price) {
		super(name, maxDmg, minDmg);
		this.price = price;
	}
	/**
	 * Gives the price of the weapon.
	 * @return
	 */
	public int getPrice(){
		return price;
	}

}
