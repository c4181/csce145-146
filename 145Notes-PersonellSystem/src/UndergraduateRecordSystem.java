import java.io.*;
import java.util.Scanner;
public class UndergraduateRecordSystem {
	public static final String DELIM = "\t";
	public static void recordToFile(Undergraduate[] uGrads, String fileName, boolean append)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			//Write header
			fileWriter.println("Number of Students"+DELIM+uGrads.length);
			//Write Body
			for(int i=0;i<uGrads.length;i++)
			{
				fileWriter.println(uGrads[i].getName() + DELIM + uGrads[i].getStudentNumber() + DELIM + uGrads[i].getLevel());
			}
			//Don't forget
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Undergraduate[] readFromFile(String fileName)
	{
		if(fileName==null)
			return null;
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			//Read header
			String fileLine = fileScanner.nextLine(); //Reads line
			String[] splitLines = fileLine.split(DELIM); //Splits with tab
			Undergraduate[] ugrads;
			if(splitLines.length == 2)
			{
				ugrads = new Undergraduate[Integer.parseInt(splitLines[1])];
			}
			else
			{
				System.out.println("File formatted incorrectly");
				return null;
			}
			int uGradCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(DELIM);
				if(splitLines.length == 3)
				{
					String name = splitLines[0];
					int sNum = Integer.parseInt(splitLines[1]);
					int level = Integer.parseInt(splitLines[2]);
					Undergraduate newUgrad = new (Undergraduate9name,sNum,level);
					uGrads[ugradCount] = newUgrad;
					ugradCount++;
				}
			}
			fileScanner.close();
			return ugrads;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	public static void main(String[] args) {
		
		

	}

}
