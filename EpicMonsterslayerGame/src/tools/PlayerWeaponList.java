package tools;

import java.util.ArrayList;
/**
 * Creates all of the player weapons and puts them into arrays.
 * @author PC
 *
 */
public class PlayerWeaponList {
	ArrayList<PlayerWeapon> playerWeaponList = new ArrayList<PlayerWeapon>();
	/**
	 * Constructor for the players weapons list.
	 */
	public PlayerWeaponList(){
		playerWeaponList.add( new PlayerWeapon("Tiny hammer",6,2,5));
		playerWeaponList.add( new PlayerWeapon("Short sword",7,3,10));
		playerWeaponList.add( new PlayerWeapon("Simple axe",8,5,15));
		playerWeaponList.add( new PlayerWeapon("Big bad club",9,3,20));
		playerWeaponList.add( new PlayerWeapon("Long sword",10,6,30));
		playerWeaponList.add( new PlayerWeapon("Woodsplitter axe",10,7,50));
		playerWeaponList.add( new PlayerWeapon("Awesome sword!",12,8,75));
		playerWeaponList.add( new PlayerWeapon("The tripple H \"Hard Hitting Hammer\"",13,9,100));
		playerWeaponList.add( new PlayerWeapon("Thunder axe!",15,11,150));
		playerWeaponList.add( new PlayerWeapon("Overdimensioned sword",17,13,200));
		playerWeaponList.add( new PlayerWeapon("The sledge!",20,16,300));
	}

	/**
	 * send the arrayList containing player weapons on. 
	 * @return the player weapon arrayList.
	 */
	public ArrayList<PlayerWeapon> getPlayerWeaponList(){
		return playerWeaponList;
	}
	/**
	 * Gets the weapon at index.
	 * @param index
	 * @return the weapon at index.
	 */
	public PlayerWeapon getNewWeapon(int index){
		return playerWeaponList.get(index);
	}

	
}
