package tools;
import creatures.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * A class that uses the java util random class to create various random scenarios 
 * that may occur in the Epic Monsterslayer Game. 
 * @author Henrik Hagström
 *
 */
public class myRandom {
	private static Random random = new Random();
	/**
	 * Takes an arrayList of monsters and chose one random monster.
	 * @param list
	 * @return random monster.
	 */
	public static Monster randomMonster(ArrayList<Monster> list){
		return list.get(random.nextInt(list.size()));
	}
	/**
	 * Takes an arrayList of weapons and chose one at random.
	 * @param list
	 * @return random weapon.
	 */
	public static Weapon randomWeapon(ArrayList<Weapon> list){
		return list.get(random.nextInt(list.size()));
	}
	/**
	 * 
	 * @return Random number between 0 - 9.
	 */
	public static int tenPercent(){
		return random.nextInt(10);
	}
	/**
	 * It's one or the other, your choice.
	 * @return 1 or 0.
	 */
	public static int fiftyFifty(){
		return random.nextInt(2);
	}
	/**
	 * Used to set weapon damage.
	 * @param max is max damage -min damage.
	 * @param min is the minimum amount of damage that the weapon can generate.
	 * @return a random number between min and (max + min).
	 */
	public static int randomMaxMin(int max, int min){
		return random.nextInt(max) + min;
	}
	
}
