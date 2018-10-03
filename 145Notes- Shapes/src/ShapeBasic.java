
public class ShapeBasic implements ShapeInterface{
	private int offset;
	public ShapeBasic()
	{
		this.offset = 0;
	}
	public ShapeBasic(int anOffset)
	{
		this.setOffset(anOffset);
	}
	public int getOffset()
	{
		return this.offset;
	}
	public void setOffset(int anOffset)
	{
		if(anOffset>=0)
		{
			this.offset = anOffset;
		}
	}
	public void drawAt(int lineNumber)//Skips some space and draw shape
	{
		for(int i=0;i<lineNumber;i++)
		{
			System.out.println();
		}
		this.drawHere();
	}
	public void drawHere()//This draws the shape
	{
		for(int i=0;i<this.offset;i++)
		{
			System.out.println(" ");
		}
		System.out.println("*");
	}
}
