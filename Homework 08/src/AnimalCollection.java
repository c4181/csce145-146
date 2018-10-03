
public class AnimalCollection {
	private static int ANIMAL_ARRAY_SIZE = 10;
	private Animal[] animals;
	
	public AnimalCollection()
	{
		animals = new Animal[ANIMAL_ARRAY_SIZE];
	}
	public void addAnimal(Animal anAnimal)
	{
		if(animals[animals.length-1] != null)
		{
			System.out.println("The collection is full!");
			return;
		}
		for(int i=0; i<animals.length;i++)
		{
			if(animals[i] == null)
			{
				animals[i] = anAnimal;
				break;
			}
		}
	}
	public void removeAnimal(String aName)
	{
		int removeIndex=-1;
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i]!=null && aName.equals(animals[i].getName()))
			{
				removeIndex=i;
			}
		}
		if(removeIndex==-1)
		{
			System.out.println("Animal Not Found");
		}
		else
		{
			for(int i=removeIndex;i<animals.length-1;i++)
			{
				animals[i] = animals[i+1];
			}
			animals[animals.length-1] = null;
		}
		
	}
	public void printAnimals()
	{
		System.out.println("Current Collection");
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i]==null)
			{
				break;
			}
			else
			{	
				System.out.println(animals[i]);
			}
		}
	}
}
