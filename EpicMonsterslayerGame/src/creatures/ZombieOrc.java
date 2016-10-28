package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class ZombieOrc extends Zombie {
	/**
	 *  Constructor for the Zombie orc.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public ZombieOrc(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Zombie Orc");
	}

}
