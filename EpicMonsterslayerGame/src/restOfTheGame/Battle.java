package restOfTheGame;

import java.util.Scanner;
import creatures.*;
import tools.WeaponList;
import tools.myRandom;

/**
 * Handles all the battle aspects of the Epic Monsterslayer Game.
 * 
 * @author Henrik Hagström
 * @version 1,0
 *
 */
public class Battle {
	WeaponList weaponList = new WeaponList();
	MonsterList monsterList = new MonsterList();
	Scanner in = new Scanner(System.in);
	int playerChoice;

	/**
	 * Encounter handles all decisions of an encounter.
	 * 
	 * @param player,
	 *            sends in the player and randomly generate a monster of
	 *            appropriate level.
	 */
	public void encounter(Player player) {
		Monster monster = monsterList.getMonster(player.getLvl());
		EnvironmentProgress.print("\n* You encounter a " + monster.getName() + " armed with a " + monster.getWeapon().getName());
		System.out.println("\n**********************************");
		while (true) {
			System.out.println("\n* What will you do?\n> 1. Fight the " + monster.getName()
					+ "\n> 2. Drink a health potion. \n> 3. Check your status.\n> 4. Check the " + monster.getName()
					+ " status." + "\n> 5. Run away.");
			playerChoice = in.nextInt();
			in.nextLine();
			if (playerChoice < 1 || playerChoice > 5) {
				System.out.println("The CPU Gnomes does not understand what you're trying to do, try again.");
			}
			fight: switch (playerChoice) {
			case 1:
				fight(player, monster);
				break fight;
			case 2:
				player.drinkPotion();
				break fight;
			case 3:
				System.out.println(player.status());
				break fight;
			case 4:
				System.out.println(monster.status());
				break fight;
			case 5: {
				System.out.println("\n* Brave, brave sir " + player.getName() + ", bravely ran away");
				Adventure.adventure(player);
			}

			}
		}

	}

	private void fight(Player player, Monster monster) {
		boolean playerStrike = myRandom.fiftyFifty() == 0 ? true : false;
		if (playerStrike)
			strike(player, monster);
		else {
			if (myRandom.fiftyFifty() == 0)
				monster.roar();
			strike(monster, player);
		}
		System.out.println("\n* " + player.getName() + " HP: " + player.getCurrentHp() + "/" + player.getHp() + "\n* "
				+ monster.getName() + " HP: " + monster.getCurrentHp() + "/" + monster.getHp());

	}

	private void strike(Creatures giver, Creatures reciver) {
		reciver.takeDmg(giver.giveDmg());
		System.out.println(
				"\n* " + giver.getName() + " dealt " + reciver.getDmgTaken() + " damage to " + reciver.getName());
		check(reciver, giver);
		giver.takeDmg(reciver.giveDmg());
		System.out.println(
				"\n* " + reciver.getName() + " dealt " + giver.getDmgTaken() + " damage to " + giver.getName());
		check(giver, reciver);
		System.out.println(
				"\n////////////////////////////////////////////////////////////////////////////////////////////");
	}

	private void check(Creatures target, Creatures pass) {
		if (!target.isAlive()) {
			if (target instanceof Monster) {
				EnvironmentProgress.aec++;
				monsterDeath((Monster) target, (Player) pass);
			} else if (target instanceof Player) {
				System.out.println("\n\n*******************************" + "\n*         GAME OVER           *"
						+ "\n*******************************");
				System.exit(0);
			}
		}
	}

	private void monsterDeath(Monster monster, Player player) {
		System.out.println(
				"\n////////////////////////////////////////////////////////////////////////////////////////////\n");
		if (myRandom.fiftyFifty() == 0)
			monster.deathCry();
		System.out.println("\n* you have slaine the " + monster.getName() + "\n* You gain " + monster.giveXp()
				+ " experience points, and loot " + monster.giveGold() + " gold coins.");
		player.takeGold(monster.giveGold());
		player.lvl(monster.giveXp());
		if (monster instanceof Boss)
			monster.progress();
		Adventure.adventure(player);
	}

	// * Bad programming! I have copied the encounter method and just removed
	// the
	// * random monster parameter to be able to put bosses there instead.
	// * My teacher really should give me a minus for this... and then explain
	// what I should have done.

	public void bossFight(Player player, Boss boss) {
		while (true) {
			System.out.println("\n* What will you do?\n> 1. Fight the " + boss.getName()
					+ "\n> 2. Drink a health potion. \n> 3. Check your status.\n> 4. Check the " + boss.getName()
					+ " status." + "\n> 5. Run away.");
			playerChoice = in.nextInt();
			in.nextLine();
			if (playerChoice < 1 || playerChoice > 5) {
				System.out.println("The CPU Gnomes does not understand what you're trying to do, try again.");
			}
			fight: switch (playerChoice) {
			case 1: {
				fight(player, (Monster) boss);
				break fight;
			}
			case 2:
				player.drinkPotion();
				break fight;
			case 3:
				System.out.println(player.status());
				break fight;
			case 4:
				System.out.println(boss.status());
				break fight;
			case 5: {
				System.out.println("\n* Brave, brave sir " + player.getName() + ", bravely ran away");
				Town.town(player);
			}

			}
		}
	}

}
