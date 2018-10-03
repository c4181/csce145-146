import java.io.*;
import java.util.Scanner;
public class TacoDatabase {
	private Taco[] tacos;
	public static final int DEFAULT_SIZE = 100;
	public static final String DELIM = "\t";
	public static final int FIELD_AMT = 3;
	
	public TacoDatabase()
	{
		tacos = new Taco[DEFAULT_SIZE];
	}
	public TacoDatabase(int size)
	{
		if(size > 0)
			tacos = new Taco[size];
	}
	public Taco[] getTacos()
	{
		return this.tacos;
	}
	//We assume that the taco array's first null element means the last taco in this array
	public void addTaco(Taco aTaco)
	{
		if(tacos[tacos.length-1] != null)//Check if array is full
			return;
		for(int i=0;i<tacos.length;i++)
		{
			if(tacos[i] == null)//We found the first empty element
			{
				tacos[i] = aTaco;
				break;
			}
		}
	}
	public void removeTaco(String aName)
	{
		int removeIndex = -1;
		for(int i=0;i<tacos.length;i++)
		{
			if(aName.equals(tacos[i].getName()))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)//No taco found with that name
			return;
		//Shift elements over by 1
		for(int i=removeIndex;i<tacos.length-1;i++)
		{
			tacos[i] = tacos[i+1];
		}
		tacos[tacos.length-1]=null;//Prevents dupicate at the end of the array
	}
	public void writeTacoDBFile(String aFileName)
	{
		if(aFileName == null)
			return;
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			for(int i=0;i<tacos.length;i++)
			{
				if(tacos[i] == null)
					break;
				fileWriter.println(tacos[i].getName()+DELIM+tacos[i].getLocation()+DELIM+tacos[i].getPrice());
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void readTacoDBFile(String aFileName)
	{
		if(aFileName == null)
			return;
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			int tacoCount = 0;
			while(fileScanner.hasNextLine())
			{
				tacoCount++;
				fileScanner.nextLine();
			}
			if(tacoCount <= 0)
				return;
			tacos = new Taco[tacoCount];
			//Second Pass
			fileScanner = new Scanner(new File(aFileName));
			String fileLine;
			String[] splitLine;
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLine = fileLine.split(DELIM);
				if(splitLine.length == FIELD_AMT)
				{
					this.addTaco(new Taco(splitLine[0],splitLine[1],Double.parseDouble(splitLine[2])));
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
