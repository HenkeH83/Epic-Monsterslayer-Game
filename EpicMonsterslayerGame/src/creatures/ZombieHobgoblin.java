package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class ZombieHobgoblin extends Zombie {
	/**
	 *  Constructor for the Zombie hobgoblin.
	 * @param lvl
	 * @param strMod
	 * @param toughMod
	 */
	public ZombieHobgoblin(int lvl, int strMod, int toughMod) {
		super(lvl, strMod, toughMod);
		setName("Zombie Hobgoblin");
	}

}
