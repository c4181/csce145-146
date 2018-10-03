
public class Student extends Person {
	private int id;
	
	public Student()
	{
		super(); //Call to Person's default constructor
		this.id = 0;
	}
	public Student(String aName, int anID)
	{
		super(aName);//Call to Persons paramaterized Contructus
		this.setID(anID);
	}
	public int getID()
	{
		return this.id;
	}
	public void setID(int anID)
	{
		if(anID >= 0)
		{
			this.id = anID;
		}
	}
	public String toString()
	{
		return super.toString()+" "+this.id;
	}
	public boolean equals(Student aStudent)
	{
		return aStudent != null &&
				this.id == aStudent.getID() &&
				super.equals(aStudent); //Same as next line
				//super.getName().equals(aStudent.getName());
	}
}
