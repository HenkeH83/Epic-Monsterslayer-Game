package creatures;
import java.util.*;
import tools.*;
/**
 * Creates all the monsters in the game. Randomly depending on player level.
 * @author PC
 *
 */
public class MonsterList {
	/**
	 *  Constructor for the MonsterList, creates all of the lists of monster in the game.
	 */
	public MonsterList(){
		addLvlOneMonsters();
		addLvlTwoMonster();
		addLvlThreeMonster();
		addLvlFourMonster();
		addLvlFiveMonster();
		addLvlSixMonster();
		addLvlSevenMonster();
		addLvlEightMonster();
		addLvlNineMonster();
		addLvlTenMonster();
		addLvlElevenMonster();
		mapMonster();
	}
	
	HashMap<Integer, ArrayList<Monster>> monsterMap = new HashMap<Integer, ArrayList<Monster>>();
	ArrayList<Monster> lvlOne = new ArrayList<Monster>();
	ArrayList<Monster> lvlTwo = new ArrayList<Monster>();
	ArrayList<Monster> lvlThree = new ArrayList<Monster>();
	ArrayList<Monster> lvlFour = new ArrayList<Monster>();
	ArrayList<Monster> lvlFive = new ArrayList<Monster>();
	ArrayList<Monster> lvlSix = new ArrayList<Monster>();
	ArrayList<Monster> lvlSeven = new ArrayList<Monster>();
	ArrayList<Monster> lvlEight = new ArrayList<Monster>();
	ArrayList<Monster> lvlNine = new ArrayList<Monster>();
	ArrayList<Monster> lvlTen = new ArrayList<Monster>();
	ArrayList<Monster> lvlEleven = new ArrayList<Monster>();
	/**
	 * Puts all of the monster ArrayList's in the HashMap.
	 */
	private void mapMonster(){
		monsterMap.put(1, lvlOne);
		monsterMap.put(2, lvlTwo);
		monsterMap.put(3, lvlThree);
		monsterMap.put(4, lvlFour);
		monsterMap.put(5, lvlFive);
		monsterMap.put(6, lvlSix);
		monsterMap.put(7, lvlSeven);
		monsterMap.put(8, lvlEight);
		monsterMap.put(9, lvlNine);
		monsterMap.put(10, lvlTen);
		monsterMap.put(11, lvlEleven);
	}
	private void addLvlElevenMonster(){
		lvlEleven.add(new IronGolem(11,2,2));
		lvlEleven.add(new Giant(11,2,2));
	}
	private void addLvlTenMonster(){
		lvlTen.add(new IronGolem(10,2,2));
		lvlTen.add(new Giant(10,2,2));
	}
	/**
	 * Adds monsters to the level nine ArrayList.
	 */
	private void addLvlNineMonster(){
		lvlNine.add(new Giant(9,3,2));
		lvlNine.add(new ZombieOgre(9,1,1));
		lvlNine.add(new IronGolem(9,2,2));
	}
	/**
	 * Adds monsters to the level eight ArrayList.
	 */
	private void addLvlEightMonster(){
		lvlEight.add(new Giant(8,3,2));
		lvlEight.add(new ZombieOrc(8,1,0));
		lvlEight.add(new ZombieOgre(8,1,1));
		lvlEight.add(new FleshGolem(8,2,2));
	}
	/**
	 * Adds monsters to the level seven ArrayList.
	 */
	private void addLvlSevenMonster(){
		lvlSeven.add(new Giant(7,3,2));
		lvlSeven.add(new ZombieHobgoblin(7,0,1));
		lvlSeven.add(new ZombieOrc(7,1,0));
		lvlSeven.add(new ClayGolem(7,2,2));
	}
	/**
	 * Adds monsters to the level six ArrayList.
	 */
	private void addLvlSixMonster(){
		lvlSix.add(new Ogre(6,1,1));
		lvlSix.add(new SkeletonWarrior(6,1,0));
		lvlSix.add(new ZombieHobgoblin(6,0,1));
		lvlSix.add(new Golem(6,2,2));
	}
	/**
	 * Adds monsters to the level five ArrayList.
	 */
	private void addLvlFiveMonster(){
		lvlFive.add(new Orc(5,0,1));
		lvlFive.add(new Ogre(5,2,1));
		lvlFive.add(new SkeletonWarrior(5,0,0));
	}
	/**
	 * Adds monsters to the level four ArrayList.
	 */
	private void addLvlFourMonster(){
		lvlFour.add(new Ogre(4,1,1));
		lvlFour.add(new Orc(4,0,0));
		lvlFour.add(new Zombie(4,0,1));
		lvlFour.add(new Ghoul(4,1,0));
	}
	/**
	 * Adds monsters to the level three ArrayList.
	 */
	private void addLvlThreeMonster(){
		lvlThree.add(new Orc(3,1,1));
		lvlThree.add(new Zombie(3,0,1));
		lvlThree.add(new Ghoul(3,1,0));
	}
	/**
	 * Adds monsters to the level two ArrayList.
	 */
	private void addLvlTwoMonster(){
		lvlTwo.add(new Hobgoblin(2,1,1));
		lvlTwo.add(new Zombie(2,1,0));
		lvlTwo.add(new Ghoul(2,1,0));
	}
	/**
	 * Adds monsters to the level one ArrayList.
	 */
	private void addLvlOneMonsters(){
		lvlOne.add(new Goblin(1, 1, 0));
		lvlOne.add(new Hobgoblin(1,1,1));
		lvlOne.add(new Skeleton(1,0,0));
	}
	/**
	 * Used to get the correct level of monster for the encounter.
	 * @param lvl, takes in the player level as parameter.
	 * @return a randomly generated monster of appropriate level. 
	 */
	public Monster getMonster(int lvl){
		return myRandom.randomMonster(monsterMap.get(lvl));
	}
	
}
