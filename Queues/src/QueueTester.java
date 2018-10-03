import java.util.*;
public class QueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
		//QueueInterface<Integer> queue = new ArrayQueue<Integer>();
		QueueInterface<Integer> queue = new LLQueue<Integer>();
		for(int i=0;i<5;i++)
		{
			queue.enqueue(i);
		}
		queue.print();
		
		System.out.println("Dequeue "+queue.dequeue());
		queue.print();
		
		Queue<Integer> intQueue = new LinkedList<Integer>();
	}

}
