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
	private double halfSize;
	
	
 
	
	public PlayerPanel(BlackJackController appConroller)
	{
		super();
		
		this.appController = appController;
		labels = new ArrayList<JLabel>();
		
		halfSize = 0.0;
		
		
		setupPanel(); 
		
	}
	
	private void setupPanel()
	{
		this.setOpaque(false);
	}
	
	public void addCard(Card card)
	{
		for(int i=0; i<labels.size()-1;i++)
		{
			this.remove(labels.get(i));
		}
		
		labels.add(new JLabel(new ImageIcon(getClass().getResource(card.getImage()))));
		halfSize = (labels.size()/2) + 0.5;
		
		for(int i = 0; i<labels.size()-1;i++)
		{
			labels.get(i).setSize(158, 230);
			
			if(i < halfSize)
			{
				labels.get(i).setLocation(371 - ((labels.size()-i) * 15),35);
			}
			else if(i > halfSize)
			{
				labels.get(i).setLocation(371 + ((labels.size()-i) * 15),35);
			}
			else
			{
				labels.get(i).setLocation(371,35);
			}
			
			this.add(labels.get(i));
		}
			
		
	}

}
