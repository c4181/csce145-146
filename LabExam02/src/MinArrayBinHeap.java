import java.util.Arrays;

public class MinArrayBinHeap <T extends Comparable<T>>{
	private T[] heap;
	public static final int DEFAULT_SIZE = 10000;
	private int lastIndex;//First null value
	public MinArrayBinHeap()
	{
		init(DEFAULT_SIZE);
	}
	public MinArrayBinHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size > 0)
			heap = (T[])(new Comparable[size]);
		lastIndex = 0;
	}
	public void insert(T aData)
	{
		if(lastIndex >= heap.length)//Heap is full	
			return;
		heap[lastIndex] = aData;
		bubbleUp();
		lastIndex++;
	}
	private void bubbleUp()
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
	public T remove()
	{
		if(heap==null)
			return null;
		T retVal = heap[0];
		heap[0] = heap[lastIndex-1];
		heap[lastIndex-1] = null;
		lastIndex--;
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
				T temp = heap[currIndex];
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
	public void heapSort(T[] a)
	{
		for(int i=0;i<a.length;i++)
			this.insert(a[i]);
		int currIndex = lastIndex;
		for(int i=0;i<currIndex;i++)
			a[i] = this.remove();
	}
	public boolean isEmpty()
	{
		if(lastIndex == 0)
			return true;
		else
			return false;
	}
}