
public class Sorter {

	public static void bubbleSort(int[] a)
	{
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	
	public static void mergeSort(int[] a)
	{
		int size = a.length;
		if(size<2)
			return;
		int mid = size/2;
		int leftSize = mid;
		int rightSize = size-mid;
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		for(int i=0;i<leftSize;i++)//Populate left array
		{
			left[i] = a[i];
		}
		for(int i=mid;i<size;i++)//Populate right array
		{
			right[i-mid] = a[i]; //i-mid starts at 0 and iterates through
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	
	//Merge left and right into final array
	public static void merge(int[] left, int[] right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array index
		int j = 0;//Right array index
		int k = 0;//Sorted array index
		while(i<leftSize && j<rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void heapSort(int[] a)
	{
		MinArrayBinHeap<Integer> heap = new MinArrayBinHeap<Integer>();
		Integer[] b = new Integer[a.length];
		for(int i=0;i<a.length;i++)
			b[i] = a[i];
		heap.heapSort(b);
		for(int i=0;i<a.length;i++)
			a[i] = b[i];
	}
}
