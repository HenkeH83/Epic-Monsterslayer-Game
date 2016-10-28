package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class ClayGolem extends Golem {
	/**
	 * Construktor for the clay golem.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public ClayGolem(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Clay Golem");
	}

}
