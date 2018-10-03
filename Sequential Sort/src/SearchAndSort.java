
public class SearchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8};
	}
	
	public static boolean linearSearchIter(int[] a, int val)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == val)
				return true;
		}
		return false;
	}

	public static boolean linearSearchRecur(int[] a, int val, int currIndex)
	{
		if(a[currIndex] == val)
			return true;
		currIndex++;
		if(currIndex >= a.length)
			return false;
		else
			return linearSearchRecur(a, val, currIndex);
	}
	
	public static boolean binarySearchRecur(int[] a, int val, int minIndex, int maxIndex)
	{
		if(minIndex > maxIndex)//Value not found
			return false;
		int midIndex = (maxIndex+minIndex)/2;
		if(a[midIndex] == val)//Found value
			return true;
		if(val > a[midIndex])
			return binarySearchRecur(a,val,midIndex+1,maxIndex);
		else
			return binarySearchRecur(a,val,minIndex,midIndex-1);
	}
	
	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int smallIndex = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[smallIndex])//We found a smaller value
					smallIndex = j;
			}
			if(smallIndex != i)//Swap because we  found a smaller value
			{
				int temp = a[i];
				a[i] = a[smallIndex];
				a[smallIndex] = temp;
			}
		}
	}
	
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
	
	public static void quickSort(int[] a, int leftIndex, int rightIndex)
	{
			int index = partition(a,leftIndex,rightIndex);
			if(leftIndex < index-1)
				quickSort(a,leftIndex,index-1);
			if(index < rightIndex)
				quickSort(a,index,rightIndex);
	}
	private static int partition(int[] a, int leftIndex,int rightIndex)
	{
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[leftIndex+rightIndex/2];
		while(i<=j)
		{
			while(a[i] < pivot)
			{
				i++;
			}
			while(a[j] > pivot)
			{
				j--;
			}
			if(i>=j)//Found values out of order so swap
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			}
		}
		return i;
	}
}
