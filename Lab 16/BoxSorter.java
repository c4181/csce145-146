/*
 * Written by Brandon Race
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the box sorter!");
		System.out.println("Enter the information about boxes and I'll sort them");
		Box[] boxArr = new Box[5];
		for(int i=0; i<boxArr.length; i++)
		{
			boxArr[i] = new Box();
			System.out.println("Enter the label, length, width, and height (all feet) of box "+(i+1));
			String aLabel = keyboard.nextLine();
			double aLength = Double.parseDouble(keyboard.nextLine());
			double aWidth = Double.parseDouble(keyboard.nextLine());
			double aHeight = Double.parseDouble(keyboard.nextLine());
			
			boxArr[i].setLabel(aLabel);
			boxArr[i].setLength(aLength);
			boxArr[i].setWidth(aWidth);
			boxArr[i].setHeight(aHeight);
		}
		
		double[] volumes = new double[5];
		for(int i=0; i<volumes.length; i++)
		{
			volumes[i] = boxArr[i].getVolume();
		}
		
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i=0;i<volumes.length-1;i++)
			{
				if(volumes[i]>volumes[i+1])//Swap
				{
					double temp = volumes[i];
					Box tempBox = boxArr[i];
					volumes[i] = volumes[i+1];
					boxArr[i] = boxArr[i+1];
					volumes[i+1] = temp;
					boxArr[i+1] = tempBox;
					hasSwapped = true;
				}
			}
		}
		System.out.println("Sorted boxes");
		for(int i=0; i<boxArr.length; i++)
		{
			System.out.println(boxArr[i].toString());
		}
		
		
		
		
	}

}
