package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class ZombieOgre extends Zombie {
	/**
	 *  Constructor for the Zombie ogre.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public ZombieOgre(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Zombie Ogre");
	}

}
