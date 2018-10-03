
public class Circle implements Shape {
	private double radius;
	
	public Circle()
	{
		this.radius=1.0;
	}
	public Circle(double aRadius)
	{
		this.setRadius(aRadius);
	}
	//Accessors
	public double getRadius()
	{
		return this.radius;
	}
	//Mutators
	public void setRadius(double aRadius)
	{
		if(aRadius > 0.0)
		{
			this.radius = aRadius;
		}
		else
		{
			this.radius = 1.0;
		}
	}
	//Methods
	public double getArea()
	{
		return Math.PI*(this.radius*this.radius);
	}
	public String toString()
	{
		return "Circle "+" Radius: "+this.radius+" Area "+this.getArea();
	}
	public String getShapeType()
	{
		return "Circle";
	}
	public int compareTo(Shape aShape)
	{
		if(aShape.getArea() < this.getArea())
			return 1;
		if(aShape.getArea() > this.getArea())
			return -1;
		else 
			return 0;
	}
}
