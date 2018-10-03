
public class Fruit implements Comparable<Fruit>{
	private String type;
	private double weight;
	
	public Fruit(String aType, double aWeight)
	{
		this.setType(aType);
		this.setWeight(aWeight);
	}

	public String getType() {
		return type;
	}

	public double getWeight() {
		return weight;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWeight(double weight) {
		if(weight>0)
			this.weight = weight;
	}
	
	public String toString()
	{
		return this.type+" "+this.weight;
	}
	
	public int compareTo(Fruit aFruit)
	{
		if(aFruit.getWeight() < this.getWeight())
			return 1;
		if(aFruit.getWeight() > this.getWeight())
			return -1;
		if(aFruit.getWeight()==this.getWeight() && aFruit.getType()==this.getType())
			return 0;
		else
			return 1;
	}
}
