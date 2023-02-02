package Lab12;

import java.time.LocalDate;

public class PlayerData { //variables
	String name; int level; int score; LocalDate creation; int playtime; LocalDate last;
	
	//constructor
		public PlayerData(){
			
		}
		
		public PlayerData(String name, int level, int score, LocalDate creation, int playtime, LocalDate last){
			this.name = name; this.level = level; this.score = score;
			this.creation = creation; this.playtime = playtime; this.last = last;
		}
	
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getScore() {
		return score;
	}
	
	public LocalDate getAccountCreationDate() {
		return creation;
	}
	
	public int getTotalPlayTime() {
		return playtime;
	}
	
	public LocalDate getLastLogin() {
		return last;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setAccountCreationDate(LocalDate creation) {
		this.creation = creation;
	}
	
	public void setTotalPlayTime(int playtime) {
		this.playtime = playtime;
	}
	
	public void setLastLogin(LocalDate last) {
		this.last = last;
	}
	
	
}
