import java.util.Random;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		SearchAndSort search = new SearchAndSort();
		
		int[] randomArray = new int[1000];
		int randomInt;
		
		int totalStepsLinear = 0;
		int totalStepsBinary = 0;
		
		for(int i=0;i<20;i++)
		{
			int linearSteps;
			int binarySteps;
			
			//Populate array
			for(int j=0; j<randomArray.length; j++)
			{
				randomArray[j] = r.nextInt(1000);
			}
			
			search.mergeSort(randomArray);
			
			//Random value to be searched
			randomInt = r.nextInt(1000);
			
			System.out.println("Searching using linear search");
			linearSteps = search.linearSearchIter(randomArray, randomInt);
			System.out.println("Searching using binary search");
			binarySteps = search.binarySearchRecur(randomArray, randomInt, 0, randomArray.length-1,0);
			
			
			System.out.println("Linear Checks: "+linearSteps);
			System.out.println("Binary Checks: "+binarySteps);
			
			totalStepsLinear += linearSteps;
			totalStepsBinary += binarySteps;
		}
		
		totalStepsLinear = totalStepsLinear/20;
		totalStepsBinary = totalStepsBinary/20;
		
		System.out.println("The average number of checks for 20 were:");
		System.out.println("Linear Search: "+totalStepsLinear);
		System.out.println("Binary Search: "+totalStepsBinary);
	}

}
