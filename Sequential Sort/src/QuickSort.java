//From Ming
public class QuickSort {
	public static int quickSort(int[] a, int leftIndex, int rightIndex, int[] checks)
	{
	  checks[0]++;

	  int index = partition(a,leftIndex,rightIndex);
	  if(leftIndex < index-1)
	    quickSort(a,leftIndex,index-1,checks);
	  if(index < rightIndex)
	    quickSort(a,index,rightIndex,checks);
			
	  return checks[0];
	}

	private static int partition(int[] a, int leftIndex, int rightIndex) {
	  int i= leftIndex;
	  int j = rightIndex;
	  int pivot = a[(leftIndex + rightIndex)/2];
	  while(i<=j){
	    while(a[i] < pivot){
	      i++; 
	    }
	    while(a[j] > pivot){
	      j--; 
	    }
	    if(i<=j){
	      int temp = a[i];
	      a[i] = a[j];
	      a[j] = temp;
	      i++;
	      j--;
	    }
	  }
	  return i;
	}
}
