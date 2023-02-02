package uk.ac.mmu.advprog.blackjacksim;

/**
 * Simulates games of blackjack en masse so that simple strategies can be evaluated
 * @author K. Welsh
 */
public class BlackJackSim {
	
	private static final int GAMES_TO_RUN = 1000000; //how many games to simulate
	private static final int UPDATES_EVERY = 100000; //how often we should let the user know how its going

	public static void main(String[] args) {
		Game g = new Game();
		
		//set up the results tally
		int draws = 0;
		int[] wins = new int[Game.PLAYERS.length];
		for( int i=0; i<Game.PLAYERS.length; i++) {
			wins[i] = 0;
		}

		//play the game and determine the winner
		for (int i=0; i<GAMES_TO_RUN; i++) {						
			Player winner = g.playGame();			
			
			//update results tally
			if ( winner == null ) { draws++; }
			else {
				for( int j=0; j<Game.PLAYERS.length; j++) {
					if ( winner == Game.PLAYERS[j] ) {
						wins[j]++;
					}
				}
			}
			
			//print the periodic update
			if ( i % UPDATES_EVERY == 0 ) {
				printUpdate(i, draws, wins);
			}
		}
		
		//print final tally
		printUpdate(GAMES_TO_RUN,draws,wins);
	}
	
	/**
	 * Prints an update of the games played and their results
	 * @param gamesPlayed The number of games played
	 * @param draws The number of games drawn
	 * @param wins The number of wins for each Player in the Game class's Players array, in order
	 */
	private static void printUpdate(int gamesPlayed, int draws, int[] wins) {
		String output = "After " + gamesPlayed + " games played,";
		
		for( int i=0; i<wins.length; i++) {
			output += " Player "  + Game.PLAYERS[i].id + " has won " + wins[i] + " games (" + Math.round((double)wins[i] / (double) gamesPlayed * 100) + ")%,";
		}		
		output += " and there have been " + draws + " draws + (" +  Math.round((double)draws / (double) gamesPlayed * 100) + "%).";
		
		System.out.println(output);
	}

}
