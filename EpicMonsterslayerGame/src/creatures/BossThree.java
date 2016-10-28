package creatures;

import restOfTheGame.EnvironmentProgress;
/**
 * the third boss in the game.
 * @author Henrik Hagström
 *
 */
public class BossThree extends Monster implements Boss{
	/**
	 * Constructor for the third boss.
	 */
	public BossThree() {
		super("Fire Giant", 6, 2, 2);
		setWeapon("Flaming magma boulders",10,7);
		setHp(95);
		setXp(30);
		setGold(40);
	}

	@Override
	public void roar() {
		System.out.println("\n* -BURN!");
	}

	@Override
	public void deathCry() {
		System.out.println("\n* -Nooo, I was promised more.....");
	}
	@Override
	public void progress(){
		String bossLine = "\n* The Fire Giant crumbles into a pile of ash!\n* you walk out into the sunlight, and find yourself at the foot of the Moutains of Doom!";
		EnvironmentProgress.print(bossLine);
	}

}
