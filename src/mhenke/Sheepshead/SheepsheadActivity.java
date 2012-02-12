package mhenke.Sheepshead;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SheepsheadActivity extends Activity 
{
	
	ImageView o1c1Img;
	ImageView o1c2Img;
	ImageView o1c3Img;
	ImageView o1c4Img;
	ImageView o1c5Img;
	ImageView o1c6Img;
	ImageView o1c7Img;
	ImageView o1c8Img;
	ImageView o1c9Img;
	ImageView o1c10Img;
	ImageView o1c11Img;
	private Game game;
	private Player player1 = new Player(false, "Player 1", game, null);
	private Player player2 = new Player(false, "Player 2",game,null);
	private Player player3 = new Player(false, "Player 3", game, null);
	private Player player4 = new Player(false, "Player 4",game,null);
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        if(game == null)
        {
        	game = new Game(player1,player2,player3,player4);
        }
        
		o1c1Img = (ImageView) findViewById(R.id.p1c1);
		o1c2Img = (ImageView) findViewById(R.id.p1c2);
		o1c3Img = (ImageView) findViewById(R.id.p1c3);
		o1c4Img = (ImageView) findViewById(R.id.p1c4);
		o1c5Img = (ImageView) findViewById(R.id.p1c5);
		o1c6Img = (ImageView) findViewById(R.id.p1c6);
		o1c7Img = (ImageView) findViewById(R.id.p1c7);
		o1c8Img = (ImageView) findViewById(R.id.p1c8);
		o1c9Img = (ImageView) findViewById(R.id.p1c9);
		o1c10Img = (ImageView) findViewById(R.id.p1c10);
		o1c11Img = (ImageView) findViewById(R.id.p1c11);
		o1c1Img.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Close the application
				game.deal();
				game.player1.organizeHand();
				o1c1Img.setImageResource(game.player1.getHand().get(0).ImageId);
				o1c2Img.setImageResource(game.player1.getHand().get(1).ImageId);
				o1c3Img.setImageResource(game.player1.getHand().get(2).ImageId);
				o1c4Img.setImageResource(game.player1.getHand().get(3).ImageId);
				o1c5Img.setImageResource(game.player1.getHand().get(4).ImageId);
				o1c6Img.setImageResource(game.player1.getHand().get(5).ImageId);
				o1c7Img.setImageResource(game.player1.getHand().get(6).ImageId);
				o1c8Img.setVisibility(ImageView.INVISIBLE);
				o1c9Img.setVisibility(ImageView.INVISIBLE);
				o1c10Img.setVisibility(ImageView.INVISIBLE);
				o1c11Img.setVisibility(ImageView.INVISIBLE);
			}
		});
    }
}