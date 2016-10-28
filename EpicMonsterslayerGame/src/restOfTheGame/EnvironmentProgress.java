package restOfTheGame;

import creatures.BossFive;
import creatures.BossFour;
import creatures.BossOne;
import creatures.BossThree;
import creatures.BossTwo;
import creatures.Player;

/**
 * Controles the environment of the game.
 * 
 * @author Henrik Hagström
 *
 */
public class EnvironmentProgress {
	public static int aec = 0; // Adventure Environment Count, naturally :D
	//Texts that print during different  stages in the game.
	private static String hills = "\n* You venture through the rolling hills outside of town.\n";
	private static String goblinKing = "\n* After fighting your way through the fields you hear a loud\n* -Mmm, dinner has arriwed!\n";
	private static String forest = "\n* You walk through the Dark Forest, the air is thick and you feel you're being watched...\n";
	private static String chanex = "\n* At the end of the forest you come to a cave, as soon as you enter, an enormous Spider comes down from the ceiling.\n";
	private static String caves = "\n* You crawl through the caves of Chanex, you can barely see, and all you hear is your own heartbeates.\n";
	private static String fireGiant = "\n* You see a light at the end of the tunnel, but there is a massive silhouette blocking the way...\n";
	private static String doom ="*\n You climb the dangerous Moutain of Doom... you can see the old ruins of the castle at the top.\n";
	private static String GGG = "\n* As you enter the old castle hall, you see a massive structure stand in the middle... it moves as you enter...\n";
	private static String ruins ="*\n You search through the old castle ruins...\n";
	private static String necromancer ="\n* You have reached the pinnacle of the ruins, and there you finnaly encounter the Necromancer!\n* Are you ready?\n";
	/**
	 * The if statements below controls witch environment the player currently
	 * adventures in, and the boss fights.
	 * 
	 * @param player
	 */
	public static void environment(Player player) {
		
		Battle battle = new Battle();
		if (aec < 5) {
			EnvironmentProgress.print(hills);
		} else if (aec == 5) {
			EnvironmentProgress.print(goblinKing);
			battle.bossFight(player, new BossOne());
		} else if (aec > 5 && aec < 10) {
			EnvironmentProgress.print(forest);
		} else if (aec == 10) {
			EnvironmentProgress.print(chanex);
			battle.bossFight(player, new BossTwo());
		} else if (aec > 10 && aec < 15) {
			EnvironmentProgress.print(caves);
		} else if (aec == 15) {
			EnvironmentProgress.print(fireGiant);
			battle.bossFight(player, new BossThree());
		} else if (aec > 15 && aec < 20) {
			EnvironmentProgress.print(doom);
		} else if (aec == 20) {
			EnvironmentProgress.print(GGG);
			battle.bossFight(player, new BossFour());
		} else if (aec > 20 && aec < 25) {
			EnvironmentProgress.print(ruins);
		} else if (aec >= 25) {
			EnvironmentProgress.print(necromancer);
			battle.bossFight(player, new BossFive());
		}
	}
	/**
	 * Prints the givenString slowly across the screen.
	 * @param text
	 */
	public static void print(String text) {
		try {
			for (int i = 0; i < text.length(); i++) {
				System.out.print(text.charAt(i));
				System.out.flush();
				Thread.sleep(25);
			}
		} catch (InterruptedException e) {
			System.out.println(text);

		}
	}
}
