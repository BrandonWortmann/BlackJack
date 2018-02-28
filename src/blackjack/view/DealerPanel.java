package blackjack.view;

import java.awt.Color;

import javax.swing.*;
import blackjack.controller.BlackJackController;
import blackjack.model.Card;

public class DealerPanel extends JLayeredPane
{
	private BlackJackController appController;
	
	private JLabel firstLabel;
	private JLabel secondLabel;
	private JLabel thirdLabel;
	private JLabel fourthLabel;
	private JLabel fifthLabel;
	private JLabel sixthLabel;
	private JLabel seventhLabel;
	private JLabel eigthLabel;
	private JLabel ninethLabel;
	private JLabel tenthLabel;
	private JLabel eleventhLabel;
	private JLabel twelthLabel;
	
	
	
	
	public DealerPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		
		firstLabel = new JLabel();
		secondLabel = new JLabel();
		thirdLabel = new JLabel();
		fourthLabel = new JLabel();
		fifthLabel = new JLabel();
		sixthLabel = new JLabel();
		seventhLabel = new JLabel();
		eigthLabel = new JLabel();
		ninethLabel = new JLabel();
		tenthLabel = new JLabel();
		eleventhLabel = new JLabel();
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(0,0,0,0));
	}
	
	public void addCard(Card card , int num)
	{
		
	}

}
