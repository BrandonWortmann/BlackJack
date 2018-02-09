package blackjack.view;

import javax.swing.*;

import blackjack.controller.BlackJackController;

public class PlayerPanel extends JPanel
{
	private BlackJackController appController;
	
	
	public PlayerPanel(BlackJackController appConroller)
	{
		super();
		
		this.appController = appController;
		
	}

}
