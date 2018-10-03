
public class Pepper {
	private String name;
	private int scovilleRating;
	
	//Constructors
	public Pepper()
	{
		this.name = "No name";
		this.scovilleRating = 0;
	}
	public Pepper(String aName, int aScovilleRating)
	{
		this.setName(aName);
		this.setScovilleRating(aScovilleRating);
	}
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public int getScovilleRating()
	{
		return this.scovilleRating;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setScovilleRating(int aScovilleRating)
	{
		if(aScovilleRating >= 0 && aScovilleRating <= 220000000)
		{
			this.scovilleRating = aScovilleRating;
		}
	}
	//Methods
	public String toString()
	{
		return this.name+" "+this.scovilleRating;
	}
}
