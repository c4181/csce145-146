
public class ShapeCollection {
	private static final int SHAPE_ARRAY_SIZE = 10;
	private Shape[] shapes;
	
	public ShapeCollection()
	{
		shapes = new Shape[SHAPE_ARRAY_SIZE];
	}
	
	private void sortShapes()
	{
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < shapes.length-1; i++)
			{
				if(shapes[i] != null && shapes[i+1] != null && shapes[i].getArea() > shapes[i + 1].getArea()) //swap
				{
					Shape temp = shapes[i];
					shapes[i] = shapes[i+1];
					shapes[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	
	public void addShape(Shape aShape) //Adds a shape in the first index that isn't null
	{
		if(shapes[shapes.length-1] != null)
		{
			System.out.println("The collection is full!");
			return;
		}
		for(int i=0; i<shapes.length;i++)
		{
			if(shapes[i] == null)
			{
				shapes[i] = aShape;
				sortShapes();
				break;
			}
		}
	}
	
	public void removeShape(String aShape, double anArea)
	{	//Searches for a shape that matches aShape & anArea
		int removeIndex=-1;
		for(int i=0;i<shapes.length;i++)
		{
			if(shapes[i]!=null && aShape.equals(shapes[i].getShapeType()) && anArea == shapes[i].getArea())
			{
				removeIndex=i;
			}
		}
		if(removeIndex==-1)
		{
			System.out.println("Animal Not Found");
		}//Removes the shape matching aShape & anArea, Shifts remaing shapes left 1 index
		else
		{
			for(int i=removeIndex;i<shapes.length-1;i++)
			{
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
	
	public void printShapes()
	{
		for(int i=0; i<shapes.length;i++)
		{
			if(shapes[i] == null)
			{
				break;
			}
			else
			{
				System.out.println(shapes[i]);
			}
		}
	}
}
