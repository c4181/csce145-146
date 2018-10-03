
public class Ugrad extends Student {
	private int level; //0 fesh 1 soph 2 junior 3 senior 4 sssgsenior
	public Ugrad()
	{
		super();//Default constructor of student
		this.level = 0;
	}
	public Ugrad(String aName, int anID, int aLevel)
	{
		super(aName, anID);
		this.setLevel(aLevel);
	}
	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int aLevel)
	{
		if(aLevel >= 0 && aLevel <= 4)
		{
			this.level = aLevel;
		}
	}
	public String toString()
	{
		return super.toString()+" "+this.level;
	}
	public boolean equals(Ugrad anUgrad)
	{
		return anUgrad != null &&
				super.equals(anUgrad)&&
				this.level == anUgrad.getLevel();
	}
}
