/*
 * Written by Nick Driver & Christopher Moyer
 */

import java.util.Scanner;
	
public class ALongHeavyProgram {
	
	//Define weight values
	private static double kilogramsValue = 0.456;
	private static double stoneValue = 0.071;
	private static double slugValue = 0.031;
	private static double pennyWeightValue = 291.667;
	private static double grainValue = 7000.0;
	
	
	//Define height values
	private static double meterValue = 0.305;
	private static double handValue = 3.0;
	private static double furlongValue = 0.002;
	private static double cubitValue = 0.667;
	private static double rackUnitValue = 6.857;
	

	public static void main(String[] args) {
		//Setup Scanner for user input
		Scanner keyboard = new Scanner(System.in);
		//Greet user with welcome message
		System.out.println("Welcome to the weight and height converter!");
		//Ask user for weight input
		System.out.println("Enter a weight in pounds");
		double userWeight = keyboard.nextDouble();
		//Ask user for height input
		System.out.println("Enter a height in feet");
		double userHeight = keyboard.nextDouble();
		
		//Compute weight values
		double kilograms = userWeight * kilogramsValue;
		double stones = userWeight * stoneValue;
		double slugs = userWeight * slugValue;
		double pennyweights = userWeight * pennyWeightValue;
		double grains = userWeight * grainValue;
		
		//Compute height values
		double meters = userHeight * meterValue;
		double hands = userHeight * handValue;
		double furlongs = userHeight * furlongValue;
		double cubits = userHeight * cubitValue;
		double rackUnits = userHeight * rackUnitValue; 
		
		//Print weight conversions
		System.out.println(userWeight + "lbs is " +kilograms + " kilograms" );
		System.out.println(userWeight + "lbs is " +stones + " stones" );
		System.out.println(userWeight + "lbs is " +slugs + " slugs" );
		System.out.println(userWeight + "lbs is " +pennyweights + " pennyweights" );
		System.out.println(userWeight + "lbs is " +grains + " grains" );
		
		//Print height conversions
		System.out.println(userHeight + "ft is " +meters + " meters" );
		System.out.println(userHeight + "ft is " +hands + " hands" );
		System.out.println(userHeight + "ft is " +furlongs + " furlongs" );
		System.out.println(userHeight + "ft is " +cubits + " cubits" );
		System.out.println(userHeight + "ft is " +rackUnits + " rack units" );
		
		//End
		System.out.println("Goodbye");
		
		//Close Scanner
		keyboard.close();
	}

}
