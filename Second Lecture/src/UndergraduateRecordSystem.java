import java.util.Scanner;
import java.io.*;
public class UndergraduateRecordSystem {
	public static final String DELIM = "\t";
	public static void recordToFile(Ugrad[] uGrad, String fileName, boolean append)
	{
		if(uGrad == null || fileName == null)
			return;
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			//Header
			fileWriter.println("Num Students"+DELIM+uGrad.length);
			//Body
			for(int i=0;i<uGrad.length;i++)
			{
				fileWriter.println(uGrad[i].getName() + DELIM +
						uGrad[i].getId() + DELIM +
						uGrad[i].getLevel());
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Ugrad[] readFromFile(String fileName)
	{
		if(fileName == null)
			return null;
		try 
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			//Read the header
			/* 
			String fileLine = fileScanner.nextLine();
			String[] splitString = fileLine.split(DELIM);
			Ugrad[] retUgrad;
			if(splitString.length == 2)//Formatted correctly
				retUgrad = new Ugrad[Integer.parseInt(splitString[1])];
			else//Not Formatted Correctly
			{
				System.out.println("Incorrect Header");
				return null;
			}
			*/
			//This version works if there is no header
			//1st pass Count amount of stuff
			int uGradFileCount = 0;
			while(fileScanner.hasNextLine())
			{
				uGradFileCount++;
				fileScanner.hasNextLine();
			}
			fileScanner = new Scanner(new File(fileName));
			String fileLine;
			String[] splitString;
			Ugrad[] retUgrad = new Ugrad[uGradFileCount];
			//Body
			int uGradCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitString = fileLine.split(DELIM);
				if(splitString.length == 3)
				{
					String name = splitString[0];
					int id = Integer.parseInt(splitString[1]);
					int level = Integer.parseInt(splitString[2]);
					retUgrad[uGradCount] = new Ugrad(name, id, level);
					uGradCount++;
				}
			}
			fileScanner.close();
			return retUgrad;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public static void main(String[] args) {
		
	}

}
