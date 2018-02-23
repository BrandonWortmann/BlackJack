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
	
	private SpringLayout appLayout;
	
	private BlackJackController appController;
	
	public BlackJackPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		this.playerPanel = new PlayerPanel(appController);
		
		this.appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		
		this.setSize(900 , 900);
		playerPanel.setSize(900,300);
		this.setLayout(appLayout);
		this.add(playerPanel);
		this.setBackground(Color.GREEN.darker().darker());
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, playerPanel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, playerPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, playerPanel, -600, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, playerPanel, 0, SpringLayout.EAST, this);
		
	}

}
