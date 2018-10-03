/*
 * Written by Christopher Moyer
 */

import java.util.Scanner;
import java.util.Random;


//6 current endings
public class chooseYourOwnAdventure {
	
	
	//Constants
	private static final String battleCube1 = "Fire Dragon";
	private static final String battleCube2 = "Water Turtle";
	private static final String battleCube3 = "Grass Flower";
	private static final String team = "Squad Evil People";
	private static final int NUMBER_OF_GUESSES = 3;
	private static final int TOP_NUM = 11;
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		String boyRivalName = "Blue";
		String girlRivalName = "Purple";
		String rival = "None";
		String answer = "None";
		int battleCube = 0;
		String battleMonster = "None";
		int guessCount = 0;
		int secretNumber = 0;
		int guess = 0;
		boolean guessIsCorrect = false;
		Random r = new Random();
		
		
		
		//Intro
		System.out.println("Hello there! Welcome to world of Battle Monster Simulator 2017!"
				+ "\nMy name is Christopher but most people call me the Battle Monster Simulator Professor"
				+ "\nNow tell me, are you a boy or girl?" );
		
		String playerGender = keyboard.nextLine();
		
		if (playerGender.equalsIgnoreCase("boy"))
		{
			rival = boyRivalName;
			System.out.println("Oh! And your rival is " + rival+"!");
		}
		else if (playerGender.equalsIgnoreCase("girl")) 
		{
			rival = girlRivalName;
			System.out.println("Oh! And your rival is " + rival+"!");
		}
		else
		{
			System.out.println("Sorry. That wasn't an answer I was expecting.");
			System.exit(0);
		}
		
		System.out.print("And your name is?");
		String playerName = keyboard.nextLine();
		
		System.out.println(playerName + ", The wonderful world of Battle Monster Simulator 2017 awaits you!");
		
