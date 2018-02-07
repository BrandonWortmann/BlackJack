package blackjack.view;

import javax.swing.*;
import java.awt.Color;

import blackjack.controller.BlackJackController;


public class BlackJackPanel extends JPanel
{
	private BlackJackController appController;
	
	public BlackJackPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		
	}

}
