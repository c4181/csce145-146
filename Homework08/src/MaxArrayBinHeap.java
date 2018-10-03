import java.util.Arrays;

public class MaxArrayBinHeap <T extends Comparable<T>>{
	private T[] heap;
	public static final int DEFAULT_SIZE = 128;
	private int lastIndex;//First null value
	public MaxArrayBinHeap()
	{
		init(DEFAULT_SIZE);
	}
	public MaxArrayBinHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size > 0)
			heap = (T[])(new Comparable[size]);
		lastIndex = 0;
	}
	public void addJeep(T aData)
	{
		if(lastIndex >= heap.length)//Heap is full	
			return;
		heap[lastIndex] = aData;
		driveUp();
		lastIndex++;
	}
	private void driveUp()
	{
		//Keeps track of the index of the newly inserted value
		int currIndex = lastIndex;
		while(currIndex > 0 &&
				heap[(currIndex-1)/2].compareTo(heap[currIndex])>0)
		{
			//SWAP
			T temp = heap[(currIndex-1)/2];
			heap[(currIndex-1)/2] = heap[currIndex];
			heap[currIndex] = temp;
			currIndex = (currIndex-1)/2;
		}
		
	}
	public T peek()
	{
		if(heap==null)
			return null;
		return heap[0];
	}
	public T removeJeep()
	{
		if(heap==null)
			return null;
		T retVal = heap[0];
		heap[0] = heap[lastIndex-1];
		heap[lastIndex-1] = null;
		lastIndex--;
		driveDown();
		return retVal;
	}
	private void driveDown()
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
				T temp = heap[currIndex];
				heap[currIndex] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break;
			currIndex = bigIndex;
		}
	}
	public void jeepRollCall()
	{
		for(int i=0;i<lastIndex;i++)
		{
			System.out.println(heap[i]);
		}
		System.out.println();
	}
	public void jeepHeapSort()
	{
		T[] heap2 = heap.clone();
		
		Arrays.sort(heap2,0,lastIndex);
		for(int i=0;i<lastIndex;i++)
		{
			System.out.println(heap2[i]);
		}
	}
}
