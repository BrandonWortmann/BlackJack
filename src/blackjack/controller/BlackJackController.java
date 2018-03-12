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
	private int playerIndex;
	private int dealerIndex;
	
	public BlackJackController()
	{
		appFrame = new BlackJackFrame(this);
		cards = new ArrayList<Card>();
		playerCards = new ArrayList<Card>();
		dealerCards = new ArrayList<Card>();
		
		playerIndex = 0;
		dealerIndex = 0;
		
		
		
	}
	
	public void start()
	{
		cards.clear();
		playerCards.clear();
		dealerCards.clear();
		appFrame.reset();
		
		for(int suit = 1; suit <= 4; suit++)
		{
			for(int number = 1; number <= 13; number++)
			{
				if(number >= 10)
				{
					cards.add(new Card(suit , 10));
				}
				else
				{
					cards.add(new Card(suit , number));
				}
				
				
			}
			
		}
		
		
		cards.get(0).setImage("1S");
		cards.get(1).setImage("2S");
		cards.get(2).setImage("3S");
		cards.get(3).setImage("4S");
		cards.get(4).setImage("5S");
		cards.get(5).setImage("6S");
		cards.get(6).setImage("7S");
		cards.get(7).setImage("8S");
		cards.get(8).setImage("9S");
		cards.get(9).setImage("10S");
		cards.get(10).setImage("11S");
		cards.get(11).setImage("12S");
		cards.get(12).setImage("13S");
		cards.get(13).setImage("1H");
		cards.get(14).setImage("2H");
		cards.get(15).setImage("3H");
		cards.get(16).setImage("4H");
		cards.get(17).setImage("5H");
		cards.get(18).setImage("6H");
		cards.get(19).setImage("7H");
		cards.get(20).setImage("8H");
		cards.get(21).setImage("9H");
		cards.get(22).setImage("10H");
		cards.get(23).setImage("11H");
		cards.get(24).setImage("12H");
		cards.get(25).setImage("13H");
		cards.get(26).setImage("1C");
		cards.get(27).setImage("2C");
		cards.get(28).setImage("3C");
		cards.get(29).setImage("4C");
		cards.get(30).setImage("5C");
		cards.get(31).setImage("6C");
		cards.get(32).setImage("7C");
		cards.get(33).setImage("8C");
		cards.get(34).setImage("9C");
		cards.get(35).setImage("10C");
		cards.get(36).setImage("11C");
		cards.get(37).setImage("12C");
		cards.get(38).setImage("12C");
		cards.get(39).setImage("1D");
		cards.get(40).setImage("2D");
		cards.get(41).setImage("3D");
		cards.get(42).setImage("4D");
		cards.get(43).setImage("5D");
		cards.get(44).setImage("6D");
		cards.get(45).setImage("7D");
		cards.get(46).setImage("8D");
		cards.get(47).setImage("9D");
		cards.get(48).setImage("10D");
		cards.get(49).setImage("11D");
		cards.get(50).setImage("12D");
		cards.get(51).setImage("13D");
		
		
		addPlayerCard();
		addDealerCard();
		addPlayerCard();
		addDealerCard();
		
		
		
		
	}
	
	public void addPlayerCard()
	{
		playerCards.add(cards.remove((int)(Math.random()*cards.size())));
		appFrame.addPlayerCard(playerCards.get(playerCards.size()-1));
		appFrame.changePlayerScore(playerCards.get(playerCards.size()-1).getNumber());
		if(checkPlayerBust()) 
		{
			runEndScreen("You Bust");
		}
		
		
		
		
	}
	
	
	public void addDealerCard()
	{
		dealerCards.add(cards.remove((int)(Math.random()*cards.size())));
		appFrame.addDealerCard(dealerCards.get(playerCards.size()-1));
		appFrame.changeDealerScore(dealerCards.get(dealerCards.size()-1).getNumber());
	}
	
	
	
	public void playerStayed()
	{
		appFrame.removeEverything();
		runDealer();
	}
	
	
	public void runDealer()
	{
		while(checkDealer() == false)
		{
			dealerCards.add(cards.remove((int)(Math.random()*cards.size())));
			appFrame.addDealerCard(dealerCards.get(dealerCards.size()-1));
			
			appFrame.changeDealerScore(dealerCards.get(dealerCards.size()-1).getNumber());
		}
		if(getDealerCount() > getPlayerCount())
		{
			runEndScreen("You Lost");
		}
		else if(getDealerCount() == getPlayerCount())
		{
			runEndScreen("You Pushed");
		}
		else
		{
			runEndScreen("You Won");
		}
		
		
	}
	
	
	
	private boolean checkDealer()
	{
		int dealerTotal = 0;
		
		for(int i = 0; i < dealerCards.size(); i++)
		{
			dealerTotal += dealerCards.get(i).getNumber();
		}
		
		if(dealerTotal > 16)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean checkPlayerBust()
	{
		int playerTotal = 0;
		
		for(int i = 0; i < playerCards.size(); i++)
		{
			playerTotal += playerCards.get(i).getNumber();
		}
		
		if(playerTotal > 21)
		{
			return true;
		}
		return false;
	}
	
	private int getPlayerCount()
	{
		int total = 0;
		
		for(int i = 0; i < playerCards.size(); i++)
		{
			total += playerCards.get(i).getNumber();
		}
		
		return total;
	}
	
	private int getDealerCount()
	{
		int total = 0;
		
		for(int i = 0; i < dealerCards.size(); i++)
		{
			total += dealerCards.get(i).getNumber();
		}
		
		return total;
	}
	
	private void runEndScreen(String input)
	{
		appFrame.runEndScreen(input);
	}
	
	
	
	
	
	
	
}
