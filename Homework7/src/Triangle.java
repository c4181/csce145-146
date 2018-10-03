
public class Triangle implements Shape {
	private double base;
	private double height;
	
	public Triangle()
	{
		this.base = 1.0;
		this.height = 1.0;
	}
	public Triangle(double aBase, double aHeight)
	{
		this.setBase(aBase);
		this.setHeight(aHeight);
	}
	//Accessors
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	//Mutators
	public void setBase(double aBase)
	{
		if(aBase > 0)
		{
			this.base = aBase;
		}
		else
		{
			this.base = 1.0;
		}
	}
	public void setHeight(double aHeight)
	{
		if(aHeight > 0)
		{
			this.height = aHeight;
		}
		else
		{
			this.height = 1.0;
		}
	}
	//Methods
	public double getArea()
	{
		return (this.base*this.height)/2;
	}
	public String toString()
	{
		return "Right Triangle "+" Side 1: "+this.base+" Side 2: "+this.height+" Area "+this.getArea();
	}
	public String getShapeType()
	{
		return "Triangle";
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
