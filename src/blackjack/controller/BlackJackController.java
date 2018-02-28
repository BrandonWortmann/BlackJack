package blackjack.controller;

import blackjack.view.BlackJackFrame;
import java.util.List;
import java.util.ArrayList;
import blackjack.model.Card;

public class BlackJackController
{
	private BlackJackFrame appFrame;
	private List<Card> cards;
	private List<Card> playerCards;
	private List<Card> dealerCards;
	
	public BlackJackController()
	{
		appFrame = new BlackJackFrame(this);
		cards = new ArrayList<Card>();
		playerCards = new ArrayList<Card>();
		dealerCards = new ArrayList<Card>();
		
		dealInitial();
		
	}
	
	private void dealInitial()
	{
		for(int suit = 1; suit <= 4; suit++)
		{
			for(int number = 1; number <= 13; number++)
			{
				cards.add(new Card(suit , number));
				
				System.out.println(suit + " , " + number);
			}
			
		}
		
		cards.get(0).setImage("AS");
		cards.get(1).setImage("2S");
		cards.get(2).setImage("3S");
		cards.get(3).setImage("4S");
		cards.get(4).setImage("5S");
		cards.get(5).setImage("6S");
		cards.get(6).setImage("7S");
		cards.get(7).setImage("8S");
		cards.get(8).setImage("9S");
		cards.get(9).setImage("10S");
		cards.get(10).setImage("JS");
		cards.get(11).setImage("QS");
		cards.get(12).setImage("KS");
		cards.get(13).setImage("AH");
		cards.get(14).setImage("2H");
		cards.get(15).setImage("3H");
		cards.get(16).setImage("4H");
		cards.get(17).setImage("5H");
		cards.get(18).setImage("6H");
		cards.get(19).setImage("7H");
		cards.get(20).setImage("8H");
		cards.get(21).setImage("9H");
		cards.get(22).setImage("10H");
		cards.get(23).setImage("JH");
		cards.get(24).setImage("QH");
		cards.get(25).setImage("KH");
		cards.get(26).setImage("AC");
		cards.get(27).setImage("2C");
		cards.get(28).setImage("3C");
		cards.get(29).setImage("4C");
		cards.get(30).setImage("5C");
		cards.get(31).setImage("6C");
		cards.get(32).setImage("7C");
		cards.get(33).setImage("8C");
		cards.get(34).setImage("9C");
		cards.get(35).setImage("10C");
		cards.get(36).setImage("JC");
		cards.get(37).setImage("QC");
		cards.get(38).setImage("KC");
		cards.get(39).setImage("AD");
		cards.get(40).setImage("2D");
		cards.get(41).setImage("3D");
		cards.get(42).setImage("4D");
		cards.get(43).setImage("5D");
		cards.get(44).setImage("6D");
		cards.get(45).setImage("7D");
		cards.get(46).setImage("8D");
		cards.get(47).setImage("9D");
		cards.get(48).setImage("10D");
		cards.get(49).setImage("JD");
		cards.get(50).setImage("QD");
		cards.get(51).setImage("KD");
		
		
		playerCards.add(cards.remove((int)(Math.random()*cards.size())));
		appFrame.addPlayerCard(playerCards.get(0),1);
		
		dealerCards.add(cards.remove((int)(Math.random()*cards.size())));
		appFrame.addDealerCard(playerCards.get(0),1);
		
	}

	
}
