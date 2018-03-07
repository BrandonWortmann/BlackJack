package blackjack.view;

import java.awt.Color;

import javax.swing.*;
import blackjack.controller.BlackJackController;
import blackjack.model.Card;
import java.util.List;
import java.util.ArrayList;

public class DealerPanel extends JLayeredPane
{
	private BlackJackController appController;
	private List<JLabel> labels;
	private JLabel label;
	private JLabel labela;
	private JLabel labelb;
	private double halfSize;
	
	
	
	
	public DealerPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		halfSize = 0.0;
		labels = new ArrayList<JLabel>();
		label = new JLabel();
		labela = new JLabel();
		labelb= new JLabel();
		
		
		
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setOpaque(false);
	}
	
	public void addCard(Card card , int num)
	{
		// 371 is mid	
		
		labels.add(new JLabel(new ImageIcon(getClass().getResource(card.getImage()))));
		halfSize = (labels.size()/2) + 0.5;
		
		for(int i = 0; i<labels.size();i++)
		{
			labels.get(i).setSize(158, 230);
			
			if(i < halfSize)
			{
				labels.get(i).setLocation(371 - ((labels.size()-1) * 15),35);
			}
			else if(i > halfSize)
			{
				labels.get(i).setLocation(371 + ((labels.size()-1) * 15),35);
			}
			else
			{
				labels.get(i).setLocation(371,35);
			}
			
			this.add(labels.get(i));
		}
		
		
		

		
	}

}
