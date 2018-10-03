
public interface QueueInterface <T> {
	public void enqueue(T aData);
	public T dequeue();
	public T peek();//Returns first element without removing it
	public void print();
}
