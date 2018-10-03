/*
 * Written by Christopher Moyer
 */
import java.util.Random;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBSTree tree = new IntBSTree();
		Random r = new Random();

		/*
		System.out.println("Inserting 10 numbers");
		for(int i=0;i<10;i++)
		{
			int insertInt = r.nextInt(50);
			System.out.println("Inserting "+insertInt);
			tree.insert(insertInt);
		}
		*/
		
		System.out.println("Inserting 8, 13, 3, 4, 18, 19, 10, 1, 9, & 2");
		
		tree.insert(8);
		tree.insert(13);
		tree.insert(3);
		tree.insert(4);
		tree.insert(18);
		tree.insert(19);
		tree.insert(10);
		tree.insert(1);
		tree.insert(9);
		tree.insert(2);
		
		System.out.println("Printing pre-order transversal");
		tree.printPreoder();
		
		System.out.println("Removing the number 4");
		tree.remove(4);
		tree.printInOrder();
		
		System.out.println("The depth of 9 is "+tree.getDepth(9));
	}

}
