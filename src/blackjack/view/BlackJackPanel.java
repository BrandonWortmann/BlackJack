package blackjack.view;

import javax.swing.*;
import java.awt.Color;

import blackjack.controller.BlackJackController;


public class BlackJackPanel extends JPanel
{
	private JButton hitButton;
	private JButton stayButton;
	private DealerPanel dealerPanel;
	private PlayerPanel playerPanel;
	
	private BlackJackController appController;
	
	public BlackJackPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		this.playerPanel = new PlayerPanel(appController);
		
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.add(playerPanel);
		this.setBackground(Color.GREEN.darker().darker());
	}

}
