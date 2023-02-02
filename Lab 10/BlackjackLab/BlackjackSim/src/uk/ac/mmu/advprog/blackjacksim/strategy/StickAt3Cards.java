package uk.ac.mmu.advprog.blackjacksim.strategy;
import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class StickAt3Cards implements PlayerStrategy {
	/**
	 * Decides if, given the state of the player's hand, they would like to draw another card
	 * This implementation hits if there is less than 3 cards in the hand
	 * @param hand The player's current hand of cards
	 * @return true if they would like another card ("hit"), false if not ("stick")
	 */
	@Override
	public boolean willHit(Card[] hand) {
		if (hand.length >= 3) { 
			return false; /*stick*/ 
		}
		else {
			return true;
		}
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
