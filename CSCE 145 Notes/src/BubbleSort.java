import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter 10 numbers and I'll sort it.");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = keyboard.nextInt();
		}
		//Bubble Sort
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < a.length-1; i++)
			{
				if(a[i] > a [i + 1]) //swap
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}

	

}
