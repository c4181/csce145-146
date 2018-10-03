
public class RPSPlayer implements RPSPlayerInterface {
	private String gesture;
	private int points;
	
	RPSPlayer()
	{
		this.gesture = "none";
		this.points = 0;
	}
	
	public int getPoints()
	{
		return this.points;
	}
	
	public String getGesture()
	{
		return this.gesture;
	}
	
	public void setPoints(int aPoints)
	{
		points = aPoints;
	}
	
	public void setGesture(String aGesture)
	{
		if (aGesture.equalsIgnoreCase("Rock"))
		{
			this.gesture = "rock";
		}
		else if (aGesture.equalsIgnoreCase("Paper"))
		{
			this.gesture = "paper";
		}
		else if (aGesture.equalsIgnoreCase("Scissors"))
		{
			this.gesture = "scissors";
		}
		else
		{
			System.out.println("Incorrect Choice");
			this.gesture = "none";
		}
	}
	
	public void chooseGesture()
	{
		gesture = "none";
	}
}
