	
public class Process {
	private int priority;
	private double time;
	private String name;
	
	public Process()
	{
		priority = 1;
		time = 0.1;
		name = "process";
	}
	public Process(String aName, int aPriority, int aTime)
	{
		this.setPriority(aPriority);
		this.setTime(aTime);
		this.setName(aName);
	}
	public int getPriority() {
		return priority;
	}
	public double getTime() {
		return time;
	}
	public String getName() {
		return name;
	}
	public void setPriority(int priority) {
		if(priority > 0)
			this.priority = priority;
	}
	public void setTime(double time) {
		if(time > 0.0)
			this.time = time;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "Process: "+this.getName()+" "+this.getPriority()+" "+this.getTime();
	}
	
	public int compareTo(Process aProcess)
	{
		if(aProcess.getPriority() > this.getPriority())
			return 1;
		else if(aProcess.getPriority() < this.getPriority())
			return -1;
		else
			return 0;
	}
	
	
}
