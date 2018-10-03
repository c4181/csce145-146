
public class SearchAndSort {
	
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
	
	public static int selectionSort(int[] a)
	{
		int checks = 0;
		for(int i=0;i<a.length;i++)
		{
			checks++;
			int smallIndex = i;
			for(int j=i+1;j<a.length;j++)
			{
				checks++;
				if(a[j] < a[smallIndex])//We found a smaller value
					smallIndex = j;
			}
			if(smallIndex != i)//Swap because we  found a smaller value
			{
				checks++;
				int temp = a[i];
				a[i] = a[smallIndex];
				a[smallIndex] = temp;
			}
		}
		return checks;
	}
	
	public static int bubbleSort(int[] a)
	{
		int checks = 0;
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			checks++;
			hasSwapped = false;
			for(int i=0;i<a.length-1;i++)
			{
				checks++;
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		return checks;
	}
	
	public static int mergeSort(int[] a, int checks)
	{
		int size = a.length;
		if(size<2)
			return 0;
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
		mergeSort(left,checks+1);
		mergeSort(right,checks+1);
		int checkFinal = merge(left,right,a,checks+1);
		return checkFinal;
	}
	
	//Merge left and right into final array
	public static int merge(int[] left, int[] right, int[] a,int checks)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array index
		int j = 0;//Right array index
		int k = 0;//Sorted array index
		while(i<leftSize && j<rightSize)
		{
			checks++;
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
			checks++;
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize)
		{
			checks++;
			a[k] = right[j];
			j++;
			k++;
		}
		return checks;
	}
	
	public static int quickSort(int[] a, int leftIndex, int rightIndex, int checks)
	{
			int index = partition(a,leftIndex,rightIndex,checks+1);
			if(leftIndex < index-1)
				quickSort(a,leftIndex,index-1,checks+1);
			if(index < rightIndex)
				quickSort(a,index,rightIndex,checks+1);
			return checks;
	}
	private static int partition(int[] a, int leftIndex,int rightIndex,int checks)
	{
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[leftIndex+rightIndex/2];
		while(i<=j)
		{
			checks++;
			while(a[i] < pivot)
			{
				checks++;
				i++;
			}
			while(a[j] > pivot)
			{
				checks++;
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
	
	public static void printArray(int[] anArray)
	{
		for(int i=0;i<anArray.length;i++)
		{
			System.out.println(anArray[i]);
		}
	}
}
