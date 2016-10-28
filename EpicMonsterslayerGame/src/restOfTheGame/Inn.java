package restOfTheGame;

import creatures.Player;
/**
 * The class that holds the Inn in town.
 * @author Henrik Hagström
 *
 */
public class Inn {

	/**
	 * The inn, basic shit. The player rests and gets healed.
	 * 
	 * @param player
	 */
	public static void inn(Player player) {
		System.out.println("\n* You rest for the night\n***************************************");
		try {
			for(int i=0; i < 4; i++){
			System.out.println("\"zZz\"");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		player.setCurrentHp(player.getHp());
		System.out.println("\n* You have been fully healed.");
		Town.town(player);
	}

}
