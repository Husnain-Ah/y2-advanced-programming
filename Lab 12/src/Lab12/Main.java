package Lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<PlayerData> playerList = new ArrayList<PlayerData>();
		
		LocalDate p1create = LocalDate.of(2020, 1, 2);
		LocalDate p1last= LocalDate.of(2021, 1, 2);
		PlayerData player1 = new PlayerData("Name", 1, 1, p1create, 10, p1last);
		playerList.add(player1);
		
		LocalDate p2create = LocalDate.of(2020, 1, 2);
		LocalDate p2last= LocalDate.of(2021, 11, 2);
		PlayerData player2 = new PlayerData("Name1", 2, 2, p2create, 10, p2last);
		playerList.add(player2);
		
		LocalDate p3create = LocalDate.of(2020, 1, 2);
		LocalDate p3last= LocalDate.of(2021, 12, 2);
		PlayerData player3 = new PlayerData("Name2", 3, 3, p3create, 10, p3last);
		playerList.add(player3);
		
		LocalDate p4create = LocalDate.of(2020, 1, 2);
		LocalDate p4last= LocalDate.of(2021, 3, 2);
		PlayerData player4 = new PlayerData("Name3", 4, 4, p4create, 10, p4last);
		playerList.add(player4);
		
		LocalDate p5create = LocalDate.of(2020, 1, 2);
		LocalDate p5last= LocalDate.of(2021, 4, 2);
		PlayerData player5 = new PlayerData("Name4", 5, 5, p5create, 10, p5last);
		playerList.add(player5);
		
		LocalDate p6create = LocalDate.of(2020, 1, 2);
		LocalDate p6last= LocalDate.of(2021, 12, 2);
		PlayerData player6 = new PlayerData("Name5", 6, 6, p6create, 10, p6last);
		playerList.add(player6);
		
		LocalDate p7create = LocalDate.of(2020, 1, 2);
		LocalDate p7last= LocalDate.of(2021, 10, 2);
		PlayerData player7 = new PlayerData("Name6", 7, 7, p7create, 10, p7last);
		playerList.add(player7);
		
		LocalDate p8create = LocalDate.of(2020, 1, 2);
		LocalDate p8last= LocalDate.of(2021, 2, 2);
		PlayerData player8 = new PlayerData("Name7", 8, 8, p8create, 10, p8last);
		playerList.add(player8);
		
		LocalDate p9create = LocalDate.of(2020, 1, 2);
		LocalDate p9last= LocalDate.of(2021, 11, 3);
		PlayerData player9 = new PlayerData("Name8", 9, 9, p9create, 10, p9last);
		playerList.add(player9);
		
		LocalDate p10create = LocalDate.of(2020, 1, 2);
		LocalDate p10last= LocalDate.of(2021, 12, 2);
		PlayerData player10 = new PlayerData("Name9", 10, 10, p10create, 10, p10last);
		playerList.add(player10);
		
		
		System.out.println("original list: \n");
		
		for(int i = 0; i < playerList.size(); i++) {
			
			System.out.println(playerList.get(i).getName());
			System.out.println(playerList.get(i).getLevel());
			System.out.println(playerList.get(i).getScore());
			System.out.println(playerList.get(i).getAccountCreationDate());
			System.out.println(playerList.get(i).getTotalPlayTime());
			System.out.println(playerList.get(i).getLastLogin());
			
			System.out.println("\n");
		}
		
		
		Collections.shuffle(playerList);
		
		System.out.println("random list: \n");
		
		for(int i = 0; i < playerList.size(); i++) {
			
			System.out.println(playerList.get(i).getName());
			System.out.println(playerList.get(i).getLevel());
			System.out.println(playerList.get(i).getScore());
			System.out.println(playerList.get(i).getAccountCreationDate());
			System.out.println(playerList.get(i).getTotalPlayTime());
			System.out.println(playerList.get(i).getLastLogin());
			
			System.out.println("\n");
		}
		
		Collections.sort(playerList,);

	
	}
}
