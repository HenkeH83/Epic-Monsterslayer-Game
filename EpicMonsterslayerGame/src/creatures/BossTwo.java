package creatures;

import restOfTheGame.EnvironmentProgress;
/**
 * The second boss in the game.
 * @author Henrik Hagström
 *
 */
public class BossTwo extends Monster implements Boss {
	/**
	 * Constructor for the second boss.
	 */
	public BossTwo() {
		super("Chanex the spider", 4, 1, 1);
		setWeapon("Massive Fangs", 8, 5);
		setHp(50);
		setXp(20);
		setGold(30);
	}

	@Override
	public void roar() {
		System.out.println("\n* -I'll eat you alive");
	}

	@Override
	public void deathCry() {
		System.out.println("\n*Splaf*");
	}

	@Override
	public void progress() {
		String bossLine = "\n* The stench of Chanex dead bodie makes your stomach turn.\n* But you continue on into the caves.";
		EnvironmentProgress.print(bossLine);
	}
}
