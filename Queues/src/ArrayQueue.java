
public class ArrayQueue <T> implements QueueInterface {
	private T[] queue;
	private int tailIndex;//1 past the last element of the array; First null index of array
	public static final int DEFAULT_SIZE = 100;
	public ArrayQueue()
	{
		this.init(DEFAULT_SIZE);
	}
	public ArrayQueue(int size)
	{
		this.init(size);
	}
	public void init(int size)
	{
		if(size <= 0)
			return;
		//Doesnt work  queue = new T[size];
		queue = (T[])(new Object[size]);
		tailIndex = 0;
	}
	public void enqueue(Object aData)
	{
		if(tailIndex >= queue.length)//Queue is full
			return;
		queue[tailIndex] = (T)aData;
		tailIndex++;
	}
	public T dequeue()
	{
		T ret = queue[0];
		for(int i=0;i<tailIndex;i++)
		{
			queue[i] = queue[i+1];
		}
		tailIndex--;
		return ret;
	}
	public T peek()
	{
		return queue[0];
	}
	public void print()
	{
		for(T elem : queue)
		{
			System.out.println(elem);
		}
	}
}
