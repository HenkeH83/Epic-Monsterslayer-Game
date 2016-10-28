package creatures;
/**
 *  Another specific monster
 * @author Henrik Hagström
 *
 */
public class SkeletonWarrior extends Skeleton {
	 /**
	  *  Constructor for the Skeleton Warrior.
	  * @param lvl
	  * @param strMod
	  * @param toughMod
	  */
	public SkeletonWarrior(int lvl, int strMod, int toughMod) {
		super( lvl, strMod, toughMod);
		setName("Skeleton Warrior");
	}

}
