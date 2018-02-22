package blackjack.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import blackjack.controller.BlackJackController;

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
	

}
