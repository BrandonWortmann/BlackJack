package blackjack.view;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;

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
		this.setOpaque(false);
		
	}
	
	public void addCard(Card card)
	{
		for(int i=0; i<labels.size();i++)
		{
			this.remove(labels.get(i));
		}
		
		labels.add(new JLabel(new ImageIcon(getClass().getResource(card.getImage()))));
		
		for(int i = 0; i<labels.size();i++)
		{
			labels.get(i).setSize(158, 230);
			
			labels.get(i).setLocation(371+(30*i) , 42);
			
			this.add(labels.get(i) ,new Integer(i));
		}
		
		//Bens Help :)
		for(JLabel label : labels)
		{
			label.setLocation(label.getX()-(15 * (labels.size() - 1)) , 42);
		}
			
		
	}

}
