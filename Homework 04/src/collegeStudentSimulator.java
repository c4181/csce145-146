/*
 * Written by Christopher Moyer
 */

import java.util.Scanner;
public class collegeStudentSimulator {

	
	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		String answer = "blank";
		double breakfastMoney = 0;
		int studyTime = 0;
		
		
		System.out.println("Welcome to College Student Simulator 2017!");
		System.out.println("It is Sunday night and your first class is at 8am."
				+ "You can set your alarm and go to class, Skip the first class, or dropout."
				+ "\nEnter \"Set Alarm\", \"Skip\", or \"Dropout\"");
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("Set Alarm"))
		{
			System.out.println("You show up to class but the professor has cancelled class."
					+ "Now, you can go back to sleep or eat breakfast"
					+ "\nEnter \"Sleep\" or \"Breakfast\"");
			answer = keyboard.nextLine();
			
			if (answer.equalsIgnoreCase("Sleep"))
			{  //Ending 1
				System.out.println("You slept and missed all your classes. Game over!");
				System.exit(0);
			}
			else if (answer.equalsIgnoreCase("Breakfast"))
			{
				System.out.println("How much do you spend on breakfast? Enter your answer as \"#.##\"");
				breakfastMoney = keyboard.nextDouble();
				keyboard.nextLine();
				
				if (breakfastMoney > 2.00)
				{   //Ending 2
					System.out.println("You spent too much money! Game over.");
					System.exit(0);
				}
				else if (breakfastMoney <= 2.00)
				{
					System.out.println("Good job! You still have money leftover!");
				}
				else 
				{
					System.out.println("Obvously, you didn't follow instructions. Maybe you should consider dropping out");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Obvously, you didn't follow instructions. Maybe you should consider dropping out");
				System.exit(0);
			}
			
			System.out.println("You went to all your classes but you have an exam that counts for 150% of you grade tomorrow."
					+" Do you \"Study\" or go to the \"Movies\"");
			answer = keyboard.nextLine();
			
			if (answer.equalsIgnoreCase("Movies"))
			{   //Ending 3
				System.out.println("Good job! You failed the exam! Your're forced to drop out.");
				System.exit(0);
			}
			else if (answer.equalsIgnoreCase("Study"))
			{
				System.out.println("How long do you study for? Enter you answer in hours.");
				studyTime = keyboard.nextInt();
				keyboard.nextLine();
				
				if (studyTime < 2)
				{   //Ending 4
					System.out.println("You didn't study long enough and failed the exam. You have to drop out!");
					System.exit(0);
				}
				else if (studyTime >= 2)
				{   //Ending 5
					System.out.println("You studied long enough to at least pass! You Win!");
					System.exit(0);
				}
				else
				{
					System.out.println("Unfortunately, you didn't follow my directions."
							+ "I'm unable to process your input and have the game make a decesion, so we're just gonna say you would've failed anyway.");
					System.exit(0);
				}
			}
		}
		
		else if (answer.equalsIgnoreCase("Skip"))
		{
			System.out.println("Your professor didn't even show up for class. You got extra sleep!");
			System.out.println("Do you \"Attend\" the rest of your classes or \"Skip\"");
			answer = keyboard.nextLine();
			
			if (answer.equalsIgnoreCase("Skip"))
			{   //Ending 6
				System.out.println("What a shame, if you would've went to classes, your professor would've automatically passed you. Oh well, you're already failing");
				System.exit(0);
			}
			else if (answer.equalsIgnoreCase("Attend"))
			{
				System.out.println("Smart Coice!");
				System.out.println("Exam tomorrow! Do you \"Study\", \"Party\" with friends, or \"Wing It\"");
				answer = keyboard.nextLine();
				
				if (answer.equalsIgnoreCase("Party") || (answer.equalsIgnoreCase("Wing It")))
				{   //Ending 7
					System.out.println("You failed the exam! Your parents make you transfer to a college back home. Game over!");
					System.exit(0);
				}
				else if (answer.equalsIgnoreCase("Study"))
				{  //Ending 8
					System.out.println("Good job. You passed the exam! You win!");
				}
				else
				{
					System.out.println("The force isn't strong with you");
					System.exit(0);
				}
			}
		}
		
		else if (answer.equalsIgnoreCase("Dropout"))
		{   
			System.out.println("You parents try to convice you to not dropout. Are you sure you want to dropout? \"Yes\" or \"No\"");
			answer = keyboard.nextLine();
			
			if (answer.equalsIgnoreCase("Yes"))
			{   //Ending 9
				System.out.println("Smart Choice");
			}
			else if (answer.equalsIgnoreCase("No"))
			{
				System.out.println("I'm not waiting on you to make up your mind");
				System.exit(0);
			}
			else
			{
				System.out.println("You are the weakest link, Goodbye!");
				System.exit(0);
			}
		}
		
		
	}

}
