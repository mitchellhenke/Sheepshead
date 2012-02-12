package mhenke.Sheepshead;

import android.widget.TextView;

public class Player {

	private Game Game;
	private String Name;
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	private CardList Hand = new CardList();
	private CardList HandsWon = new CardList();
    private boolean Picker = false;
    private boolean Player = false;
    private int PlayerPoints = 0;


	public boolean isPicker() {
		return Picker;
	}

	public void setPicker(boolean picker) {
		Picker = picker;
	}

	public boolean isPlayer() {
		return Player;
	}
	
	public void organizeHand()
	{

        if (Hand.contains(Deck.sevenClubs)) { Hand.add(Deck.sevenClubs); }
        if (Hand.contains(Deck.eightClubs)) { Hand.add(Deck.eightClubs); }
        if (Hand.contains(Deck.nineClubs)) { Hand.add(Deck.nineClubs); }
        if (Hand.contains(Deck.kingClubs)) { Hand.add(Deck.kingClubs); }
        if (Hand.contains(Deck.tenClubs)) { Hand.add(Deck.tenClubs); }
        if (Hand.contains(Deck.aceClubs)) { Hand.add(Deck.aceClubs); }

        if (Hand.contains(Deck.sevenSpades)) { Hand.add(Deck.sevenSpades); }
        if (Hand.contains(Deck.eightSpades)) { Hand.add(Deck.eightSpades); }
        if (Hand.contains(Deck.nineSpades)) { Hand.add(Deck.nineSpades); }
        if (Hand.contains(Deck.kingSpades)) { Hand.add(Deck.kingSpades); }
        if (Hand.contains(Deck.tenSpades)) { Hand.add(Deck.tenSpades); }
        if (Hand.contains(Deck.aceSpades)) { Hand.add(Deck.aceSpades); }

        if (Hand.contains(Deck.sevenHearts)) { Hand.add(Deck.sevenHearts); }
        if (Hand.contains(Deck.eightHearts)) { Hand.add(Deck.eightHearts); }
        if (Hand.contains(Deck.nineHearts)) { Hand.add(Deck.nineHearts); }
        if (Hand.contains(Deck.kingHearts)) { Hand.add(Deck.kingHearts); }
        if (Hand.contains(Deck.tenHearts)) { Hand.add(Deck.tenHearts); }
        if (Hand.contains(Deck.aceHearts)) { Hand.add(Deck.aceHearts); }

        if (Hand.contains(Deck.sevenDiamonds)) { Hand.add(Deck.sevenDiamonds); }
        if (Hand.contains(Deck.eightDiamonds)) { Hand.add(Deck.eightDiamonds); }
        if (Hand.contains(Deck.nineDiamonds)) { Hand.add(Deck.nineDiamonds); }
        if (Hand.contains(Deck.kingDiamonds)) { Hand.add(Deck.kingDiamonds); }
        if (Hand.contains(Deck.tenDiamonds)) { Hand.add(Deck.tenDiamonds); }
        if (Hand.contains(Deck.aceDiamonds)) { Hand.add(Deck.aceDiamonds); }
        if (Hand.contains(Deck.jackDiamonds)) { Hand.add(Deck.jackDiamonds); }
        if (Hand.contains(Deck.jackHearts)) { Hand.add(Deck.jackHearts); }
        if (Hand.contains(Deck.jackSpades)) { Hand.add(Deck.jackSpades); }
        if (Hand.contains(Deck.jackClubs)) { Hand.add(Deck.jackClubs); }
        if (Hand.contains(Deck.queenDiamonds)) { Hand.add(Deck.queenDiamonds); }
        if (Hand.contains(Deck.queenHearts)) { Hand.add(Deck.queenHearts); }
        if (Hand.contains(Deck.queenSpades)) { Hand.add(Deck.queenSpades); }
        if (Hand.contains(Deck.queenClubs)) { Hand.add(Deck.queenClubs); }

        for (int i = 0; i < Hand.size(); i++)
        {
            Hand.remove(0);
        }
	}

	public void setPlayer(boolean player) {
		Player = player;
	}

	public int getPlayerPoints() {
		return PlayerPoints;
	}

	public void setPlayerPoints(int playerPoints) {
		PlayerPoints = playerPoints;
	}

	public CardList getHand() {
		return Hand;
	}

	public void setHand(CardList hand) {
		Hand = hand;
	}

	public CardList getHandsWon() {
		return HandsWon;
	}

	public void setHandsWon(CardList handsWon) {
		HandsWon = handsWon;
	}

	private Game getGame() {
		return Game;
	}

	public void setGame(Game game) {
		Game = game;
	}

	public Player(boolean player, String name, Game game, TextView textview) {
			setPlayer(player);
			setName(name);
			setGame(game);
			
	}
	
	
}
