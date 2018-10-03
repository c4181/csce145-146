import java.util.Scanner;
public class ShowcaseGame {
	public static final int NUMBER_OF_PRIZES = 5;
	public static void main(String[] args) {
		int guess;
		String input;
		int prizeValues;
		Scanner keyboard = new Scanner(System.in);
		boolean continueGame = true;
		
		while(continueGame)
		{
		Prize[] prizes = new Prize[NUMBER_OF_PRIZES];
		Showcase showcase = new Showcase();
		prizeValues = showcase.getPrizeValues();
		System.out.println("Welcome to the showcase show down!");
		System.out.println("Your prizes are:");
		showcase.printPrizes();
		
		System.out.println("You must guess the total cost of all without going over"+"\nEnter your guess");
		guess = keyboard.nextInt();
		keyboard.nextLine();
		
		if(guess<=prizeValues)
		{
			if((prizeValues-guess)<2000)
			{
			System.out.println("Your guess was under! You Win!");
			}
			else
				System.out.println("I'm sorry but that guess was bad. You lose for being bad");
		}
		else
			System.out.println("I'm sorry but that was over...You get nothing");
		
		System.out.println("Would you like to play again? Enter \"No\" to quit");
		input = keyboard.nextLine();
		if(input.equalsIgnoreCase("No"))
			continueGame=false;
		}
	}

}
