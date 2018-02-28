package blackjack.view;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;

import blackjack.controller.BlackJackController;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class ButtonPanel extends JPanel
{
	
	private BlackJackController appController;
	private JButton hitButton;
	private JButton stayButton;
	private JButton doubleButton;
	private JButton splitButton;
	private SpringLayout appLayout;
	
	
	public ButtonPanel(BlackJackController appController)
	{
		super();
		
		this.appController = appController;
		
		this.hitButton = new JButton("Hit");
		this.doubleButton = new JButton("Double");
		this.splitButton = new JButton("Split");
		this.stayButton = new JButton("Stay");
		
		this.appLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupButtons();
		
		
	}
	
	private void setupPanel()
	{
		
		this.setLayout(appLayout);
		this.setOpaque(false);
		this.add(hitButton);
		this.add(doubleButton);
		this.add(splitButton);
		this.add(stayButton);
	}
	
	private void setupButtons()
	{
		hitButton.setOpaque(true);
		stayButton.setOpaque(true);
		stayButton.setBackground(Color.DARK_GRAY);
		hitButton.setBackground(Color.DARK_GRAY);
		hitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		stayButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		hitButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLUE, Color.BLUE));
		stayButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), Color.RED));
		hitButton.setForeground(Color.WHITE);
		stayButton.setForeground(Color.WHITE);
		
		doubleButton.setOpaque(true);
		splitButton.setOpaque(true);
		splitButton.setBackground(Color.DARK_GRAY);
		doubleButton.setBackground(Color.DARK_GRAY);
		doubleButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		splitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		doubleButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.ORANGE, Color.ORANGE));
		splitButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.MAGENTA, Color.MAGENTA));
		doubleButton.setForeground(Color.WHITE);
		splitButton.setForeground(Color.WHITE);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, stayButton, -5, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, splitButton, -80, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, doubleButton, -155, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, hitButton, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, stayButton, 10, SpringLayout.SOUTH, splitButton);
		appLayout.putConstraint(SpringLayout.WEST, stayButton, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, stayButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, splitButton, 10, SpringLayout.SOUTH, doubleButton);
		appLayout.putConstraint(SpringLayout.WEST, splitButton, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, splitButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, doubleButton, 10, SpringLayout.SOUTH, hitButton);
		appLayout.putConstraint(SpringLayout.WEST, doubleButton, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, doubleButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, hitButton, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, hitButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, hitButton, -230, SpringLayout.SOUTH, this);
		
	}
	
	

}
