
public class Animal {
	private String name;
	private double weight;
	
	public Animal()
	{
		this.name = "No one yet";
		this.weight = 0.0;
	}
	public Animal(String aName, double aWeight)
	{
		this.setName(aName);
		this.setWeight(aWeight);
	}
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0)
		{
			this.weight = aWeight;
		}
		else
		{
			System.out.println("Invalid Weight");
		}
	}
	//Other Methods
	public String toString()
	{
		return "Name: "+this.name+"Weight: "+this.weight;
	}
	public boolean equals(Animal anAnimal)
	{
		return anAnimal != null &&
				this.name.equals(anAnimal.getName()) &&
				this.weight == anAnimal.getWeight();
	}
}
	
