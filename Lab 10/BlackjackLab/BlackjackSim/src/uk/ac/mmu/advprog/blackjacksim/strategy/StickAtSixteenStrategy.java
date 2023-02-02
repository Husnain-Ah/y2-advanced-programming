package uk.ac.mmu.advprog.blackjacksim.strategy;
import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class StickAtSixteenStrategy implements PlayerStrategy {
	@Override
	public boolean willHit(Card[] hand) {
		if ( Game.scoreHand(hand) >= 16 ) { return false; /*stick*/ }
		else { return true; /*hit*/ }
	}

	/**
	 * This method is called at the start of each new game, but is unused in this strategy
	 */
	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method is called each time the deck is shuffled, but is unused in this strategy
	 */
	@Override
	public void deckShuffled() {
		// TODO Auto-generated method stub
		
	}

}









	