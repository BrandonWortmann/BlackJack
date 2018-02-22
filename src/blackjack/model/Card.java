package blackjack.model;


public class Card
{
	private int number;
	private int suit;
	private String image;
	
	public Card(int suit, int number)
	{
		this.suit = suit;
		this.number = number;
	}
	
	public int getNumber()
	{
		return this.number;
		
	}
	
	public int getSuit()
	{
		return this.suit;
	}
	
	public void setImage(String image)
	{
		this.image = image;
		
	}


}
