package blackjack.view;

import javax.swing.*;
import java.awt.Color;

import blackjack.controller.BlackJackController;
import blackjack.model.Card;


public class BlackJackPanel extends JPanel
{
	
	private ButtonPanel buttonPanel;
	private DealerPanel dealerPanel;
	private PlayerPanel playerPanel;
	
	private SpringLayout appLayout;
	
	private BlackJackController appController;
	
	public BlackJackPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		this.playerPanel = new PlayerPanel(appController);
		this.dealerPanel = new DealerPanel(appController);
		this.buttonPanel = new ButtonPanel(appController);
		
		
		this.appLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		
		this.setSize(900 , 900);
		this.setLayout(appLayout);
		this.add(playerPanel);
		this.add(dealerPanel);
		this.add(buttonPanel);
		this.setBackground(Color.GREEN.darker().darker());
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, playerPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, playerPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, dealerPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, dealerPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, playerPanel, 600, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, playerPanel, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, buttonPanel, 300, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, buttonPanel, -300, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, dealerPanel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, dealerPanel, -600, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, buttonPanel, 350, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, buttonPanel, -350, SpringLayout.EAST, this);
		
		
	}
	
	public void addPlayerCard(Card card)
	{
		playerPanel.addCard(card);
	}
	
	public void addDealerCard(Card card)
	{
		dealerPanel.addCard(card);
	}

}
