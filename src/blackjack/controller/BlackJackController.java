package blackjack.controller;

import blackjack.view.BlackJackFrame;
import java.util.List;
import java.util.ArrayList;
import blackjack.model.Card;

public class BlackJackController
{
	private BlackJackFrame appFrame;
	private List<Card> cards;
	
	public BlackJackController()
	{
		appFrame = new BlackJackFrame(this);
		cards = new ArrayList<Card>();
		
		setupCards();
		
	}
	
	private void setupCards()
	{
		for(int suit = 1; suit <= 4; suit++)
		{
			for(int number = 1; number <= 13; number++)
			{
				cards.add(new Card(suit , number));
				
				System.out.println(suit + " , " + number);
			}
			
		}
	}

}
