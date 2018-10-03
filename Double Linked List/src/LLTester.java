
public class LLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenDoubleLinkedList<String> stringList = new GenDoubleLinkedList();
		GenDoubleLinkedList<Integer> intList = new GenDoubleLinkedList();
		
		
		stringList.insert("String 1");
		stringList.insertNodeAfterCurent("String 2");
		stringList.showList();
		
		stringList.goToNext();
		stringList.insertNodeAfterCurent("String 3");
		stringList.showList();
		
		stringList.goToPrev();
		stringList.deleteCurrentNode();
		stringList.showList();
		
		System.out.println(stringList.inList("String 2"));
		
		intList.insert(1);
		intList.insert(2);
		intList.insert(3);
		intList.showList();
		
		intList.goToNext();
		intList.goToNext();
		intList.setDataAtCurrent(5);
		System.out.println(intList.getDataAtCurrent());
		
		intList.goToPrev();
		intList.insertNodeAfterCurent(3);
		intList.showList();
		
	}

}
