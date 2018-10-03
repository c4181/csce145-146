
public class Wolf extends Dog {
	private String packLeaderName;
	
	public Wolf()
	{
		super();
		this.packLeaderName = "No Name Yet";
	}
	public Wolf(String aName, double aWeight, int anEnergyLevel, String aPackLeaderName)
	{
		super(aName,aWeight,anEnergyLevel);
		this.setPackLeaderName(aPackLeaderName);
	}
	//Accessors
	public String getPackLeaderName()
	{
		return this.packLeaderName;
	}
	//Mutators
	public void setPackLeaderName(String aPackLeaderName)
	{
		this.packLeaderName = aPackLeaderName;
	}
	//Other Methods
	public String toString()
	{
		return super.toString()+"Pack Leader Name: "+this.getPackLeaderName()+" ";
	}
	public boolean equals(Wolf aWolf)
	{
		return aWolf != null &&
				this.packLeaderName.equals(aWolf.getPackLeaderName()) &&
				super.equals(aWolf);
	}
}
