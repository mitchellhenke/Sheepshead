package mhenke.Sheepshead;

import java.util.ArrayList;

import mhenke.Sheepshead.Card.Rank;
import mhenke.Sheepshead.Card.Suit;

public class CardList extends ArrayList<Card> {

	public int getNumTrump() {
		int numTrump = 0;
		for (Card c : this) {
			if (c.getSuit() == Suit.Diamonds || c.getRank() == Rank.Jack
					|| c.getRank() == Rank.Queen)
				numTrump++;
		}
		return numTrump;
	}

	public int getNumClubs() {
		int numClubs = 0;
		for (Card c : this) {
			if ((c.Suit == Suit.Clubs)
					&& !(c.Rank == Rank.Queen || c.Rank == Rank.Jack)) {
				numClubs++;
			}
		}
		return numClubs;
	}

	public int getNumSpades() {
		int numSpades = 0;
		for (Card c : this) {
			if ((c.Suit == Suit.Spades)
					&& !(c.Rank == Rank.Queen || c.Rank == Rank.Jack)) {
				numSpades++;
			}
		}
		return numSpades;
	}

	public int getNumHearts() {
		int numHearts = 0;
		for (Card c : this) {
			if ((c.Suit == Suit.Hearts)
					&& !(c.Rank == Rank.Queen || c.Rank == Rank.Jack)) {
				numHearts++;
			}
		}
		return numHearts;
	}
	
	public boolean containsTrump()
	{
		return getNumTrump() > 0;
	}
	
	public int getTotalPoints()
	{
		int totalPoints = 0;
		for(Card c: this){
			totalPoints+= c.getPointValue();
		}
		return totalPoints;
	}
}
