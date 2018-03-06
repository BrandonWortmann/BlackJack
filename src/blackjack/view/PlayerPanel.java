package blackjack.view;

import java.awt.Color;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;



import blackjack.controller.BlackJackController;
import blackjack.model.Card;

public class PlayerPanel extends JLayeredPane
{
	private BlackJackController appController;
	private List<JLabel> labels;
	
	
 
	
	public PlayerPanel(BlackJackController appConroller)
	{
		super();
		
		this.appController = appController;
		labels = new ArrayList<JLabel>();
		
		
		setupPanel(); 
		
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(0,0,0,0));
	}
	
	public void addCard(Card card , int num)
	{
		labels.add(new JLabel(card.getImage()));
			
		
	}

}
