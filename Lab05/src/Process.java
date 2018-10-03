/*
 * Written by Christophe Moyer
 */
public class Process {
	private String name;
	private double completionTime;
	
	public Process()
	{
		this.name = "None";
		this.completionTime = 0.0;
	}
	public Process(String aName, double aCompletionTime)
	{
		this.setName(aName);
		this.setCompletionTime(aCompletionTime);
	}
	public String getName() {
		return name;
	}
	public double getCompletionTime() {
		return completionTime;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompletionTime(double completionTime) {
		if(completionTime>=0.0)
			this.completionTime = completionTime;
	}
	
	public String toString()
	{
		return "Name: "+this.name+" Completion Time: "+this.completionTime;
	}
	
	
}
