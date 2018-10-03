//Written by Andrew Denman and Christopher Moyer
public class Square {
	//variables
	private int length;
	
	//constructors
	public Square()
	{
		this.length = 1;
	}
	public Square(int aLength)
	throws DimensionException
	{
		this.setLength(aLength);
	}
	
	//accessors
	public int getLength()
	{
		return this.length;
	}
	//mutator
	public void setLength(int aLength)
	throws DimensionException
	{
		if(aLength > 1)
		{
			this.length = aLength;
		}
		else
		{
			throw new DimensionException();
		}
	}
	//methods
	public void draw()
	{
		for(int i = 0; i<this.length; i++)
		{
			for(int j =0; j<this.length;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int getArea()
	{
		return this.length * this.length;
	}
	public int getPerimeter()
	{
		return this.length*4;
	}
}
