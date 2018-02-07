package blackjack.controller;

import blackjack.view.BlackJackFrame;

public class BlackJackController
{
	private BlackJackFrame appFrame;
	
	public BlackJackController()
	{
		appFrame = new BlackJackFrame(this);
	}

}
