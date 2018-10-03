
public class Rectangle implements Shape	{
	private double length;
	private double width;
	
	public Rectangle()
	{
		this.length = 1.0;
		this.width = 1.0;
	}
	public Rectangle(double aLength, double aWidth)
	{
		this.setLength(aLength);
		this.setWidth(aWidth);
	}
	//Accessors
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	//Mutatros
	public void setLength(double aLength)
	{
		if(aLength > 0.0)
		{
			this.length = aLength;
		}
		else
		{
			this.length = 1.0;
		}
	}
	public void setWidth(double aWidth)
	{
		if(aWidth > 0.0)
		{
			this.width = aWidth;
		}
		else
		{
			this.width = 1.0;
		}
	}
	//Methods
	public double getArea()
	{
		return this.length*this.width;
	}
	public String toString()
	{
		return "Rectangle "+"Side 1: "+this.getLength()+" Side 2: "+this.getWidth()+" Area: "+this.getArea();
	}
	public String getShapeType()
	{
		return "Rectangle";
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
