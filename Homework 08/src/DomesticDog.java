
public class DomesticDog extends Dog{
	private String type;
	
	public DomesticDog()
	{
		super();
		this.type = "No Type";
	}
	public DomesticDog(String aName, double aWeight, int anEngeryLevel, String aType)
	{
		super(aName,aWeight,anEngeryLevel);
		//TODO
	}
	//Accessors
	public String getType()
	{
		return this.type;
	}
	//Mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("Retriever") || aType.equalsIgnoreCase("Terrier") || aType.equalsIgnoreCase("Husky") || aType.equalsIgnoreCase("Yappy") || aType.equalsIgnoreCase("Mutt"))
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
		return super.toString()+"Type: "+this.getType()+" ";
	}
	public boolean equals(DomesticDog aDomesticDog)
	{
		return aDomesticDog != null &&
				this.type.equals(aDomesticDog.getType()) &&
				super.equals(aDomesticDog);
	}
}
