package tools;
/**
 * The blueprint class for amulets
 * @author Henrik Hagström
 *
 */
public class Amulet {
	private String name;
	private int strengthMod, toughnessMod, price;
	/**
	 * Cnstructor for the amulets.
	 * @param name
	 * @param str
	 * @param toughness
	 * @param price
	 */
	public Amulet(String name, int str, int toughness, int price){
		this.name = name;
		strengthMod = str;
		toughnessMod = toughness;
		this.price = price;
	}
	/**
	 * Gets the name of the amulet.
	 * @return name.
	 */
	public String getName(){
		return name;
	}
	/**
	 * Gets the strength modifier of the amulet.
	 * @return the amount of strength that the amulet increases. 
	 */
	public int getStrength(){
		return strengthMod;
	}
	/**
	 * Gets the toughness modifier of the amulet.
	 * @return the amount of toughness that the amulet increases.
	 */
	public int getToughness(){
		return toughnessMod;
	}
	/**
	 * Shows what the amulet costs.
	 * @return the price for the amulet.
	 */
	public int getPrice(){
		return price;
	}
	
}