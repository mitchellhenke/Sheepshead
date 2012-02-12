package mhenke.Sheepshead;

import mhenke.Sheepshead.Card.Rank;
import mhenke.Sheepshead.Card.Suit;
public class Deck {
        public static Card queenClubs = new Card(Suit.Clubs, Rank.Queen, R.drawable.qc, 14, 3);
        public static Card queenSpades = new Card(Suit.Spades, Rank.Queen,R.drawable.qs, 13, 3);
        public static Card queenHearts = new Card(Suit.Hearts, Rank.Queen, R.drawable.qh, 12, 3);
        public static Card queenDiamonds = new Card(Suit.Diamonds, Rank.Queen, R.drawable.qd, 11, 3);

        public static Card jackClubs = new Card(Suit.Clubs, Rank.Jack, R.drawable.jc, 10, 2);
        public static Card jackSpades = new Card(Suit.Spades, Rank.Jack, R.drawable.js, 9, 2);
        public static Card jackHearts = new Card(Suit.Hearts, Rank.Jack, R.drawable.jh, 8, 2);
        public static Card jackDiamonds = new Card(Suit.Diamonds, Rank.Jack, R.drawable.jd, 7, 2);

        public static Card aceClubs = new Card(Suit.Clubs, Rank.Ace, R.drawable.ac, -1, 11);
        public static Card aceSpades = new Card(Suit.Spades, Rank.Ace, R.drawable.as, -1, 11);
        public static Card aceHearts = new Card(Suit.Hearts, Rank.Ace, R.drawable.ah, -1, 11);
        public static Card aceDiamonds = new Card(Suit.Diamonds, Rank.Ace, R.drawable.ad, 6, 11);
        
        public static Card tenClubs = new Card(Suit.Clubs, Rank.Ten, R.drawable.tenc, -2, 10);
        public static Card tenSpades = new Card(Suit.Spades, Rank.Ten, R.drawable.tens, -2, 10);
        public static Card tenHearts = new Card(Suit.Hearts, Rank.Ten, R.drawable.tenh, -2, 10);
        public static Card tenDiamonds = new Card(Suit.Diamonds, Rank.Ten, R.drawable.tend, 5, 10);

        public static Card kingClubs = new Card(Suit.Clubs, Rank.King, R.drawable.kc, -3, 4);
        public static Card kingSpades = new Card(Suit.Spades, Rank.King, R.drawable.ks, -3, 4);
        public static Card kingHearts = new Card(Suit.Hearts, Rank.King, R.drawable.kh, -3, 4);
        public static Card kingDiamonds = new Card(Suit.Diamonds, Rank.King, R.drawable.kd, 4, 4);

        public static Card nineClubs = new Card(Suit.Clubs, Rank.Nine, R.drawable.ninec, -4, 0);
        public static Card nineSpades = new Card(Suit.Spades, Rank.Nine, R.drawable.nines, -4, 0);
        public static Card nineHearts = new Card(Suit.Hearts, Rank.Nine, R.drawable.nineh, -4, 0);
        public static Card nineDiamonds = new Card(Suit.Diamonds, Rank.Nine, R.drawable.nined, 3, 0);

        public static Card eightClubs = new Card(Suit.Clubs, Rank.Eight, R.drawable.eightc, -5, 0);
        public static Card eightSpades = new Card(Suit.Spades, Rank.Eight, R.drawable.eights, -5, 0);
        public static Card eightHearts = new Card(Suit.Hearts, Rank.Eight,R.drawable.eighth, -5, 0);
        public static Card eightDiamonds = new Card(Suit.Diamonds, Rank.Eight, R.drawable.eightd, 2, 0);

        public static Card sevenClubs = new Card(Suit.Clubs, Rank.Seven, R.drawable.sevenc, -6, 0);
        public static Card sevenSpades = new Card(Suit.Spades, Rank.Seven, R.drawable.sevens, -6, 0);
        public static Card sevenHearts = new Card(Suit.Hearts, Rank.Seven, R.drawable.sevenh, -6, 0);
        public static Card sevenDiamonds = new Card(Suit.Diamonds, Rank.Seven, R.drawable.sevend, 1, 0);

        public Deck()
        {
        }
        public static CardList BuildDeck()
        {
        	CardList deck = new CardList();
            deck.clear();
            deck.add(queenClubs);
            deck.add(queenSpades);
            deck.add(queenHearts);
            deck.add(queenDiamonds);
            deck.add(jackClubs);
            deck.add(jackSpades);
            deck.add(jackHearts);
            deck.add(jackDiamonds);
            deck.add(aceClubs);
            deck.add(aceSpades);
            deck.add(aceHearts);
            deck.add(aceDiamonds);
            deck.add(tenClubs);
            deck.add(tenSpades);
            deck.add(tenHearts);
            deck.add(tenDiamonds);
            deck.add(kingClubs);
            deck.add(kingSpades);
            deck.add(kingHearts);
            deck.add(kingDiamonds);
            deck.add(nineClubs);
            deck.add(nineSpades);
            deck.add(nineHearts);
            deck.add(nineDiamonds);
            deck.add(eightClubs);
            deck.add(eightSpades);
            deck.add(eightHearts);
            deck.add(eightDiamonds);
            deck.add(sevenClubs);
            deck.add(sevenSpades);
            deck.add(sevenHearts);
            deck.add(sevenDiamonds);
            return deck;
        }
    }