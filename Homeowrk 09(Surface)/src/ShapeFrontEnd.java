import java.util.Scanner;
public class ShapeFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		ShapeCollection shapes = new ShapeCollection();
		boolean quit = false;
		System.out.println("Welcome to the Shapes collections");
		while(quit==false)
		{
			int userInput = -1;
			System.out.println("Enter 1: Add a shape"
					+ "\nEnter 2: Remove a shape"
					+ "\nEnter 9: Quit");
			userInput = keyboard.nextInt();
			keyboard.nextLine();
			if(userInput==9)
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else if(userInput==1)
			{
				System.out.println("What type of shape?");
				System.out.println("Rectangle, Triangle, or Circle");
				String shapeInput = keyboard.nextLine();
				if(shapeInput.equals("Rectangle"))
				{
					System.out.println("Enter a length followed by a width");
					Rectangle rectangle = new Rectangle(keyboard.nextDouble(), keyboard.nextDouble());
					shapes.addShape(rectangle);
				}
				else if(shapeInput.equals("Triangle"))
				{
					System.out.println("Enter a base followed by a height");
					Triangle triangle = new Triangle(keyboard.nextDouble(), keyboard.nextDouble());
					shapes.addShape(triangle);
				}
				else if(shapeInput.equals("Circle"))
				{
					System.out.println("Enter a radius");
					Circle circle = new Circle(keyboard.nextDouble());
					shapes.addShape(circle);
				}
			}
			else if(userInput == 2)
			{
				System.out.println("Enter the shape type");
				String aShape = keyboard.nextLine();
				System.out.println("Enter an area");
				double anArea = keyboard.nextDouble();
				keyboard.nextLine();
				shapes.removeShape(aShape, anArea);
			}
			shapes.printShapes();
		}
	}

}
