//1.16.2018
import java.util.Random; //import java.util.*; - wild card, imports all util
import java.util.Scanner; 
public class MarcoPoloExtremeGaidenDoublePlus {

	public static final int BOARD_SIZE = 10;
	public static final int COLD_DIST = (BOARD_SIZE/2)*(BOARD_SIZE/2);
	enum Space {Empty, Player, Walked_Path, Goal};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//Initialization 
		int pX = 0;
		int pY = 0;
		
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
		board[pX][pY] = Space.Player;
		board[gX][gY] = Space.Goal;
		System.out.println("I see you want to play this thing I guess.");
		boolean gameOver = false;
		while(!gameOver)//game loop
		{
			//Draw the board
			for(int y=0;y<board.length;y++)
			{
				for(int x=0;x<board[y].length;x++)
				{
					switch(board[x][y])
					{
					case Empty:
						System.out.print("_");
						break;
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
				}
				System.out.println();
			}
			int distance = (pX-gX)*(pX-gX)+(pY-gY)*(pY-gY);
		}
	}
	
}
