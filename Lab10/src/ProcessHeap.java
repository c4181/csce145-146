import java.util.Arrays;

public class ProcessHeap {
	private Process[] heap;
	public static final int DEFAULT_SIZE = 128;
	private int lastIndex;//First null value
	private int size;
	
	public ProcessHeap()
	{
		init(DEFAULT_SIZE);
	}
	public ProcessHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size > 0)
			heap = new Process[size];
		lastIndex = 0;
	}
	public void insert(Process aProcess)
	{
		if(lastIndex >= heap.length)//Heap is full	
			return;
		heap[lastIndex] = aProcess;
		bubbleUp();
		lastIndex++;
		size = lastIndex -1;
	}
	private void bubbleUp()
	{
		//Keeps track of the index of the newly inserted value
		int currIndex = lastIndex;
		while(currIndex > 0 &&
				heap[(currIndex-1)/2].compareTo(heap[currIndex])>0)
		{
			//SWAP
			Process temp = heap[(currIndex-1)/2];
			heap[(currIndex-1)/2] = heap[currIndex];
			heap[currIndex] = temp;
			currIndex = (currIndex-1)/2;
		}
		
	}
	public Process peek()
	{
		if(heap==null)
			return null;
		return heap[0];
	}
	public Process remove()
	{
		if(heap==null)
			return null;
		Process retVal = heap[0];
		heap[0] = heap[lastIndex-1];
		heap[lastIndex-1] = null;
		lastIndex--;
		size = lastIndex -1;
		bubbleDown();
		return retVal;
	}
	private void bubbleDown()
	{
		int currIndex = 0;
		while(currIndex*2+2 < lastIndex)
		{
			int bigIndex = currIndex*2+1;
			if(currIndex*2+1 < lastIndex &&
					heap[currIndex*2+1].compareTo(heap[currIndex*2+2]) > 0)
				bigIndex = currIndex*2+2;
			if(heap[currIndex].compareTo(heap[bigIndex]) > 0)
			{
				//SWAP
				Process temp = heap[currIndex];
				heap[currIndex] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break;
			currIndex = bigIndex;
		}
	}
	public void printHeap()
	{
		for(int i=0;i<lastIndex;i++)
		{
			System.out.println(heap[i]);
		}
		System.out.println();
	}
	public void heapSort()
	{
		Process[] heap2 = heap.clone();
		
		Arrays.sort(heap2,0,lastIndex);
		for(int i=0;i<lastIndex;i++)
		{
			System.out.println(heap2[i]);
		}
	}
	public boolean isEmpty()
	{
		if(lastIndex == 0)
			return true;
		else
			return false;
	}
}
