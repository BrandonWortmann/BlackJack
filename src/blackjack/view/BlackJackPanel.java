package blackjack.view;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;

import blackjack.controller.BlackJackController;
import blackjack.model.Card;
import java.awt.Font;


public class BlackJackPanel extends JPanel
{
	
	private ButtonPanel buttonPanel;
	private DealerPanel dealerPanel;
	private PlayerPanel playerPanel;
	
	private JLabel playerScore;
	private JLabel dealerScore;
	
	private SpringLayout appLayout;
	
	private BlackJackController appController;
	
	private int pScore;
	private int dScore;
	
	public BlackJackPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		this.playerPanel = new PlayerPanel(appController);
		this.dealerPanel = new DealerPanel(appController);
		this.buttonPanel = new ButtonPanel(appController);
		this.playerScore = new JLabel();
		this.dealerScore = new JLabel();
		this.appLayout = new SpringLayout();
		
		pScore = 0;
		dScore = 0;
		
		
		
		
		setupPanel();
		setupLayout();
		setupLabels();
	}
	
	private void setupPanel()
	{
		
		this.setSize(900 , 900);
		this.setLayout(appLayout);
		this.add(playerPanel);
		this.add(dealerPanel);
		this.add(buttonPanel);
		this.add(playerScore);
		this.add(dealerScore);
		this.setBackground(Color.GREEN.darker().darker());
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, playerPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, playerPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, dealerPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, dealerPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, dealerPanel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, dealerPanel, -600, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, buttonPanel, 350, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, buttonPanel, -350, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, buttonPanel, 325, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, buttonPanel, -325, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, playerPanel, 600, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, playerPanel, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, playerScore, 12, SpringLayout.SOUTH, buttonPanel);
		appLayout.putConstraint(SpringLayout.WEST, playerScore, 400, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, playerScore, -247, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, playerScore, -400, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, dealerScore, 247, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, dealerScore, 400, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, dealerScore, -12, SpringLayout.NORTH, buttonPanel);
		appLayout.putConstraint(SpringLayout.EAST, dealerScore, -400, SpringLayout.EAST, this);
		
		
	}
	
	private void setupLabels()
	{
		playerScore.setBackground(Color.BLACK);
		playerScore.setBorder(new LineBorder(Color.WHITE,1));
		playerScore.setOpaque(true);
		playerScore.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		playerScore.setHorizontalAlignment(SwingConstants.CENTER);
		playerScore.setForeground(Color.WHITE);
		
		dealerScore.setBackground(Color.BLACK);
		dealerScore.setBorder(new LineBorder(Color.WHITE,1));
		dealerScore.setOpaque(true);
		dealerScore.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		dealerScore.setHorizontalAlignment(SwingConstants.CENTER);
		dealerScore.setForeground(Color.WHITE);
	}
	
	public void changePlayerScore(int input)
	{
		pScore += input;
		playerScore.setText(pScore + "");
	}
	
	public void changeDealerScore(int input)
	{
		dScore += input;
		dealerScore.setText(dScore + "");
	}
	
	public void addPlayerCard(Card card)
	{
		playerPanel.addCard(card);
	}
	
	public void addDealerCard(Card card)
	{
		dealerPanel.addCard(card);
	}
	
	public void removeEverything()
	{
		buttonPanel.removeEverything();
	}
	
	public void runEndScreen(String input)
	{
		buttonPanel.runEndScreen(input);
	}
	
	public void reset()
	{
		
	}

}
