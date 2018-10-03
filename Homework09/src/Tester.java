import java.io.*;
import java.util.Scanner;
public class Tester {

	public static final String DELIM = "\t";
	
	public static LinkedBSTree<Fruit> readFruitFile(String fileName) {
		if(fileName == null)
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
				//Checks for correct formatting
				if(splitString.length==2)
				{
					String fruitType = splitString[0];
					double fruitWeight = Double.parseDouble(splitString[1]);
					Fruit insertFruit = new Fruit(fruitType,fruitWeight);
					returnTree.insert(insertFruit);
				}
			}
			fileScanner.close();
			return returnTree;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedBSTree<Fruit> tree = readFruitFile("fruitFile.txt");
		
		System.out.println("Populating Tree from File");
		System.out.println("Printing in-order transversal");
		tree.printInOrder();
		
		System.out.println("Printing the pre-order transversal");
		tree.printPreoder();
		
		System.out.println("Printing the post-order transversal");
		tree.printPostOrder();
		
		
		Fruit deleteApple = new Fruit("Apple",0.4859853412170728);
		System.out.println("Deleting "+deleteApple.toString());
		tree.delete(deleteApple);
		tree.printInOrder();
		
	}

}
