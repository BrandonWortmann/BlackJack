package blackjack.view;

import javax.swing.*;
import blackjack.controller.BlackJackController;

public class DealerPanel extends JPanel
{
	private BlackJackController appController;
	
	
	public DealerPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
	}

}
