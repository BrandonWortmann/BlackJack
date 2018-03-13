package blackjack.model;


public class Card
{
	private int number;
	private int suit;
	private boolean ace;
	private String image;
	
	
	
	public Card(int suit, int number, boolean ace)
	{
		this.suit = suit;
		this.number = number;
		this.ace = ace;
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
		this.image = "/blackjack/view/cardPictures/" + image +  ".png";
		
	}
	
	public String getImage()
	{
		return image;
	}
	
	public boolean getAce()
	{
		
		return this.ace;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setAce(boolean ace)
	{
		this.ace = ace;
	}


}
