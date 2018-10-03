/*
 * Written by Christopher Moyer
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
		//Constants
		public static final int ROCK = 0;
		public static final int PAPER = 1;
		public static final int SCISSORS = 2;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		//Variables
		boolean playAgain = true;
		
		
		System.out.println("Let's play Rock, Paper, Scissors. Best 2 out of 3");
		
		do {
			
			//Variables
			String playerInput = "none";
			int computerInput = -1;
			int playerScore = 0;
			int computerScore = 0;
			
		for (int numberOfTurns=1; (numberOfTurns<=3 && playerScore<2 && computerScore<2); numberOfTurns++)
		{	//Player Input
			System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
			playerInput = keyboard.nextLine();
			
			//Computer Input
			computerInput = r.nextInt(3);
			
			//Error Check
			if (!playerInput.equalsIgnoreCase("Rock") && !playerInput.equalsIgnoreCase("Paper") && !playerInput.equalsIgnoreCase("Scissors"))
			{
				System.out.println("Your input is invalid. Computer Wins!");
				computerScore++;
			}
			
			//Evaluate Input of Rock
			if (playerInput.equalsIgnoreCase("Rock"))
			{	
				if (computerInput==SCISSORS)
				{
				System.out.println("Rock v Scissors! Player Wins!");
				playerScore++;
				}
				else if (computerInput==PAPER)
				{
					System.out.println("Rock v Paper! Computer Wins!");
				}
				else
				{
					System.out.println("Rock v Rock! Draw!");
				}
			}
			
			
			//Evaluate Player Input of Paper
			if (playerInput.equalsIgnoreCase("Paper"))
			{
				if (computerInput==ROCK)
				{
					System.out.println("Paper v Rock! Player Wins");
					playerScore++;
				}
				else if (computerInput==SCISSORS)
				{
					System.out.println("Paper v Scissors! Computer Wins!");
					computerScore++;
				}
				else
				{
					System.out.println("Paper v Paper! Draw!");
				}
			}
			
			//Evaluate Player Input of Scissors
			if (playerInput.equalsIgnoreCase("Scissors"))
			{
				if (computerInput==PAPER)
				{
					System.out.println("Scissors v Paper! Player Wins!");
					playerScore++;
				}
				else if (computerInput==ROCK)
				{
					System.out.println("Scissors v Rock! Computer Wins!");
					computerScore++;
				}
				else
				{
					System.out.println("Scissors v Scissors! Draw!");
				}
			}
			
			System.out.println("Player has won " + playerScore + " times & Computer has won " + computerScore + " times.");
		}
		
			//Declare Winner
			if (playerScore>computerScore)
			{
				System.out.println("Player Wins!");
			}
			else if (playerScore<computerScore)
			{
				System.out.println("Computer Wins!");
			}
			else
			{
				System.out.println("Draw!");
			}
			
			//Play Again?
			System.out.println("Do you want to play again? Yes or No");
			playerInput = keyboard.nextLine();
			
			if (playerInput.equalsIgnoreCase("Yes"))
			{
				playAgain=true;
			}
			else 
			{
				System.out.println("Thanks for playing!");
				playAgain=false;
			}
			}
		while (playAgain==true);
	}

}
