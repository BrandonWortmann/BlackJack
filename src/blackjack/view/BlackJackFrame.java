package blackjack.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import blackjack.controller.BlackJackController;
import blackjack.model.Card;

public class BlackJackFrame extends JFrame
{
	private BlackJackController appController;
	private BlackJackPanel appPanel;
	
	public BlackJackFrame(BlackJackController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new BlackJackPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(900, 900);
		this.setTitle("BlackJack");
		this.setResizable(false);
		this.add(appPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void addPlayerCard(Card card)
	{
		appPanel.addPlayerCard(card);
	}
	
	public void addDealerCard(Card card) 
	{
		appPanel.addDealerCard(card);
	}
	
	public void changePlayerScore(int input)
	{
		appPanel.changePlayerScore(input);
	}
	
	public void changeDealerScore(int input)
	{
		appPanel.changeDealerScore(input);
	}
	
	public void removeEverything()
	{
		appPanel.removeEverything();
	}
	
	public void runEndScreen(String input)
	{
		appPanel.runEndScreen(input);
	}
	
	public void reset()
	{
		appPanel.reset();
	}
	
	public void subtractPlayerTotal()
	{
		appPanel.subtractPlayerTotal();
	}
	
	public void subtractDealerTotal()
	{
		appPanel.subtractDealerTotal();
	}
	
	
	

}
