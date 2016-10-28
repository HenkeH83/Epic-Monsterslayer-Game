package tools;

import java.util.ArrayList;
/**
 * Creates all the amulets and puts then in arrays
 * @author Henrik Hagström
 *
 */
public class AmuletList {

	ArrayList<Amulet> amList = new ArrayList<Amulet>();
	/**
	 * Constructor for the ArrayList of amulets.
	 */
	public AmuletList(){
		amList.add(new Amulet("Amulet of Strength +1",1,0,10));
		amList.add(new Amulet("Amulet of toughness +1",0,1,10));
		amList.add(new Amulet("Amulet of Strength +2",2,0,50));
		amList.add(new Amulet("Amulet of toughness +2",0,2,50));
		amList.add(new Amulet("Amulet of Strength +3",3,0,100));
		amList.add(new Amulet("Amulet of toughness +3",0,3,100));
		amList.add(new Amulet("Amulet of awesome +1",1,1,100));
		amList.add(new Amulet("Amulet of awesome +2",2,2,200));
		amList.add(new Amulet("Amulet of awesome +3",3,3,300));
	}

	/**
	 * Passes the arayList on.
	 * @return the amulet arrayList.
	 */
	public ArrayList<Amulet> getAmuList(){
		return amList;
	}
	/**
	 * gets the amulet at the index.
	 * @param index
	 * @return amulet at index.
	 */
	public Amulet getNewAmulet(int index){
		return amList.get(index);
	}

}
