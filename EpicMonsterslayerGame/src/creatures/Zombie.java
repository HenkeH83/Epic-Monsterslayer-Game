package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class Zombie extends Monster {
	/**
	 *  Constructor for the Zombie.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public Zombie(int lvl, int strMod, int toughMod){
		super("Zombie", lvl, strMod, toughMod);
		setWeapon("bottomless hunger for brains!",(lvl+1),(lvl+1));
	}
	
	@Override
	public void roar(){
		System.out.println("\n* -\"Brains... \"");
	}
	
	@Override
	public void deathCry(){
		System.out.println("\n* The Zombies rotting flesh falls of his bones like slow cooked pork.");
	}

}
