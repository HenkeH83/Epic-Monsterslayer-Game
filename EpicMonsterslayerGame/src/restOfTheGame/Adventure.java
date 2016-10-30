package restOfTheGame;

import java.util.Scanner;

import creatures.Player;
import tools.myRandom;
/**
 * Contains all of the adventuring methods
 * @author PC
 *
 */
public class Adventure {
	static Scanner in = new Scanner(System.in);
	/**
	 * Thw "Main" class of the adventure class.
	 * @param player, guides the player though the game.
	 */
	public static void adventure(Player player) {
		Battle battle = new Battle();
		// Start of adventure meny.
		EnvironmentProgress.environment(player);
		System.out.println(
				"\n* What do you do?\n----------------------\n> 1. Keep exploring.\n> 2. Go back to town.\n> 3. Check your status.");
		int choice = in.nextInt();
		if (choice < 1 || choice > 3) {
			System.out.println("\n* The CPU Gnomes does not understand what you're trying to do, try again.\n");
			Adventure.adventure(player);
		}
		switch (choice) {
		case 1: {
			if (myRandom.tenPercent() == 0) {
				EnvironmentProgress.print("\n* Nothing happens, and you venture on...");
				Adventure.adventure(player);
			} else
				battle.encounter(player);
		}
		case 2:
			Town.town(player);
		case 3: {
			System.out.println(player.status());
			Adventure.adventure(player);
		}
		}

	}

}
