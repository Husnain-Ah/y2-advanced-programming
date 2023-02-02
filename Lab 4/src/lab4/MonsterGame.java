package lab4;

import java.util.ArrayList;
import java.util.Random;

public class MonsterGame {
	
	ArrayList<Monster> monsterList = new ArrayList<Monster>();
	
	public MonsterGame() {
		Monster m1 = new Monster();
		m1.setMonsterName("Dragon");
		m1.setMonsterStrength(10);
		
		Monster m2 = new Monster();
		m2.setMonsterName("Witch");
		m2.setMonsterStrength(8);
		
		Monster m3 = new Monster();
		m3.setMonsterName("Witch");
		m3.setMonsterStrength(8);
		
		Monster m4 = new Monster();
		m4.setMonsterName("Goblin");
		m4.setMonsterStrength(5);
		
		Monster m5 = new Monster();
		m5.setMonsterName("Goblin");
		m5.setMonsterStrength(5);
		
		Monster m6 = new Monster();
		m6.setMonsterName("Goblin");
		m6.setMonsterStrength(5);
		
		Monster m7 = new Monster();
		m7.setMonsterName("Skeleton");
		m7.setMonsterStrength(2);
		
		Monster m8 = new Monster();
		m8.setMonsterName("Skeleton");
		m8.setMonsterStrength(2);
		
		Monster m9 = new Monster();
		m9.setMonsterName("Skeleton");
		m9.setMonsterStrength(2);
		
		Monster m10 = new Monster();
		m10.setMonsterName("Skeleton");
		m10.setMonsterStrength(2);
	}

	public Monster chooseRandomMonster() {
		Random rand = new Random(); //instance of random class
	    int upperbound = 10;
	    //generate random values from 0-10
	    int int_random = rand.nextInt(upperbound); 
		
	    Monster temp = (Monster) monsterList.get(int_random);
	    monsterList.remove(temp);
	      
		return temp;
	}

      

}

