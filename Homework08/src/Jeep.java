
public class Jeep implements Comparable<Jeep> {
	private String name;
	private double weight;
	private int horsepower;
	
	public Jeep(String aName, double aWeight, int aHorsepower)
	{
		this.setName(aName);
		this.setWeight(aWeight);
		this.setHorsepower(aHorsepower);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight > 0)
			this.weight = weight;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		if(horsepower > 0)
			this.horsepower = horsepower;
	}
	
	public String toString()
	{
		return "Name: "+this.getName()+" Weight: "+this.getWeight()+" Horsepower: "+this.getHorsepower();
	}
	
	public int compareTo(Jeep aJeep)
	{
		if(aJeep.getHorsepower() > this.getHorsepower())
			return 1;
		else if(aJeep.getHorsepower() < this.getHorsepower())
			return -1;
		else
			return 0;
	}
	
}
