import java.util.Scanner;
public class RPSHumanPlayer extends RPSPlayer {
	Scanner keyboard = new Scanner(System.in);
	public RPSHumanPlayer()
	{
		super();
		Scanner keyboard = new Scanner(System.in);
	}
	
	public void chooseGesture()
	{
		super.setGesture(keyboard.nextLine());
	}
}
