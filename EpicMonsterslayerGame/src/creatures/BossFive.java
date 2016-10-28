package creatures;

import restOfTheGame.EnvironmentProgress;
/**
 * The last boss in the game.
 * @author Henrik Hagström
 *
 */
public class BossFive extends Monster implements Boss {
	/**
	 * Constructor for the "Necromancer"
	 */
	public BossFive() {
		super("The Necromancer", 10, 3, 3);
		setWeapon("Devastating Death Magic",14,10);
		setHp(225);	
		setXp(50);
		setGold(100);
	}
	
	@Override
	public void roar(){
		System.out.println("\n* -Join my army of the dead, it is inevitable");
	}

	@Override
	public void deathCry(){
		System.out.println("\n* -This...this cannot be.... AAARRGGHH!!!!!!!!");
	}
	@Override
	public void progress(){
		String bossLine = "\n* It's done! The necromacer is dead, and you're town is safe once again!"
				+ "\n\n**************************************"
				+ "\n*        Congratulations!          *"   
				+ "\n*        You won the game!         *"
				+ "\n**************************************";
		EnvironmentProgress.print(bossLine);
				
		System.exit(0);
	}
}
