
public class HouseCat extends Cat{
	private String type;
	
	public HouseCat()
	{
		super();
		this.type = "No type assigned";
	}
	public HouseCat(String aName, double aWeight, String aMood, String aType)
	{
		super(aName, aWeight, aMood);
		//TODO
	}
	public String getType()
	{
		return this.type;
	}
	//Methods
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("Short Hair") || aType.equalsIgnoreCase("Bombay") || aType.equalsIgnoreCase("Ragdoll") || aType.equalsIgnoreCase("Sphinx") || aType.equalsIgnoreCase("Scottish Fold"))
		{
			this.type = aType;
		}
		else
		{
			System.out.println("Invalid Type");
		}
	}
	//Other Methods
	public String toString()
	{
		return super.toString()+"Type: "+this.type;
	}
	public boolean equals(HouseCat aHouseCat)
	{
		return aHouseCat != null &&
				this.type.equals(aHouseCat.getType()) &&
				super.equals(aHouseCat);
	}
}
