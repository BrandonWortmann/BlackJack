package blackjack.view;

import javax.swing.*;
import java.awt.Color;
import blackjack.controller.BlackJackController;

public class ButtonPanel extends JPanel
{
	
	private BlackJackController appController;
	private JButton hitButton;
	private JButton stayButton;
	private JButton doubleButton;
	private JButton splitButton;
	
	
	public ButtonPanel(BlackJackController appController)
	{
		super();
		
		this.appController = appController;
		
		this.hitButton = new JButton("Hit");
		this.stayButton = new JButton("Stay");
		this.doubleButton = new JButton("Double");
		this.splitButton = new JButton("Split");
		
		setupPanel();
		
		
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(0,0,0,0));
		this.add(hitButton);
		this.add(stayButton);
	}
	
	

}
