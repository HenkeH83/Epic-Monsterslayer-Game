package restOfTheGame;
import creatures.*;

import java.util.Scanner;
/**
 * 	Main class.
 *  It rely ties the room together.
 * @author Henrik Hagström
 * @version 1,0
 *
 */
public class Game {
	/**
	 * The Main method of Epic Monsterslayer Game.
	 * Where it all beginns!
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		String intro = "You grow up in a quiet mountain town, it's a peacful place where nothing ever happens.\n"
				+ "But recently there has been tales of a necromancer in the old ruins outside of town. \n"
				+ "You decide to go out into the fields and save your town!";

		System.out.println("**************************************"
				+ "\n* Welcome to Epic Monsterslayer Game *"
				+ "\n**************************************"
				+ "\n\nEnter a name for your hero to begin!\n");
			Player player = new Player(in.nextLine());
			System.out.println("\n");
			EnvironmentProgress.print(intro);
			System.out.println("\n");
				Town.town(player);
			in.close();
	}

}
