/*
 * Written by Christopher Moyer
 * 
 */

import java.util.Scanner;

public class InformationGatherer {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Information Gatherer. Please answer the following questions.");
		
		System.out.println("What is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("What is your height measured in meters?");
		double height = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("What is your blood type?");
		String bloodType = keyboard.nextLine();
		
		System.out.println("Are you a cat person? Please enter true or false");
		boolean catPerson = keyboard.nextBoolean();
		keyboard.nextLine();
		
		System.out.println("Are you a dog person? Please enter true or false.");
		boolean dogPerson = keyboard.nextBoolean();
		keyboard.nextLine();
		
		System.out.println("Are you a reptilian shape shifter? Please enter true or false.");
		boolean reptilianShapeShifter = keyboard.nextBoolean();
		keyboard.nextLine();
		
		System.out.println("Measured in Kilograms, How much gold is buried on your property?");
		double gold = keyboard.nextDouble();
		keyboard.nextLine();
		
		
		
		System.out.println("Thank you. Your responses have been recorded and are displayed below.");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+ " Meters");
		System.out.println("Blood Type: "+bloodType);
		System.out.println("Cat Person: "+catPerson);
		System.out.println("Dog Person: "+dogPerson);
		System.out.println("Reptilian Shape Shifter: "+reptilianShapeShifter);
		System.out.println("Amount of gold buried on land: "+gold+ " kg");
		
		
	
		
		
		
		
		
	}

}
