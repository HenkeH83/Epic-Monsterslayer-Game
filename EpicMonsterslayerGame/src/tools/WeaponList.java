package tools;
import java.util.*;
/**
 * Creates all of the monster weapons in the game. they are put into arrays that then are put into hash maps.
 * @author PC
 *
 */
public class WeaponList {
	/**
	 * Constructor for the weaponsList.
	 */
	public WeaponList(){
		addLvlEleven();
		addLvlTen();
		addLvlNine();
		addLvlEight();
		addLvlSeven();
		addLvlSix();
		addLvlFive();
		addLvlFour();
		addLvlThree();
		addLvlTwo();
		addLvlOne();
		addArrayToMap();
	}


	HashMap<Integer, ArrayList<Weapon>> weaponList = new HashMap<Integer, ArrayList<Weapon>>();
	ArrayList<Weapon> lvlOne = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlTwo = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlThree = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlFour = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlFive = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlSix = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlSeven = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlEight = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlNine = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlTen = new ArrayList<Weapon>();
	ArrayList<Weapon> lvlEleven = new ArrayList<Weapon>();
	
	private void addLvlEleven(){
		lvlEleven.add(new Weapon("Improbabel Sword",12,8));
		lvlEleven.add(new Weapon("Improbabel axe",12,8));
	}
	private void addLvlTen(){
		lvlTen.add(new Weapon("Improbabel Sword",12,8));
		lvlTen.add(new Weapon("Improbabel axe",12,8));
	}
	
	private void addLvlNine(){
		lvlNine.add(new Weapon("Amazing dagger of the void!",11,8));
		lvlNine.add(new Weapon("Amazing sword of the seven suns!",13,9));
		lvlNine.add(new Weapon("Amazing Sledge from the core of the earth!",13,9));
		lvlNine.add(new Weapon("Amazing axe of the sky!",13,10));
		lvlNine.add(new Weapon("Amazing club of bluntness!",13,1));
	}
	
	private void addLvlEight(){
		lvlEight.add(new Weapon("Awesome dagger",10,7));
		lvlEight.add(new Weapon("Awesome sword",12,8));
		lvlEight.add(new Weapon("Awesome war hammer",12,8));
		lvlEight.add(new Weapon("Awesome axe",12,9));
		lvlEight.add(new Weapon("Awesome clubb",12,1));
	}

	private void addLvlSeven(){
		lvlSeven.add(new Weapon("Shiny dagger",9,6));
		lvlSeven.add(new Weapon("Shiny sword",11,7));
		lvlSeven.add(new Weapon("Shiny war hammer",11,7));
		lvlSeven.add(new Weapon("Shiny axe",11,8));
		lvlSeven.add(new Weapon("Shiny club",11,1));
	}
	
	private void addLvlSix(){
		lvlSix.add(new Weapon("Fine looking dagger",8,5));
		lvlSix.add(new Weapon("Fine looking sword",10,6));
		lvlSix.add(new Weapon("Fine looking war hammer",10,6));
		lvlSix.add(new Weapon("Fine looking axe",10,7));
		lvlSix.add(new Weapon("Fine looking club",10,1));
	}

	private void addLvlFive(){
		lvlFive.add(new Weapon("Dagger", 7,4));
		lvlFive.add(new Weapon("Sword", 9, 5));
		lvlFive.add(new Weapon("War Hammer", 9, 5));
		lvlFive.add(new Weapon("Axe", 9, 6));
		lvlFive.add(new Weapon("Club", 9, 1));
	}
	
	private void addLvlFour(){
		lvlFour.add(new Weapon("Rusty dagger", 6,3));
		lvlFour.add(new Weapon("Rusty sword", 8, 4));
		lvlFour.add(new Weapon("Rust covered hammer", 8, 4));
		lvlFour.add(new Weapon("Rusty axe", 8, 5));
		lvlFour.add(new Weapon("Slighty less rotten wooden club", 8, 1));
	}
	
	private void addLvlThree(){
		lvlThree.add(new Weapon("Broken dagger", 5, 2));
		lvlThree.add(new Weapon("Broken sword", 7, 3));
		lvlThree.add(new Weapon("Broken hammer", 7, 3));
		lvlThree.add(new Weapon("Chipped axe", 7, 4));
		lvlThree.add(new Weapon("Rotten wooden club", 7, 2));
	}
	
	private void addLvlTwo(){
		lvlTwo.add(new Weapon("Dull dagger", 4, 2));
		lvlTwo.add(new Weapon("Slighty less shitty sword", 5, 2));
		lvlTwo.add(new Weapon("Dented hammer", 5, 2));
		lvlTwo.add(new Weapon("Poor looking axe", 6, 3));
		lvlTwo.add(new Weapon("Piece of fire wood", 6, 1));
	}
	
	private void addLvlOne(){
		lvlOne.add(new Weapon("Dull dagger", 4, 1));
		lvlOne.add(new Weapon("Shitty sword", 5, 1));
		lvlOne.add(new Weapon("Hammer probably left there by some contractor", 5, 1));
		lvlOne.add(new Weapon("Poorly put together axe",4, 1));
		lvlOne.add(new Weapon("Branch with some leafs still on it",4,1));
	}

	private void addArrayToMap(){
		weaponList.put(1, lvlOne);
		weaponList.put(2, lvlTwo);
		weaponList.put(3, lvlThree);
		weaponList.put(4, lvlFour);
		weaponList.put(5, lvlFive);
		weaponList.put(6, lvlSix);
		weaponList.put(7, lvlSeven);
		weaponList.put(8, lvlEight);
		weaponList.put(9, lvlNine);
		weaponList.put(10, lvlTen);
		weaponList.put(11, lvlEleven);
	}
	/**
	 * Set the weapon based on monster level.
	 * @param lvl
	 * @return a random weapon depending on monster level.
	 */
	public Weapon getWeapon(int lvl){
		return myRandom.randomWeapon(weaponList.get(lvl));		
	}
	
}
