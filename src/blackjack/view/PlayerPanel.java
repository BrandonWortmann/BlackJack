package blackjack.view;

import javax.swing.*;



import blackjack.controller.BlackJackController;

public class PlayerPanel extends JPanel
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
		
		addCards(); 
		
	}
	
	private void addCards()
	{
		firstLabel.setIcon(new ImageIcon(getClass().getResource("/blackjack/view/cardPictures/3C.png")));
		this.add(firstLabel);
		
	}

}
