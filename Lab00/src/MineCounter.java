/*
 * Written by Christopher Moyer
 */
import java.util.Scanner;
import java.util.Random;

public class MineCounter {
	public static final int BOARD_SIZE = 10;
	public static final int NUMBER_OF_MINES = 10;
	enum Space {Empty, Mine};
	
	public static void main(String[] args) {
		
		Random r = new Random();
		//Variables
		int minesCreated = 0;
		
		//Create and initialize all spaces to empty & draw empty board
		System.out.println("Creating empty board");
		Space board[][] = new Space[BOARD_SIZE][BOARD_SIZE];
		for(int y=0;y<board.length;y++)
		{
			for(int x=0;x<board[y].length;x++)
			{
				board[y][x] = Space.Empty;
				System.out.print("-");
			}
			System.out.println();
		}
		
		//Insert Mines
		while(minesCreated<NUMBER_OF_MINES)
		{
			int newMineX = r.nextInt(BOARD_SIZE);
			int newMineY = r.nextInt(BOARD_SIZE);
			
			if(board[newMineY][newMineX] == Space.Empty)
			{
				board[newMineY][newMineX] = Space.Mine;
				minesCreated++;
			}
		}
		
		//Draw Board With Mines
		System.out.println("Placing mines");
		for(int y=0;y<board.length;y++)
		{
			for(int x=0;x<board[y].length;x++)
			{
				switch(board[y][x])
				{
				case Empty:
					System.out.print("-");
					break;
				case Mine:
					System.out.print("*");
					break;
				default:
					System.out.print("?");
				}
			}
			System.out.println();
		}
		
		//Count Mines
		System.out.println("Performing mine count");
		for(int y=0;y<board.length;y++)
		{
			int mineCount=0;
			for(int x=0;x<board.length;x++)
			{
				mineCount=0;
				//Each if statement checks a different direction. Adds +1 to count if Space is a mine
				
				if(y-1!=-1 && board[y-1][x] == Space.Mine)
				{
					mineCount++;
				}
				if(y+1!=BOARD_SIZE && board[y+1][x] == Space.Mine)
				{
					mineCount++;
				}
				if(x-1!=-1 && board[y][x-1] == Space.Mine)
				{
					mineCount++;
				}
				if(x+1!=BOARD_SIZE && board[y][x+1] == Space.Mine)
				{
					mineCount++;
				}
				if(y-1!=-1 && x-1!=-1 && board[y-1][x-1] == Space.Mine)
				{
					mineCount++;
				}
				if(x+1!=BOARD_SIZE && y+1!=BOARD_SIZE && board[y+1][x+1] == Space.Mine)
				{
					mineCount++;
				}
				
				//Write Count to board
				if(board[y][x] == Space.Empty)
				{
					switch(mineCount)
					{
						case 0:
							System.out.print("0");
							break;
						case 1:
							System.out.print("1");
							break;
						case 2:
							System.out.print("2");
							break;
						case 3:
							System.out.print("3");
							break;
						case 4:
							System.out.print("4");
							break;
						case 5:
							System.out.print("5");
							break;
						case 6:
							System.out.print("6");
							break;
					}
				}
				else // Writes a star for mines
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

}
