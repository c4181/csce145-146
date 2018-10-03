import java.io.File;
import java.util.Scanner;

public class ShapeTester {

	public static final String DELIM = "\t";
	public static LinkedBSTree<Shape> readShapeFile(String fileName)
	{
		
		if(fileName==null)
			return null;
		String fileLine;
		String[] splitString;
		LinkedBSTree returnTree = new LinkedBSTree();
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitString = fileLine.split(DELIM);
				String shapeType = splitString[0];
				//Checks for type of shape
				if(shapeType.equals("Rectangle"))
				{
					//Verifies line is formatted correctly
					if(splitString.length == 3)
					{
						System.out.println(fileLine);
						double length = Double.parseDouble(splitString[1]);
						double width = Double.parseDouble(splitString[2]);
						Rectangle insertRect = new Rectangle(length,width);
						returnTree.insert(insertRect);
					}
				}
				else if(shapeType.equals("Right Triangle"))
				{
					if(splitString.length==3)
					{
						System.out.println(fileLine);
						double base = Double.parseDouble(splitString[1]);
						double height = Double.parseDouble(splitString[2]);
						Triangle insertTriangle = new Triangle(base,height);
						returnTree.insert(insertTriangle);
					}
				}
				else if(shapeType.equals("Circle"))
				{
					if(splitString.length == 2)
					{
						System.out.println(fileLine);
						Circle insertCircle = new Circle(Double.parseDouble(splitString[1]));
						returnTree.insert(insertCircle);
					}
				}
				else
				{
					System.out.println("Line formattaed incorrectly");
				}
			}
			fileScanner.close();
			return returnTree;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBSTree tree = readShapeFile("shapeFile.txt");

		System.out.println("Printing Pre-order");
		tree.printPreoder();
		System.out.println();
		
		System.out.println("Printing In-Order");
		tree.printInOrder();
		System.out.println();
		
		System.out.println("Printing Post-Order");
		tree.printPostOrder();
		System.out.println();
		
		System.out.println("The max area is "+tree.findMaxArea()+"\n");
		
		System.out.println("Deleting rectangle with area of 14");
		Rectangle rect = new Rectangle(7,2);
		tree.delete(rect);
		tree.printInOrder();
		System.out.println();
		
		System.out.println("Deleting values larger than 30");
		tree.deleteByArea(30);
		tree.printInOrder();
		
		
		
	}

}
