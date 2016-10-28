package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class FleshGolem extends Golem {
	/**
	 * Constructor for the Flesh Golem.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public FleshGolem(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Fleash Golem");
	}

}
