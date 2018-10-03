import java.io.*;
import java.util.Scanner;
public class TacoDatabase {
	private Taco[] tacos;
	public static final int DEFAULT_SIZE = 100;
	public static final String DELIM = "\t";//Delimmeter
	public TacoDatabase()
	{
		tacos = new Taco[DEFAULT_SIZE];
	}
	
	//Constructor
	public TacoDatabase(int size)
	{
		if(size > 0)
		{
			tacos = new Taco[size];
		}
	}
	
	//Accessors
	public Taco[] getTacos()
	{
		return this.tacos;
	}
	
	//NO MUSATORS!?!?!?
	
	public void printTacos()
	{
		for(int i=0;i<tacos.length;i++)
		{
			if(tacos[i] == null)
			{
				break;
			}
			else
			{
			System.out.println(tacos[i]);
			}
		}
	}
	//Only adding new tacos to the end of the arrary
	//Making sure I have no gaps in the array
	public void addTaco(Taco aTaco)
	{
		if(tacos[tacos.length-1] != null)
		{
			System.out.println("The array is full");
			return;
		}
		for(int i=0;i<tacos.length;i++)
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco;
				break;
			}
		}
	}
	public void removeATaco(String aTacoName)
	{
		int removeIndex = -1;
		for(int i=0;i<tacos.length;i++)
		{
			if(tacos[i] != null && tacos[i].getName().equals(aTacoName))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex ==-1)
		{
			System.out.println("Taco not fond");
		}
		else
		{
			for(int i=0;i<tacos.length;i++)
			{
				tacos[i] = tacos[i+1];
			}
			tacos[tacos.length-1] = null;
		}
	}
	public void WriteTacoDBFile(String aFileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			for(Taco taco: tacos)
			{
				if(taco==null)
				{
					break;
				}
				fileWriter.println(taco.getName()+DELIM+taco.getLocation()+DELIM+taco.getPrice());
			}
			//DONT FORGET THIS!!!
			fileWriter.close();
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
	public void ReadTacoDBFile(String aFileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			//First pass count the elements
			int tacoCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
				tacoCount++;
			}
			tacos = new Taco[tacoCount];
			//Second pass process the elements
			fileScanner = new Scanner(new File(aFileName));//Reconstruct to start from beginning of file
			int tacoCountDracula = 0;
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitStrings = fileLine.split(DELIM);
				if(splitStrings.length == 3)
				{
					String name = splitStrings[0];
					String location = splitStrings[1];
					double price = Double.parseDouble(splitStrings[2]);
					tacos[tacoCountDracula] = new Taco(name,location,price);
					tacoCountDracula++;
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
