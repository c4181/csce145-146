
public class ArrayBSTree <T extends Comparable<T>> {
	private T[] tree;
	public static final int DEFAULT_SIZE = 120;
	
	public ArrayBSTree()
	{
		init(DEFAULT_SIZE);	
	}
	public ArrayBSTree(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size >0)
			tree = (T[])(new Comparable[size]);
	}
	public void inset(T aData)
	{
		if(tree[0] == null)
			tree[0] = aData;
	}
	private void insert(int index, T aData)//Outside bounds of the array
	{
		if(index >= tree.length)
			return;
		if(tree[index] == null)
			tree[index] = aData;
		else if(aData.compareTo(tree[index])<0)//Go left
			insert(index*2+1,aData);
		else if(aData.compareTo(tree[index])>=0)//Go right
			insert(index*2+2,aData);
	}
	public boolean search(T aData)
	{
		return search(0,aData);
	}
	private boolean search(int index, T aData)
	{
		if(index >= tree.length)//Went out of bounds so not found
			return false;
		if(tree[index] == null)//Encountered an emtpy element
			return false;
		else if(aData.compareTo(tree[index]) == 0)//We Found it
			return true;
		else if(aData.compareTo(tree[index])<0)//Go left
			return search(index*2+1,aData);
		else//Go right
			return search(index*2+2,aData);
	}
	
	public void printBreadthOrder()
	{
		for(T val : tree)
		{
			if(val!=null)
				System.out.println(val);
			else
				System.out.println("Null");
		}
	}
	
	public void delete(T aData)
	{
		
	}
	public void delete(int index, T aData)
	{
		//Find the value
		if(index >= tree.length)//Not found
			return;
		if(tree[index ]== null)//Not found
			return;
		else if(aData.compareTo(tree[index])>0)//Go left
			delete(index*2+1,aData);
		else if(aData.compareTo(tree[index])>0)//Go right
			delete(index*2+2,aData);
		else//We found it
		{
			if(index*2+2 < tree.length && tree[index*2+2] ==null)
				shiftTreeLeft(index);
		}
		
	}
	private void shiftTreeLeft(int index)
	{
		if(index >= tree.length)
			return;
		boolean isLeft = index%2 != 0;
		if(isLeft || index == 0)//Left child or root
		{
			if(index*2+1 < tree.length)
				tree[index] = tree[index*2+1];
			else
			{
				tree[index] = null;
				return;
			}
		}
		else
		{
			if((index-1)*2+2 < tree.length)
				tree[index] = tree[(index-1)*2+2];
			else
			{
				tree[index] = null;
				return;
			}
			shiftTreeLeft(index*2+1);
			shiftTreeLeft(index*2+1);
		}
	}
}
