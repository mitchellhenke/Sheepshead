package mhenke.Sheepshead;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Card{
    public enum Suit { Clubs, Spades, Hearts, Diamonds };
    public enum Rank { Seven, Eight, Nine, King, Ten, Ace, Jack, Queen };
    
    public Suit Suit;
    public Rank Rank;
	public int ImageId;
    public int TrumpValue;
    public int PointValue;

    public Card(Suit suit, Rank rank, int resourceId, int trumpVal, int pointVal)
    {
    	Suit = suit;
    	Rank = rank;
    	ImageId = resourceId;
    	TrumpValue = trumpVal;
    	PointValue = pointVal;
    }
    
    public Suit getSuit() {
		return Suit;
	}

	public void setSuit(Suit suit) {
		Suit = suit;
	}

	public Rank getRank() {
		return Rank;
	}

	public void setRank(Rank rank) {
		Rank = rank;
	}

	public int getImageId() {
		return ImageId;
	}

	public void setCardImage(int imageId) {
		ImageId = imageId;
	}

	public int getTrumpValue() {
		return TrumpValue;
	}

	public void setTrumpValue(int trumpValue) {
		TrumpValue = trumpValue;
	}

	public int getPointValue() {
		return PointValue;
	}

	public void setPointValue(int pointValue) {
		PointValue = pointValue;
	}
    
    public boolean IsTrump()
    {
        if (getSuit() == Suit.Diamonds || getRank() == Rank.Queen || getRank() == Rank.Jack)
        {
            return true;
        }
        else return false;
    }
}
