package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class IronGolem extends Golem {
	/**
	 * Constructor for the Iron Golem.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public IronGolem(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Iron Golem");
	}

}
