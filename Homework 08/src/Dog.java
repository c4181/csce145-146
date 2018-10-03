
public class Dog extends Animal {
	private int energyLevel;
	
	public Dog()
	{
		super();
		this.energyLevel = 0;
	}
	public Dog(String aName, double aWeight, int anEnergyLevel)
	{
		super(aName,aWeight);
		this.setEnergyLevel(anEnergyLevel);
	}
	//Accessors
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	//Mutators
	public void setEnergyLevel(int anEnergyLevel)
	{
		if(anEnergyLevel >= 0 && anEnergyLevel <= 100)
		{
			this.energyLevel = anEnergyLevel;
		}
	}
	//Other Methods
	public String toString()
	{
		return super.toString()+"Energy Level: "+this.energyLevel+" ";
	}
	public boolean equals(Dog aDog)
	{
		return aDog != null &&
				this.energyLevel == aDog.getEnergyLevel() &&
				super.equals(aDog);
	}
}
