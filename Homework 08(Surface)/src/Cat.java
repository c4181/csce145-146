
public class Cat extends Animal {
	private String mood;
	
	public Cat()
	{
		super();
		this.mood = "No mood yet";
	}
	public Cat(String aName, double aWeight, String aMood)
	{
		super(aName, aWeight);
		this.setMood(aMood);
	}
	//Accessors
	public String getMood()
	{
		return this.mood;
	}
	//Mutators
	public void setMood(String aMood)
	{
		if(aMood.equalsIgnoreCase("sleepy") || aMood.equalsIgnoreCase("playful") || aMood.equalsIgnoreCase("hungry"))
		{
			this.mood = aMood;
		}
		else
		{
			System.out.println("Invalid mood");
		}
	}
	//Other Methods
	public String toString()
	{
		return super.toString()+"Mood: "+this.mood;
	}
	public boolean equals(Cat aCat)
	{
		return aCat != null &&
				this.mood.equals(aCat.getMood()) &&
				super.equals(aCat);
	}
}
