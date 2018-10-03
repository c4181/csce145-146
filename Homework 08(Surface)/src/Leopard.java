
public class Leopard extends Cat{
	private int numberOfSpots;
	
	public Leopard()
	{
		super();
		this.numberOfSpots = 0;
	}
	public Leopard(String aName, double aWeight, String aMood, int aNumberOfSpots)
	{
		super(aName, aWeight, aMood);
		this.setNumberOfSpots(aNumberOfSpots);
	}
	//Accessors
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	//Mutators
	public void setNumberOfSpots(int aNumberOfSpots)
	{
		if(aNumberOfSpots >= 0)
		{
			this.numberOfSpots = aNumberOfSpots;
		}
	}
	//Other Methods
	public String toString()
	{
		return super.toString()+"Number of Spots: "+this.numberOfSpots;
	}
	public boolean equals(Leopard aLeopard)
	{
		return aLeopard != null &&
				this.numberOfSpots == aLeopard.getNumberOfSpots() &&
				super.equals(aLeopard);
	}
}
