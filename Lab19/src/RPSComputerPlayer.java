import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer {
	Random rand;
	RPSComputerPlayer()
	{
		super();
		rand = new Random();
	}
	
	public void chooseGesture()
	{
		int gesture = rand.nextInt(3);
		if (gesture == 0)
		{
			super.setGesture("Rock");
		}
		else if (gesture == 1)
		{
			super.setGesture("Paper");
		}
		else if (gesture == 2)
		{
			super.setGesture("Scissors");
		}
	}
	
}
