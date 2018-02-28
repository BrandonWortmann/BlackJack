package blackjack.view;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import blackjack.controller.BlackJackController;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class ButtonPanel extends JPanel
{

	private BlackJackController appController;
	private JButton hitButton;
	private JButton stayButton;
	private JButton doubleButton;
	private JButton splitButton;
	private GridLayout appLayout;

	public ButtonPanel(BlackJackController appController)
	{
		super();

		this.appController = appController;

		this.hitButton = new JButton("Hit");
		this.doubleButton = new JButton("Double");
		this.splitButton = new JButton("Split");
		this.stayButton = new JButton("Stay");

		this.appLayout = new GridLayout(0, 1, 0, 10);

		setupPanel();
		setupButtons();
		setupListeners();

	}

	private void setupPanel()
	{

		this.setLayout(appLayout);
		this.setOpaque(false);
		this.add(hitButton);
		this.add(stayButton);
		
		addDouble();
		addSplit();
	}

	private void setupButtons()
	{
		hitButton.setOpaque(true);
		stayButton.setOpaque(true);
		stayButton.setBackground(Color.RED.darker().darker());
		hitButton.setBackground(Color.BLUE.darker().darker());
		hitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		stayButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		hitButton.setBorder(new LineBorder(Color.BLACK,3));
		stayButton.setBorder(new LineBorder(Color.BLACK,3));
		hitButton.setForeground(Color.WHITE);
		stayButton.setForeground(Color.WHITE);

		doubleButton.setOpaque(true);
		splitButton.setOpaque(true);
		splitButton.setBackground(Color.MAGENTA.darker().darker());
		doubleButton.setBackground(new Color(255, 140, 0).darker());
		doubleButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		splitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		doubleButton.setBorder(new LineBorder(Color.BLACK,3));
		splitButton.setBorder(new LineBorder(Color.BLACK,3));
		doubleButton.setForeground(Color.WHITE);
		splitButton.setForeground(Color.WHITE);

	}

	private void setupListeners()
	{
		hitButton.addActionListener(click -> 
		{
				
		});
		
		hitButton.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent enter)
			{
				hitButton.setBorder(new LineBorder(Color.WHITE));
			}
			
			public void mouseExit(MouseEvent exit)
			{
				//hitButton.setBorder
			}
			
		});
		
	}

	public void addDouble()
	{
		this.add(doubleButton);
	}

	public void addSplit()
	{
		this.add(splitButton);
	}

	public void removeSplit()
	{
		this.remove(splitButton);
	}

}
