/*
 * Written by Christopher Moyer
 */

import java.util.Scanner;
import java.util.Random;

public class MineWalker {
	
	public static final int BOARD_SIZE = 10;
	public static final int NUMBER_OF_MINES = (BOARD_SIZE * BOARD_SIZE) / 10;
	enum Space {Empty, Player, Mine, Ice_Cream};
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean playAgain = true;
		
		//Do-While Loop for Play Again functionality
		do {
	   // Variables
		boolean gameOver = false;
		int playerX = 0;
		int playerY = 0;
		int goalX = r.nextInt(BOARD_SIZE);
		int goalY = r.nextInt(BOARD_SIZE);
		
		//Initialize Board
		Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
		for (int y = 0; y < board.length; y++)
		{
			for(int x = 0; x < board[y].length; x++)
			{
				board[y][x] = Space.Empty;
			}
		}
		board[playerY][playerX] = Space.Player;
		board [goalY][goalX] = Space.Ice_Cream;
		
		//Insert Mines
		for (int minesCreated = 0; minesCreated < NUMBER_OF_MINES;)
		{
			int newMineX = r.nextInt(BOARD_SIZE);
			int newMineY = r.nextInt(BOARD_SIZE);
			
			while((newMineX==playerX || newMineX==goalX) && (newMineY==playerY || newMineY==goalY))
			{
				newMineX = r.nextInt(BOARD_SIZE);
				newMineY = r.nextInt(BOARD_SIZE);
			}
			
			for (int j = 0; j < NUMBER_OF_MINES; j++)
			{
				if (board[newMineY][newMineX] == Space.Empty)
				{
					board[newMineY][newMineX] = Space.Mine;
					minesCreated++;
				}
			}
		}
		
		System.out.println("Welcome to Mine Walker.  Get the ice cream cone and avoid the mines"
				+ "\nThe Ice Cream Cone is \"^\"");
		
		//Game Loop
		while (gameOver == false)
		{
		//Draw Board
		for (int y=0; y < board.length; y++)
		{
			for (int x=0; x < board[y].length; x++)
				switch(board[y][x])
				{
				case Empty:
					System.out.print("_");
					break;
				case Player:
					System.out.print("X");
					break;
				case Mine:
					System.out.print("_");
					break;
				case Ice_Cream:
					System.out.print("^");
					break;
				}
			System.out.println();
		}
		board[playerY][playerX] = Space.Empty;
		System.out.println("Enter either a -1, 0, or 1 to move left or right or 9 to quit");
		int dx=keyboard.nextInt();
		//Ends Game
		if (dx == 9)
		{
			System.out.println("Bye");
			System.exit(0);
		}
		System.out.println("Enter either a -1, 0, or 1 to move up or down");
		int dy=keyboard.nextInt();
		
		//Check for proper inputs
		if (dx < -1 || dx > 1)
		{
			dx = 0;
			System.out.println("Improper left to right value. You have not been moved that direction.");
		}
		if (dy < -1 || dy > 1)
		{
			dy = 0;
			System.out.println("Improper up to down value. You have not been moved that direction");
		}
		
		//Check if in bound of board
		playerX += dx;
		playerY += dy;
		if (playerX < 0)
		{
			playerX = 0;
			System.out.println("Out of Bounds. You have been moved.");
		}
		else if (playerX > BOARD_SIZE-1)
		{
			playerX = BOARD_SIZE-1;
			System.out.println("Out of Bounds. You have been moved.");
		}
		if (playerY < 0)
		{
			playerY = 0;
			System.out.println("Out of Bounds. You have been moved.");
		}
		else if (playerY > BOARD_SIZE-1)
		{
			playerY = BOARD_SIZE-1;
			System.out.println("Out of Bounds. You have been moved.");
		}
		
		//Check if on Mine
		if(board[playerY][playerX] == Space.Mine)
			{
				System.out.println("You have stepped on a mine. Game Over!");
				gameOver = true;
			}
		//Check if on Ice Cream
		if(board[playerY][playerX] == Space.Ice_Cream)
		{
			System.out.println("You Win!");
			gameOver=true;
		}
		board[playerY][playerX] = Space.Player;
		keyboard.nextLine();
		}
		
		//Play Again?
		System.out.println("Do you want to play again?");
		String answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println();
		}
		else
		{
			System.out.println("Goodbye!");
			playAgain = false;
		}
		
		
		
		}
		while (playAgain == true);
		

	}

}