		//Begin
		System.out.print("Your family has just moved to Columbia City. Do you want to go to Lake Murary and look for Battle Monsters or go to Lexington Town and see the Battle Monster Professor?"
				+"\n Enter \"lake\" or \"prof\"");
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("lake"))
		{   //Ending 1
			System.out.println("You arrive at the lake and find a briefcase on the ground. You open it and find 3 Battle Monster Cubes."
			+"\nDo you pickup cube \"1\", \"2\", or \"3\"");
			answer = keyboard.nextLine();
			System.out.println("As you reach down to pickup the cube, the professor sees you and scolds you for messing with his briefcase."
					+ "\nHe tells your mom and you get grounded for a month.");
			System.exit(0);
		}
		else if (answer.equalsIgnoreCase("prof"))
		{
			System.out.println("Battle Monster Professor: Welcome to my lab. Please select one of these battle monster cubes!"
					+ "\n Will you take cube \"1\", \"2\", or \"3\"");
			battleCube = keyboard.nextInt();
			keyboard.nextLine();
			
			if (battleCube==1)
			{
				battleMonster=battleCube1;
				System.out.println("Congratulations! You chose " + battleMonster + ".");
			}
			else if (battleCube==2)
			{
				battleMonster=battleCube2;
				System.out.println("Congratulations! You chose " + battleMonster + ".");
			}
			else if (battleCube==3)
			{
				battleMonster=battleCube3;
				System.out.println("Congratulations! You chose " + battleMonster + ".");
			}
			else
			{
				System.out.println("If you can't count, the world of Battle Monsters might not be for you.");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("You waited around all day and missed your opportunity to become a Battle Monster Simulator master!");
			System.exit(0);
		}
		
		//Story 1
		System.out.println("You leave the professors lab. Do you want to go back to Columbia City or go to Orangeburg City?"
				+"\nEnter \"Columbia\" or \"Orangeburg\"");
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("Columbia"))
		{
			System.out.println("You return you Columbia and find your rival, " + rival + "."
					+ "\n" + rival + ": \"HEEEEEYYY FRIEND!!!! WANNA FIGHT WITH OUR BATTLE MOSTERS????\""
							+ "\nEnter \"Yes\" or \"No\"");
			answer = keyboard.nextLine();
			if (answer.equalsIgnoreCase("yes"))
			{   //Ending 2
				System.out.println("You and your rival fight. Your rival was given the better battle monster and you are defated swiftly."
						+ "\nYou return home and relinqish your dreams of becoming a Battle Monster master.");
				System.exit(0);
			}
			else if (answer.equalsIgnoreCase("No"))
			{
				System.out.println("You tell " + rival + " that you don't have time right now and neeed to go to Orangeburg City to meet someone. You scurry then scurry off to Orangeburg before he has a chance to reply.");
			}
			else
			{
				System.out.println(rival + ": \"Maybe some other time when you can answer a yes or no question properly.\" You continue to Orangeburg City.");
			}
		}
		else if (answer.equalsIgnoreCase("Orangeburg"))
		{
			System.out.println("You continue to Orangeburg");
		}
		else
		{
			System.out.println("Overloaded with too many decesions, you are unable to deccide. You continue standing in the same spot unti " + team + "take over the city");
			System.exit(0);
		}
		
		//Story 2
		System.out.println("You arrive in Orangeburg City to find the city is deserted. You wander around and stumble upon a strange group of people");
		System.out.println(team + ": \"*insert eveil laught* We are " + team + "! We're here to take all of the Battle Monsters to do some big evil plan that I'll tell you later in the story!\""
				+ "\n" + team + ": \"Give us your Battle Monsters or prepare to fight!\""
				+ "\nDo you fight, \"Yes\" or \"No\"");
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("No"))
		{   //Ending 3
			System.out.println("You hand over your Battle Monster. " + team + " takes over the entire regions and everyone become miserable.");
			System.exit(0);
		}
		else if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println(team + ": \"Wow. No one has ever wanted to fight before. We're just gonna leave in case you're actually strong enough to beat us\"");
		}
		else
		{
			System.out.println("Really? You've gotten this far and this is where you decide to be a rebel?");
			System.exit(0);
		}
		
		//Story 3
		System.out.println("You can continue to Charlotte City and battle the mayor or go to Clemson Town and fight other trainers?"
				+ "\nEnter \"Charlotte\" or \"Clemson\"");
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("Clemson"))
		{   //Ending 4
			System.out.println("You arrive in Clemson Town to find a dilipaited city inhabited by an uncivilized people."
					+ "\nYou spend the rest of your life trying to teach them the true meaning of life.");
			System.exit(0);
		}
		else if (answer.equalsIgnoreCase("Charlotte"))
		{
			System.out.println("You arrive in Charlotte City to find and find the mayor"
					+ "\nCharlotte Mayor: Guess what number I'm thinking in "+NUMBER_OF_GUESSES+ " tries and I'll let you fight me!");
			secretNumber = r.nextInt(TOP_NUM);
			System.out.println(secretNumber);
			
			while (guessIsCorrect==false || guessCount >= NUMBER_OF_GUESSES)
			{
				System.out.print("Enter a number between 1 & 10");
				guess = keyboard.nextInt();
				keyboard.nextLine();
				
				if (guess == secretNumber)
				{
					guessIsCorrect=true;
					guessCount++;
				}
				else if (!(guess == secretNumber))
				{
					System.out.println("That wasn't it.");
					guessCount++;
				}
			}
			
			if (guessIsCorrect==true)
			{
				System.out.println("Charlotte Mayor: You got it!");
			}
			else
			{	//Ending 5
				System.out.println("Charlotte Mayor: You didn't get it."
						+ "\nThe mayor refuses to fight you and you go home.");
				System.exit(0);
			}
			
		}
		else
		{
			System.out.println("Go home.");
			System.exit(0);
		}
		
		System.out.println("Charlotte Mayor: I don't want to be the mayor anymore, You can have it if you want."
				+ "\nEnter \"Mayor\" to become the mayor or \"Fight\" to fight.");
		
		answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("Fight"))
		{   //Ending 6
			System.out.print("You fight. You lose. You go home. The End.");
			System.exit(0);
		}
		else if (answer.equalsIgnoreCase("Mayor"))
		{
			System.out.println("*Jingle Plays* You are now the Charlotte Mayor!");
		}
		else
		{
			System.out.println("The force is not strong with this one");
			System.exit(0);
		}
		
		//Story 4
		
		
		

	}

}
