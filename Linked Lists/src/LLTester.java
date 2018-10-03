
public class LLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkedList list = new IntLinkedList();
		
		//Add 10 elements
		for(int i=0;i<10;i++)
			list.insert(i);
		list.print();
		
		//Move current forward
		for(int i=0;i<4;i++)
			list.moveCurrentForward();
		list.setCurrent(list.getCurrent()+10);
		System.out.println();
		list.print();
		
		System.out.println();
		list.insertAfterCurrent(72);
		list.print();
	
		list.moveCurrentForward();
		list.moveCurrentForward();
		list.deleteCurrentNode();
		list.print();
	}

}
