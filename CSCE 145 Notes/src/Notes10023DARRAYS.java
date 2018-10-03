//Marco Polo Game
import java.util.Scanner;
import java.util.Random; //picks a random goal position
public class Notes10023DARRAYS {
	
	public static final int BOARD_SIZE = 10;
	public static final int COLD_DIST = (BOARD_SIZE/2) * (BOARD_SIZE/2);
	public static final int WARM_DIST = (BOARD_SIZE/4) * (BOARD_SIZE/4);
	enum Space {Empty, Player, Walked_Path, Goal}; //creates a type space
	
	public static void main(String[] args) {
		
		int pX = 0;
		int pY = 0;
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		Scanner keyboard = new Scanner(System.in);
		Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
		for(int y = 0; y < board.length; y++)
		{
			for(int x = 0; x < board[y].length; x++)
			{
				board[y][x] = Space.Empty;
			}
		}
		board[pY][pX] = Space.Player;
		board[gY][gX] = Space.Goal;
		System.out.println("Welcome to Marco Polo Extreme Gaiden");
		boolean gameOver = false;
		while(gameOver == false) //Game Loop
		{
			//draw the board
			for(int y = 0; y < board.length; y++)
			{
				for(int x = 0; x < board[y].length; x++)
				switch(board[y][x])
				{
				case Empty:
				System.out.print("_");
				break; //only with switch, not loops
				case Player:
					System.out.print("X");
					break;
				case Walked_Path:
					System.out.print("#");
					break;
				case Goal:
					System.out.print("_");
					break;
				default:
					System.out.print("?");
				break;
				}
				System.out.println();
			}
			
		 //outside of loop
		int dist = (pX - gX) * (pX - gX) + (pY - gY) * (pY - gY); // Squared distance
		if(dist > COLD_DIST)
		{
			System.out.println("You're cold.");
		}
		else if(dist > WARM_DIST)
		{
			System.out.println("You're warm");
		}
		else
		{
			System.out.println("You're hot!!!!");
		}
		System.out.println("Enter 9 to quit or 1, 0, or negative 1 to move the x.");
		int dX = keyboard.nextInt();
		if(dX == 9)
		{
			System.out.println("Enter 1, 0, or -1 to move in the Y");
			int dY = keyboard.nextInt();
			if(dX < -1 || dX > 1)
			{
				dX = 0;
			}
			if (dY < -1 || dY > 1)
			{
				dY = 0;
			}
			//Make sure still in bounds
			pX += dX;
			pY += dY;
			if(pX < 0)
			{
				pX = 0;
			}
			else if(pX > BOARD_SIZE-1)
			{
				pX = BOARD_SIZE-1;
			}
			if(pY < 0)
			{
				pY = 0;
			}
			else if(pY > BOARD_SIZE-1)
			{
				pY = BOARD_SIZE;
			}
			//See if we won
			if(board[pY][pX] == Space.Goal)
			{
				System.out.println("You win!");
				gameOver = true;
			}
			board[pY][pX] = Space.Player;
			
			
		}
		}
		
		
		
		
		
	}
	
	

}
