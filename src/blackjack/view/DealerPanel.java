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
	
	
	
	
	public DealerPanel(BlackJackController appController)
	{
		super();
		this.appController = appController;
		labels = new ArrayList<JLabel>();
		label = new JLabel();
		
		
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(0,0,0,0));
	}
	
	public void addCard(Card card , int num)
	{
		label.setIcon(new ImageIcon(getClass().getResource(card.getImage())));
		label.setLocation(360,28);
		
//		labels.add(new JLabel(card.getImage()));
//		
//		for(int i = 0; i < labels.size()-1; i++)
//		{
//			this.add(labels.get(i));
//			labels.get(i).setLocation(150,0);
//		}
		
	}

}
