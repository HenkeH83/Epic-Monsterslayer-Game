package creatures;

import tools.*;

/**
 * The class that handles everything about the player.
 * @author Henrik Hagström
 * @version 1,0
 * 
 */
public class Player implements Creatures{
	private String name;
	private PlayerWeapon weapon;
	private Amulet amulet;
	private boolean alive;
	private int hp, currentHp, dmgTaken, strength, toughness, xp, nextLvl, lvl,gold, healthPotions;
	
	/**
	 * Constructor for the Player class
	 * 
	 * @param name
	 * User set the name, the rest is set by default.
	 */
	public Player(String name) {
		this.name = name;
		weapon = new PlayerWeapon("Rusty breadknife",5,1,0); //This is Player starter weapon.
		amulet = new Amulet("\"None\"",0,0,0); //This is Player starter amulet.
		healthPotions = 0;
		alive = true;
		hp = 30;
		currentHp = hp;
		strength = 1;
		toughness = 1;
		xp = 0;
		nextLvl = 20;
		lvl = 1;
		gold = 0;
	}
	@Override
	public String status() { 
		return 	"\n* Name: " + name 
				+ "\n* Level: " + lvl 
				+ "\n* Health Points: " + currentHp + "\\" + hp 
				+ "\n* Experience: " + xp + "\\" + nextLvl
				+ "\n* Strength: " + (strength + amulet.getStrength()
				+ "\n* Toughness: " + (toughness + amulet.getToughness())
				+ "\n* Weapon: " + weapon.getName() 
				+ "\n* Amulet: " + amulet.getName()
				+ "\n* Potential damage: " + (strength + weapon.getMinDmg() + amulet.getStrength()) 
						+ " - " + (strength + weapon.getMaxDmg()+ weapon.getMinDmg() + amulet.getStrength()) 
				+ "\n* Gold: " + gold
				+ "\n* Health Potions " + healthPotions
				+ "\n****************************");
	}
	@Override
	public boolean isAlive(){
		return alive = currentHp > 0 ? true : false;
	}
	/**
	 * The "Loot gold" method for the Player class. 
	 * @param gold should be the amount of gold "given" by the monster.
	 */
	public void takeGold(int gold){
		this.gold += gold;
	}
	/**
	 * the "Pay" method for the Player class.
	 * @param gold is the amount an item cost in the shop class.
	 */
	public int giveGold(int gold){
		this.gold -= gold;
		return gold;
	}
	/**
	 * This method sets a new weapon to the Player class.
	 * @param weapon
	 */
	public void newWeapon(PlayerWeapon weapon){
		this.weapon = weapon;		
	}
	/**
	 * This method sets a new amulet to the player.
	 * @param amulet
	 */
	public void newAmulet(Amulet amulet){
		this.amulet = amulet;
	}
	@Override
	public int giveDmg() { 
		return weapon.getDmg() + strength + amulet.getStrength();
	}
	@Override
	public void takeDmg(int dmg){
		if(dmg <= (toughness + amulet.getToughness()))
			dmgTaken = 0;
		else{
		currentHp -= (dmg - (toughness + amulet.getToughness()));
		dmgTaken = (dmg - (toughness + amulet.getToughness()));
		}
	}
	/**
	 * Cunsumes one of the players health potions, healing player for one fifth of total health points.
	 * If the healing should exceed maximun heal points, current health points will be set to maximum health poinsts. 
	 */
	public void drinkPotion(){
		if(healthPotions > 0){
		currentHp += getHp()/5;
		if(currentHp > hp)
			currentHp = hp;
		healthPotions--;
		System.out.println("\n* You healed yourself up to " + getCurrentHp() + " health points.");
		}
		else
			System.out.println("\n* You are out of health potions, go to the store to buy more.");
	}
	/**
	 * A method that handles player experience and leveling.
	 * Including maxLevel/Victory scenario.
	 * @param gaindXp
	 * The gaindXp should be the amount of xp any certain monster gives.  
	 */
	public void lvl(int gaindXp){
		xp+=gaindXp;
		if(xp>=nextLvl){
			lvl++;
			hp += (3 * lvl);
			currentHp = hp;
			nextLvl += (17 * lvl);
			strength++;
			toughness++;
			System.out.println("\n* You have gained enough experience to advance to level "+ lvl + "!"
					+ "\n**************************************************" 
			+ status());			
		}
		else
			System.out.println(status());

	}

	@Override
	public String getName() {
		return name;
	}
	/**
	 * Sets the name for the player, if needed.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Weapon getWeapon(){
		return weapon;
	}
	@Override
	public int getHp() {
		return hp;	
	}
	/**
	 * sets the current health points of the player, if needed.
	 * @param hp
	 */
	public void setCurrentHp(int hp){
		currentHp = hp;
	}
	@Override
	public int getCurrentHp(){
		return currentHp;
	}
	@Override
	public int getDmgTaken(){
		return dmgTaken;
	}
	@Override
	public int getToughness() {
		return toughness;
	}
	@Override
	public int getStrength(){
		return strength;
	}
	/**
	 * get current experience.
	 * @return the amount of experience the player currently has.
	 */
	public int getXp() {
		return xp;
	}
	@Override
	public int getLvl() {
		return lvl;
	}
	/**
	 * the next threshold for player level.
	 * @return level threshold.
	 */
	public int getNextLvl(){
		return nextLvl;
	}
	/**
	 * sets the next threshold for player level, if needed.
	 * @param nextLvl
	 */
	public void setNextLvl(int nextLvl){
		this.nextLvl = nextLvl;
	}
	/**
	 * Gives the current amount of gold the player has.
	 * @return current gold.
	 */
	public int getGold(){
		return gold;
	}
	/**
	 * Checks how many health potions the player currently has.
	 * @return health potions.
	 */
	public int getHealthPotions(){
		return healthPotions;
	}
	/**
	 * Used when buying health potions in Store.
	 */
	public void buyHealthPotion(){
		healthPotions++;
	}
}
