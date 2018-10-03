import java.util.*;
import java.io.*;
public class TacoManager {
	private GenLinkedList<Taco> tacos;
	public static final String DELIM = "\t";
	public TacoManager()
	{
		tacos = new GenLinkedList<Taco>();
	}
	public void addTaco(Taco aTaco)
	{
		tacos.insert(aTaco);
	}
	public void deleteTaco(Taco aTaco)
	{
		tacos.resetCurrent();
		while(tacos.moreToIterate())
		{
			if(tacos.getCurrent().equals(aTaco))
			{
				tacos.deleteCurrent();
				break;
			}
			tacos.moveCurrentForward();
		}
	}
	public void printTacos()
	{
		tacos.print();
	}
	public void readTacoFile(String fileName)
	{
		if(fileName == null)
			return;
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			tacos = new GenLinkedList<Taco>();
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length != 4)
					continue;
				String name = splitLines[0];
				String location = splitLines[1];
				double price = Double.parseDouble(splitLines[2]);
				int rating = Integer.parseInt(splitLines[3]);
				Taco newTaco = new Taco(name,location,price,rating);
				tacos.insert(newTaco);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
