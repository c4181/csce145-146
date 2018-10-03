/*
 * Written by Christopher Moyer
 */
public class LLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenCircularLinkedList<Integer> list = new GenCircularLinkedList();
		
		System.out.println("Circular Linked List Test +"
				+ "\nCreate, insert, and print test by adding values 1-4");
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.showList();
		
		System.out.println("Moving current twice and deleting the current");
		list.goToNext();
		list.goToNext();
		list.deleteCurrentNode();
		list.showList();
		
		System.out.println("Testing inList by searching for the value 4");
		System.out.println(list.inList(4)+"\n");
		
		System.out.println("Testing inList by searching for the value 3");
		System.out.println(list.inList(3)+"\n");
		
		System.out.println("Testing getting and setting current by adding the value 10 to the current data");
		list.setDataAtCurrent(list.getDataAtCurrent()+10);
		list.showList();
		
		System.out.println("Moving current forward and deleting that node");
		list.goToNext();
		list.deleteCurrentNode();
		list.showList();
		
		System.out.println("Moving current backwards and deleting that node");
		list.goToPrevious();
		list.deleteCurrentNode();
		list.showList();
	}

}
