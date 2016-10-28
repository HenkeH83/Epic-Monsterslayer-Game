package restOfTheGame;

import java.util.Scanner;
import creatures.Player;
import tools.*;
/**
 * Holds all the methods used in store.
 * @author Henrik Hagström
 *
 */
public class Store {
	static Scanner in = new Scanner(System.in);
	static PlayerWeaponList pwl = new PlayerWeaponList();
	static AmuletList al = new AmuletList();
	 static int choice;
	/**
	 * The shop of the game, handles everything shopping related.
	 * @param player
	 */
	public static void store(Player player) {

		System.out.println("\n* Welcome to the shop!\n* What do you need?\n"
				+ "\n> 1. Weapons.\n> 2. Amulets.\n> 3. Potions.\n> 0. Go back out into town.\n\n* Gold coins: " + player.getGold());
		choice = in.nextInt(); in.nextLine();
		if(choice <0 || choice >3){
			System.out.println("The CPU Gnomes does not understand what you're trying to do, try again");
			Store.store(player);
		}
		switch (choice) { 
		case 1:
			Store.weapons(player);
		case 2:
			Store.amulets(player);
		case 3:
			Store.potions(player);
		case 0:
			Town.town(player);
		}
	}
	
	private static void weapons(Player player){
		int weaponCount = 1;
		System.out.println("\n* Weapons available.");
		for (PlayerWeapon pw : pwl.getPlayerWeaponList()) {
			System.out.println("\n* " + weaponCount + ": " + pw.getName() + ": " + pw.getMinDmg() + " - "
					+ (pw.getMaxDmg() + pw.getMinDmg()) + " Damage, " + pw.getPrice() + " gold coins.");
			weaponCount++;
		}
		System.out.println("\n* Which weapon would you like to buy?\n> 0. Browse other items.\n\n* Gold coins: " + player.getGold());
		choice = in.nextInt();
		if (choice == 0)
			Store.store(player);
		else {
			try {
				if (player.getGold() < pwl.getNewWeapon(choice - 1).getPrice()) {
					System.out.println("\n* Not enough gold!");
					Store.store(player);
				} else {
					player.newWeapon(pwl.getNewWeapon(choice - 1));
					player.giveGold(pwl.getNewWeapon(choice - 1).getPrice());
					System.out.println("You purchased a " + pwl.getNewWeapon(choice - 1).getName() + " for "
							+ pwl.getNewWeapon(choice - 1).getPrice() + " gold coins.");
					Store.store(player);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("\n* The CPU Gnomes does not understand what you're trying to do, try again\n");
				Store.store(player);
			}
		}
	}
	
	private static void amulets(Player player){
		int amuletCount = 1;
		System.out.println("\n* Available amulets.\n");
		for (Amulet a : al.getAmuList()) {
			System.out.println("\n* " + amuletCount + ": " + a.getName() + ": +" + a.getStrength()
					+ " in strength and +" + a.getToughness() + " in toughness. " + a.getPrice() + " gold coins.");
			amuletCount++;
		}
		System.out.println("\n* Which Amulet would you like to buy?\n> 0. Browse other items.\n\n* Gold coins: " + player.getGold());
		choice = in.nextInt();
		if (choice == 0)
			Store.store(player);
		else {
			try {
				if (player.getGold() < al.getNewAmulet(choice - 1).getPrice()) {
					System.out.println("Not enough gold!");
					Store.store(player);
				} else {
					player.newAmulet(al.getNewAmulet(choice - 1));
					player.giveGold(al.getNewAmulet(choice - 1).getPrice());
					System.out.println("You purchased a " + al.getNewAmulet(choice - 1).getName() + " for "
							+ al.getNewAmulet(choice - 1).getPrice() + " gold coins.");
					Store.store(player);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("\n* The CPU Gnomes does not understand what you're trying to do, try again\n");
				Store.store(player);
			}
		}
	}
	
	private static void potions(Player player){
		System.out.println("\n* Health potion, 2 gold coins.\n> 1. Buy health potion.\n> 0. Browse other items.\n\n* Gold coins: " + player.getGold());
		choice = in.nextInt();
		if (choice == 1) {
			if (player.getGold() < 2) {
				System.out.println("\n* Not enough gold!");
				Store.store(player);
			} else {
				player.giveGold(2);
				player.buyHealthPotion();
				System.out.println("\n* You purchased a health potion for 3 gold coins!");
				Store.potions(player);
			}
		} else if (choice == 0)
			Store.store(player);
		else {
			System.out.println("\n* The CPU Gnomes does not understand what you're trying to do, try again\n");
			Store.store(player);
		}

	}

}
