import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Showcase extends Prize{
	private Prize[] prizes;
	private Prize[]randomPrizes;
	
	Random r = new Random();
	
	private static final int ARRAY_SIZE = 50;
	private static final String DELIM = "\t";
	private static final int NUMBER_OF_PRIZES = 5;
	public Showcase()
	{
		prizes = readPrizeFile("prizeList.txt");	
		randomPrizes = new Prize[NUMBER_OF_PRIZES];
		for(int i=0;i<NUMBER_OF_PRIZES;i++)
		{
			randomPrizes[i] = prizes[r.nextInt(ARRAY_SIZE)];
		}
	}
	
	public void printPrizes()
	{
		for(int i=0;i<randomPrizes.length;i++)
		{
			System.out.println(randomPrizes[i]);
		}
	}
	
	public int getPrizeValues()
	{
		int prizeValues = 0;
		for(int i=0;i<randomPrizes.length;i++)
		{
			prizeValues += randomPrizes[i].getPrice();
		}
		return prizeValues;
	}
	
	public Prize[] createRandomPrizeList()
	{
		randomPrizes = new Prize[NUMBER_OF_PRIZES];
		for(int i=0;i<NUMBER_OF_PRIZES;i++)
		{
			randomPrizes[i] = prizes[r.nextInt(ARRAY_SIZE)];
		}
		return randomPrizes;
	}
	
	//Reads prize list and returns a Prize[]
	public static Prize[] readPrizeFile(String fileName)
	{
		if(fileName==null)
			return null;
		
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			int prizeCount = 0;
			String fileLine;
			String[] splitString;
			Prize[] returnPrizes = new Prize[ARRAY_SIZE];
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitString = fileLine.split(DELIM);
				if(splitString.length == 2)
				{
					String name = splitString[0];
					int price = Integer.parseInt(splitString[1]);
					returnPrizes[prizeCount] = new Prize(name,price);
					prizeCount++;
				}
			}
			fileScanner.close();
			return returnPrizes;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
}
