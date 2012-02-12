package mhenke.Sheepshead;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	public Player winner = new Player(false, "Winner", null, null);
    public Player tempWinner = new Player(false, "Temp Winner", null, null);
    public Player lead = new Player(false, "Lead", null, null);
    public Player picker = new Player(false, "Picker", null, null);
    public Player dealer = new Player(false, "Dealer", null, null);
    public Player blind = new Player(false, "Blind", null, null);

    public Player player1;
    public Player player2;
    public Player player3;
    public Player player4;
    
	public CardList allPlayedCards = new CardList();
    public CardList playedCards = new CardList();
    public ArrayList<Player> pList = new ArrayList<Player>();
    public Card playedCard;
    
    public Game(Player p1, Player p2, Player p3, Player p4)
    {
        player1 = p1;
        player2 = p2;
        player3 = p3;
        player4 = p4;

        winner.setGame(this);
        tempWinner.setGame(this);
        lead.setGame(this);
        picker.setGame(this);
        dealer.setGame(this);
        blind.setGame(this);
        pList.add(player1);
        pList.add(player2);
        pList.add(player3);
        pList.add(player4);
    }
    
    public void deal()
    {
        blind.getHand().clear();
        allPlayedCards.clear();
        for (Player player: pList)
        {
            player.getHand().clear();
            player.getHandsWon().clear();
            playedCard = null;
            playedCards.clear();
            player.setPicker(false);
        }

        Random rand = new Random();
        //Build Deck
        CardList deck = Deck.BuildDeck();
        while (deck.size() > 4)
        {
            int deal = rand.nextInt(deck.size());
            if (!deck.get(deal).equals((null))) player1.getHand().add(deck.get(deal)); deck.remove(deal);

            deal = rand.nextInt(deck.size());
            if (!deck.get(deal).equals((null))) player2.getHand().add(deck.get(deal)); deck.remove(deal);

            deal = rand.nextInt(deck.size());
            if (!deck.get(deal).equals((null))) player3.getHand().add(deck.get(deal)); deck.remove(deal);

            deal = rand.nextInt(deck.size());
            if (!deck.get(deal).equals((null))) player4.getHand().add(deck.get(deal)); deck.remove(deal);
        }
        while (deck.size() > 0)
        {
        	int deal = rand.nextInt(deck.size());
        	if (!deck.get(deal).equals((null))) player4.getHand().add(deck.get(deal)); deck.remove(deal);
        }
        //player1.organizeHand();
        //player2.organizeHand();
        //player3.organizeHand();
        //player4.organizeHand();
    }
    
    
}
