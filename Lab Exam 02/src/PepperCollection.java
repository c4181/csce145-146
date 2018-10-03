
public class PepperCollection {
	private Pepper[] peppers;
	
	//Constructors
	public PepperCollection()
	{
		peppers = new Pepper[10];
	}
	
	//Methods
	public void addPepper(Pepper aPepper)
	{
		if(peppers[peppers.length-1] != null)
		{
			System.out.println("The collection is full!");
			return;
		}
		for(int i=0; i<peppers.length;i++)
		{
			if(peppers[i] == null)
			{
				peppers[i] = aPepper;
				break;
			}
		}
	}
	public void sortPeppers()
	{
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i=0;i<peppers.length-1 && peppers[i+1]!=null;i++)
			{
				if(peppers[i].getScovilleRating() < peppers[i+1].getScovilleRating()) //swap
				{
				    Pepper temp = peppers[i];
					peppers[i] = peppers[i+1];
					peppers[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	public void printPeppers()
	{
		for(int i=0;i<peppers.length;i++)
		{	
			if(peppers[i] != null)
			{
				System.out.println(peppers[i]);
			}
		}
	}
}
