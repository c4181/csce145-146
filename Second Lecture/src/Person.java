
public class Person { //Define the Class
	private String name;//Instance variable / Attribute
	
	//Constructors
	public Person()//default
	{
		this.name = "No name yet";
	}
	public Person(String aName)//Parameterized
	{
		//call the mutator
		this.setName(aName);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	
	//Mutators
	public void setName(String aName) //void b/c setting info not getting any (void doesnt take in any info)
	{
		this.name = aName;
	}
	
	//toString
	public String toString() //comparing two string together?? ALWAYS use .equals
	{
		return "Name: "+this.name;
	}
	//equals
	public boolean equals(Person aPerson)//comparing default against another one
	{
		//could do if else, this is a compound boolean
		return aPerson != null &&  //you have to say that person is not a zero
				this.name.equals(aPerson.getName());
	}
	
	
}
