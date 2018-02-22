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
		
		cards.get(0).setImage("c01");
		cards.get(1).setImage("c02");
		cards.get(2).setImage("c03");
		cards.get(3).setImage("c04");
		cards.get(4).setImage("c05");
		cards.get(5).setImage("c06");
		cards.get(6).setImage("c07");
		cards.get(7).setImage("c08");
		cards.get(8).setImage("c09");
		cards.get(9).setImage("c10");
		cards.get(10).setImage("c11");
		cards.get(11).setImage("c12");
		cards.get(12).setImage("c13");
		cards.get(13).setImage("c01");
		cards.get(14).setImage("c02");
		cards.get(15).setImage("c03");
		cards.get(16).setImage("c04");
		cards.get(17).setImage("c05");
		cards.get(18).setImage("c06");
		cards.get(19).setImage("c07");
		cards.get(20).setImage("c08");
		cards.get(21).setImage("c09");
		cards.get(22).setImage("c10");
		cards.get(23).setImage("c11");
		cards.get(24).setImage("c12");
		cards.get(25).setImage("c13");
		cards.get(26).setImage("d01");
		cards.get(27).setImage("d02");
		cards.get(28).setImage("d03");
		cards.get(29).setImage("d04");
		cards.get(30).setImage("d05");
		cards.get(31).setImage("d06");
		cards.get(32).setImage("d07");
		cards.get(33).setImage("d08");
		cards.get(34).setImage("d09");
		cards.get(35).setImage("d10");
		cards.get(36).setImage("d11");
		cards.get(37).setImage("d12");
		cards.get(38).setImage("d13");
		cards.get(39).setImage("h01");
		cards.get(40).setImage("h02");
		cards.get(41).setImage("h03");
		cards.get(42).setImage("h04");
		cards.get(43).setImage("h05");
		cards.get(44).setImage("h06");
		cards.get(45).setImage("h07");
		cards.get(46).setImage("h08");
		cards.get(47).setImage("h09");
		cards.get(48).setImage("h10");
		cards.get(49).setImage("h11");
		cards.get(50).setImage("h12");
		cards.get(51).setImage("h13");
		
		
		
		
		
	}

}
