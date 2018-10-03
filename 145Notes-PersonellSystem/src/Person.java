
public class Person {
	private String name;
	
	//Constructors
	public Person()
	{
		this.name = "No name yet";
	}
	public Person (String aName)
	{
		this.setName(aName);
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public String toString()
	{
		return this.name;
	}
	public boolean equals(Person aPerson)
	{
		return aPerson != null && this.name.equals(aPerson.getName());
	}
}
