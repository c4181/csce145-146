/*
 * Written by Christopher Moyer
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinArrayBinHeap heap = new MinArrayBinHeap<Integer>();
		
		System.out.println("Int Min Heap Tester"
				+ "\nPopulating Heap with Values"
				+ "\n21, 37, 49, 11, 23, 1, 13, 16, 33, 17");
		
		heap.insert(21);
		heap.insert(37);
		heap.insert(49);
		heap.insert(11);
		heap.insert(23);
		heap.insert(1);
		heap.insert(13);
		heap.insert(16);
		heap.insert(33);
		heap.insert(17);
		
		System.out.println("Printing Heap");
		heap.print();
		
		System.out.println("Testing heap sort");
		heap.heapSort();
		
		System.out.println("Removing an element from the heap");
		System.out.println("The element removed is "+heap.peek()+" and the heap now is:");
		heap.remove();
		heap.print();
	}

}
