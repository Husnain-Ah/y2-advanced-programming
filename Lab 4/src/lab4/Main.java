package lab4;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int health = 40; int combinedStrength = 0;
		String text;
		
		Scanner Input = new Scanner(System.in);
		 
		System.out.println("Are you ready to enter the dungeon? Y/N: ");

	    String a = Input.next();
	    text = a.toUpperCase();
		System.out.println(text);
		Input.close();
		
		MonsterGame game = new MonsterGame();  
		
		if (text == "Y") {
			String fightCount = "Y";
			
			 do {
				Scanner fight = new Scanner(System.in);
				System.out.println("Do you want to fight the monster in front of you? Y/N: ");
				String x = Input.next();
			    fightCount = x.toUpperCase();
				
				fight.close();
				
				Monster b = game.chooseRandomMonster();
				String bName = b.getMonsterName();
				int bDamage = b.getMonsterStrength();
				combinedStrength += bDamage;

				System.out.println("You have fought a " + bName + ".");
			} while (fightCount == "Y");
				
			int life = (health - combinedStrength);
			System.out.println("Your total health after fighting is " + life + ".");
			
			if (life <= 0) {
				System.out.println("You died, try again.");
			}
			else if (life > 0) {
				System.out.println("You won, woohoo!");
				System.out.println("Your total score was " + combinedStrength + ", good job champ!");
			}
			
			
		}
		else if (text == "N") {
			System.out.println("Come back again when you are ready to enter.");
		}
		else {
			System.out.println("Your input was not valid, next time enter either 'Y' or 'N' ");
		}
		 
		 
	}

}
