/*
 * Written by Christopher Moyer
 */

import java.util.Scanner;

public class correctDate {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		
		//Prompt user for date
		System.out.println("Enter a date in the format \"mm/dd/yyyy\"");
		String date = keyboard.nextLine();
		
		//Variable for not valid date
		boolean dateIsValid = true;
		String notValidReason = date + " is not valid because:";
		
		//Make copy
		String copyDate = date;
		
		//Find month and parseInt
		int workingIndex = copyDate.indexOf("/");
		String month = copyDate.substring(0,workingIndex);
		int intMonth = Integer.parseInt(month);
		copyDate = copyDate.substring(workingIndex+1);
		
		//Find day and parseInt
		workingIndex = copyDate.indexOf("/");
		String day = copyDate.substring(0,workingIndex);
		int intDay = Integer.parseInt(day);
		workingIndex = copyDate.indexOf("/");
		copyDate = copyDate.substring(workingIndex+1);
		
		
		
		//Find year and parseInt
		String year = copyDate;
		int intYear = Integer.parseInt(year);
		
		//Check if month is valid
		if ((intMonth < 1) || (intMonth > 12))
		{
			dateIsValid=false;
			notValidReason += "\nInvalid month";
		}
		
		//Check if 30 day months are valid
		if ((intMonth == 4) || (intMonth == 6) || (intMonth == 9) || (intMonth == 11))
		{
			if ((intDay < 1) || (intDay > 30))
			{
			dateIsValid=false;
			notValidReason += "\nThe month entered has 30 days";
			}
		}
		
		//Check if the 31 day months are valid
		if ((intMonth == 1) || (intMonth == 3) || (intMonth == 5) || (intMonth == 7) || (intMonth == 8) || (intMonth == 10) || (intMonth == 12))
		{
			if ((intDay < 1) || (intDay > 31))
			{	
			dateIsValid=false;
			notValidReason += "\nThe month entered has 31 days";
			}
		}
		
		//Checks Valid February Day
		if (intMonth == 2)
		{
			if ((intDay < 1) || (intDay > 29))
			{
			dateIsValid=false;
			notValidReason += "\nThe day is invalid";
			}
		}
		
		//Leap year check one
		if ((intMonth == 2) && (intDay == 29))
		{
			if ((intYear%4 > 0) || (intYear%4 < 0))
			{
				dateIsValid=false;
				notValidReason += "\nThis is not a leap year";
			}
		}
		
		//Leap Year check 2
		if ((intMonth == 2) && (intDay == 29) && (intYear%4 >= 0) || (intYear%4 <= 0) )
		{
			if ((intYear%100 == 0) && ((intYear%400 > 0) && (intYear%400 <0)))
					{
						dateIsValid=false;
						notValidReason += "\nThis is not a leap year";
					}
		}
		
		//Tell user invalid & reason or valid
		if (dateIsValid == false)
		{
			System.out.println(notValidReason);
		}
		else
		{
			System.out.println(date + " is a valid date!");
		}
				
					
		};

}
