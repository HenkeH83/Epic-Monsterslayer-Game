package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class Golem extends Monster {
	/**
	 * Constructor for the Golem.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public Golem(int lvl, int strMod, int toughMod) {
		super("Golem", lvl, strMod, toughMod);
		setWeapon("set of beautifully sculpted hands",(lvl+3),(lvl+3));
	}
	
	@Override
	public void roar(){
		System.out.println("\n* The golem grunts, it has no words or emotions, so all that comes out is an apathetic:\n* -\"Mmmmmmmmm!\"");
	}
	
	@Override
	public void deathCry(){
		System.out.println("\n* The golem falls to pieces, its job is done.");
	}
}
