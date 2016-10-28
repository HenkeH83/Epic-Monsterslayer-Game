package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class Ghoul extends Monster {
	/**
	 * Constructor for the Ghoul.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public Ghoul(int lvl, int strMod, int toughMod){
		super("Ghoul", lvl, strMod, toughMod);
		setWeapon("set of sharp claws", (lvl+2), (lvl+2));
	}
	
	@Override
	public void roar(){
		System.out.println("\n* The ghoul snarles at you:\n* -\"I'll rip the flesh of your bones!\"");
	}
	
	@Override
	public void deathCry(){
		System.out.println("\n* The ghoul turns around and tries to run away,"
				+ " but his body is to damaged to move properly, and you strike him down with ease.");
	}

}
