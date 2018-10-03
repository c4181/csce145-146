/*
 * All sorting methods work except quick sort
 * Written by Christopher Moyer
 */
import java.util.Random;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		SearchAndSort sort = new SearchAndSort();
		
		int selectionSortFinal = 0;
		int bubbleSortFinal = 0;
		int mergeSortFinal = 0;
		int quickSortFinal = 0;
		int[] randomArray = new int[1000];
		
		for(int i=0;i<3;i++)
		{
		
			for(int j=0;j<randomArray.length;j++)
			{
				randomArray[j] = r.nextInt(1000);
			}
		
			int[] ssArray = randomArray.clone();
			int[] bsArray = randomArray.clone();
			int[] msArray = randomArray.clone();
			int[] qsArray = randomArray.clone();
		
			System.out.println("Selction Sort");
			selectionSortFinal+=sort.selectionSort(ssArray);
			sort.printArray(ssArray);
			
			System.out.println("Bubble Sort");
			bubbleSortFinal+=sort.bubbleSort(bsArray);
			sort.printArray(bsArray);
			
			System.out.println("Merge Sort");
			mergeSortFinal+=sort.mergeSort(msArray, 0);
			sort.printArray(msArray);
			
			//System.out.println("Quick Sort");
			//quickSortFinal+=sort.quickSort(qsArray, 0, qsArray.length-1, 0);
			//sort.printArray(qsArray);
		}
		
		System.out.println("Averages");
		
		System.out.println("Selection Sort: "+ selectionSortFinal/3);
		System.out.println("Bubble Sort: "+bubbleSortFinal/3);
		System.out.println("Merge Sort: "+mergeSortFinal/3);
		System.out.println("Quick Sort: "+quickSortFinal/3);
	}

}
