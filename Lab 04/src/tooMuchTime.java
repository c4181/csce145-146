/*
 * Written by Christopher Moyer & Brandon Race
 * 
 */
import java.util.Scanner;

public class tooMuchTime {

	public static void main(String[] args) {
		
		
		//Math Constants
		int hConversion = 3600;
		int mConversion = 60;
		int sConversion = 1;
		
		//Ask user for time
		System.out.println("Enter a time in the following format \"hours:minutes:seconds\" and I will give you the time in seconds");
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		
		//Makes copy of user input
		String copyInput = userInput;
		
		//Parsing the string
		int workingIndex = copyInput.indexOf(":");
		String hours = copyInput.substring(0,workingIndex);
		copyInput = copyInput.substring(workingIndex+1);
		
		String minutes = copyInput.substring(0,workingIndex);
		copyInput = copyInput.substring(workingIndex+1);
		
		String seconds = copyInput.substring(0,workingIndex);
		
		//Convert String to Int
		int intHours = Integer.parseInt(hours);
		int intMinutes = Integer.parseInt(minutes);
		int intSeconds = Integer.parseInt(seconds);
		
		//Converts time to total number of seconds
		int totalSeconds = (intHours * hConversion) + (intMinutes * mConversion) + (intSeconds * sConversion);
		System.out.println("The number of seconds are "+totalSeconds);
		
		//Prompts user for number of seconds to add
		System.out.println("Enter a number of seconds to add");
		int userSeconds = keyboard.nextInt();
		keyboard.nextLine();
		
		//Adds the user amount of seconds
		totalSeconds = totalSeconds + userSeconds;
		
		//Calculates the new time
		int newHours = totalSeconds / hConversion;
		int hRemainder = totalSeconds % hConversion;
		
		int newMinutes = hRemainder / mConversion;
		int mRemainder = hRemainder % mConversion;
		
		int newSeconds = mRemainder / sConversion;
		
		//Prints new time to console
		System.out.println("The new time is " +newHours+ ":" +newMinutes+ ":" +newSeconds);
		
		
		
				
		
		
		

		
		
	
	}

}
