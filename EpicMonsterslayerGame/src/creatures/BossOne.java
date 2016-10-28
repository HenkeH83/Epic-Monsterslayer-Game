package creatures;

import restOfTheGame.EnvironmentProgress;
/**
 * The first boss in the game.
 * @author Henrik Hagström
 *
 */
public class BossOne extends Monster implements Boss {
	/**
	 * Constructor for the first boss.
	 */
	public BossOne() {
		super("The Goblin King", 2, 1, 1);
		setWeapon("A minor pine tree, still pretty big though!",6,4);
		setHp(25);
		setXp(10);
		setGold(20);
	}
	@Override
	public void roar(){
		System.out.println( "\n* -Stand still so I can crush you");
	}
	@Override
	public void deathCry(){
		System.out.println("\n* -What is this? My guts? but.....");
	}
	@Override
	public void progress(){
		String bossLine = "\n* The Goblin King falls down.\n* And you may now continue to the Dark Forest!";
		EnvironmentProgress.print(bossLine);
	}

}
