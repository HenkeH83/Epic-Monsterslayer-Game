package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class Skeleton extends Monster {
	/**
	 *  Constructor for the Skeleton.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public Skeleton( int lvl, int strMod, int toughMod){
		super("Skeleton", lvl, strMod, toughMod);
	}
	
	@Override
	public void roar(){
		System.out.println("\n* -\".........\"\n* You notice that the skeleton is trying to speak, you find it quite eerie...");
	}
	
	@Override
	public void deathCry(){
		System.out.println("\n *clattering* \n* as the bones fall into a pile.");
	}

}
