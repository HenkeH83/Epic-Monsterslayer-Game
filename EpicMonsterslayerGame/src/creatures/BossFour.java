package creatures;

import restOfTheGame.EnvironmentProgress;
/**
 * Boss four in the game.
 * @author Henrik Hagström
 *
 */
public class BossFour extends Monster implements Boss {
	/**
	 * Constructor for the fourth boss.
	 */
	public BossFour() {
		super("GGG \"Giant Gardian Golem\"", 8, 2, 2);
		setWeapon("The biggest hands you ever saw",12,9);
		setHp(150);
		setXp(40);
		setGold(50);
	}
	@Override
	public void roar(){
		System.out.println( "\n*  >(");
	}
	@Override
	public void deathCry(){
		System.out.println("\n*  :(");
	}
	@Override
	public void progress(){
		
		String bossLine = "\n* The Fire Giant crumbles into a pile of ash!\n* you walk out into the sunlight, and find yourself at the foot of the Moutains of Doom!";
		EnvironmentProgress.print(bossLine);		
	}
}
