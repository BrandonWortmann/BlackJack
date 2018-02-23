package blackjack.view;

import java.awt.Color;
import javax.swing.*;



import blackjack.controller.BlackJackController;

public class PlayerPanel extends JLayeredPane
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
	
	private SpringLayout appLayout;
	
	
	
	
	
	public PlayerPanel(BlackJackController appConroller)
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
		
		appLayout = new SpringLayout();
		
		setupPanel();
		addCards(); 
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GREEN.darker().darker());
	}
	
	private void addCards()
	{
		firstLabel.setIcon(new ImageIcon(getClass().getResource("/blackjack/view/cardPictures/3C.png")));
		secondLabel.setIcon(new ImageIcon(getClass().getResource("/blackjack/view/cardPictures/3H.png")));
		this.add(firstLabel , new Integer(1));
		this.add(secondLabel , new Integer(2));
		
	}

}
