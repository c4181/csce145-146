
public class Ugrad extends Student{
	private int level;//1 fresh 2 soph 3 jun 4 sen 5 supsen
	public Ugrad()
	{
		super();//default of student
		this.level = 1;
	}
	public Ugrad(String aName, int anID, int aLevel)
	{
		super(aName, anID);
		//TODO call mutator
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level >= 1 && level <= 5)
		{
			this.level = level;
		}
	}
	public String toString()
	{
		return super.toString()+"\nLevel:"+this.level;
	}
	public boolean equals(Ugrad otherUndergraduate)
	{
		return equals((Student)otherUndergraduate) &&
				(this.level == otherUndergraduate.level);
	}

}
