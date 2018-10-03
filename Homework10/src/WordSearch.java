import java.util.*;
import java.io.*;
public class WordSearch {
	
	public static final int BOARD_SIZE = 5;
	enum Space {visited, notVisited};
	
	public static void main(String[] args) {
		ArrayList<String> dictionary = readDictionary("dict.txt");
		char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
		
		//Initialize Board
		board[0][0] = 'R';
		board[0][1] = 'A';
		board[0][2] = 'H';
		board[0][3] = 'J';
		board[0][4] = 'M';
		board[1][0] = 'Y';
		board[1][1] = 'U';
		board[1][2] = 'W';
		board[1][3] = 'W';
		board[1][4] = 'K';
		board[2][0] = 'R';
		board[2][1] = 'X';
		board[2][2] = 'N';
		board[2][3] = 'F';
		board[2][4] = 'M';
		board[3][0] = 'Q';
		board[3][1] = 'G';
		board[3][2] = 'E';
		board[3][3] = 'E';
		board[3][4] = 'B';
		board[4][0] = 'E';
		board[4][1] = 'O';
		board[4][2] = 'A';
		board[4][3]	= 'P';
		board[4][4] = 'E';
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				System.out.println("Starting "+i+" "+j);
				for(int k=0;k<dictionary.size();k++)
				{
					if(search(board,dictionary.get(k),i,j,0))
						System.out.println(dictionary.get(k));
				}
			}
		}
	}

	
	//Checks each character in every direction starting at board[i][j] to see if it matches the given word
	public static boolean search(char[][] board, String word, int i, int j,int k)
	{
		Space[][] boardStatus = new Space[BOARD_SIZE][BOARD_SIZE];
		for(int l=0;l<boardStatus.length;l++)
			for(int m=0;m<boardStatus.length;m++)
				boardStatus[l][m] = Space.notVisited;
		if(word.length()>=2 && word.length()<=6)
			//Checks if current index matches current character
			if(board[i][j] == word.charAt(k))
			{
				boardStatus[i][j] = Space.visited;
				//Go Right
				if(j+1<board[i].length && board[i][j+1] == word.charAt(k+1))
					return search(board,word,i,j+1,k+1,boardStatus);
				//Go Left
				if(j-1>=0 && board[i][j-1] == word.charAt(k+1))
					return search(board,word,i,j-1,k+1,boardStatus);
				//Go Down
				if(i+1<board.length && board[i+1][j] == word.charAt(k+1))
					return search(board,word,i+1,j,k+1,boardStatus);
				//Go Up
				if(i-1>=0 && board[i-1][j] == word.charAt(k+1))
					return search(board,word,i-1,j,k+1,boardStatus);
				//Go Diagonal
				if(i+1<board.length && j+1<board[i].length && board[i+1][j+1] == word.charAt(k+1))
					return search(board,word,i+1,j+1,k+1,boardStatus);
				if(i-1>=0 && j-1>=0 && board[i-1][j-1] == word.charAt(k+1))
					return search(board,word,i-1,j-1,k+1,boardStatus);
				if(i+1<board.length && j-1>=0 && board[i+1][j-1] == word.charAt(k+1))
					return search(board,word,i+1,j-1,k+1,boardStatus);
				if(i-1>=0 && j+1<board.length && board[i-1][j+1] == word.charAt(k+1))
					return search(board,word,i-1,j+1,k+1,boardStatus);
			}
		return false;
	}
	public static boolean search(char[][] board, String word, int i, int j, int k, Space[][] boardStatus)
	{
		if(k==word.length()-1)
			return true;
		//Checks if out of bounds
		if(i<0 || j<0 || i>=board.length || j>=board[i].length || i<0 || j<0)
			return false;
		
			//Checks if current index matches current character
			if(board[i][j] == word.charAt(k))
			{
				boardStatus[i][j] = Space.visited;
				//Go Right
				if(j+1<board[i].length && board[i][j+1] == word.charAt(k+1) && boardStatus[i][j+1]==Space.notVisited)
					return search(board,word,i,j+1,k+1,boardStatus);
				//Go Left
				if(j-1>=0 && board[i][j-1] == word.charAt(k+1) && boardStatus[i][j-1]==Space.notVisited)
					return search(board,word,i,j-1,k+1,boardStatus);
				//Go Down
				if(i+1<board.length && board[i+1][j] == word.charAt(k+1) && boardStatus[i+1][j]==Space.notVisited)
					return search(board,word,i+1,j,k+1,boardStatus);
				//Go Up
				if(i-1>=0 && board[i-1][j] == word.charAt(k+1) && boardStatus[i-1][j]==Space.notVisited)
					return search(board,word,i-1,j,k+1,boardStatus);
				//Go Diagonal
				if(i+1<board.length && j+1<board[i].length && board[i+1][j+1] == word.charAt(k+1) && boardStatus[i+1][j+1]==Space.notVisited)
					return search(board,word,i+1,j+1,k+1,boardStatus);
				if(i-1>=0 && j-1>=0 && board[i-1][j-1] == word.charAt(k+1) && boardStatus[i-1][j-1]==Space.notVisited)
					return search(board,word,i-1,j-1,k+1,boardStatus);
				if(i+1<board.length && j-1>=0 && board[i+1][j-1] == word.charAt(k+1) && boardStatus[i+1][j-1]==Space.notVisited)
					return search(board,word,i+1,j-1,k+1,boardStatus);
				if(i-1>=0 && j+1<board.length && board[i-1][j+1] == word.charAt(k+1) && boardStatus[i-1][j+1]==Space.notVisited)
					return search(board,word,i-1,j+1,k+1,boardStatus);
			}
		
		return false;
	}
	
	//Reads file and return an Array List of strings
	public static ArrayList<String> readDictionary (String fileName) {
		if(fileName == null)
			return null;
		ArrayList<String> retList = new ArrayList<String>();
		
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
				retList.add(fileScanner.nextLine().toUpperCase());
			fileScanner.close();
			return retList;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
		

}
