
public class Student extends Person{
	//instance variable
	private int id;
	//default
	public Student()
	{
		super();//Call to Person's default constructor
		this.id = 0;
	}
	//parameterized
	public Student(String aName, int anID)
	{
		super(aName);//Call to Person's parameterized constructor
		this.setId(anID);
	}
	//Accessor
	public int getId() {
		return id;
	}
	//Mutator
	public void setId(int id) {
		if(id >= 0)
		{
			this.id = id;//this. makes sure you call your instance variable instead of equaling your parameter to your parameter	
		}
	}
	//toString
	public String toString()
	{
		return super.toString()+"\nID: "+this.id;
	}
	//equals
	public boolean equals(Student aStudent)
	{
		return aStudent != null &&
				super.equals(aStudent) &&
				this.id == aStudent.getId();
	}

}

