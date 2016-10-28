package restOfTheGame;

import java.util.Scanner;
import creatures.Player;
/**
 * Class for the hub area "Town"
 * @author Henrik Hagström
 *
 */
public class Town {
	static Scanner in = new Scanner(System.in);
	/**
	 * Starting position for the player, acts as a hub in tha game.
	 * @param player
	 */
	public static void town(Player player){		
		System.out.println("* You're in town."
				+ "\n* What do you wish to do?"
				+ "\n*------------------------------"
				+ "\n> 1. Go adventure."
				+ "\n> 2. Go to the store."
				+ "\n> 3. Rest at the inn."
				+ "\n> 4. View your stats."
				+ "\n> 5. Read instructions."
				+ "\n> 6. Walk away..."
				+ "\n********************************************************");
		int choice = in.nextInt();in.nextLine();
		if(choice <1 || choice >6){
			System.out.println("The CPU Gnomes does not understand what you're trying to do, try again");
			town(player);
		}
		switch(choice){
		case 1: Adventure.adventure(player);
		case 2: Store.store(player);
		case 3: Inn.inn(player);
		case 4: System.out.println(player.status()); town(player);
		case 5: info(player);
		case 6: EnvironmentProgress.print("You walk into the sunset, happy to leave it all behind."); System.exit(0);
		}
	}
	
	private static void info(Player player){
		System.out.println("\n* Instructions:\n\n* Damage:\n     * A characters strength is always added to the weapon damage.\n"
				+ "     * And characters have all there incomming damage reduced by there toughness,\n"
				+ "     * If the incomming damage is equal to, or lower then a characters toughness,they recive zero damage.\n"
				+ "     * All weapons can make critical hits, this doubles the weapon damage given, "
				+ "before the characters strength is added.\n"
				+ "     * The \"Damage\" structure is the same for both players and monsters.\n"
				+ "\n* Healing:\n     * If you need to heal up between fights, rest a night at the inn.\n"
				+ "     * A warm bed can make wounders!\n     * If you need to heal during fights, drink a health potion!\n"
				+ "     * You can find them at the store, they are your leverage against the monsters.\n"
				+ "     * ....who sadly don't have a store so they can't buy any.\n\n     * Good luck!\n");
		Town.town(player);
	}
}
