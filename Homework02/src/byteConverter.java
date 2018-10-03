/*
 * Written by Christopher Moyer
 * 
 */

import java.util.Scanner;

public class byteConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an 8 bit binary number and I will convert it to a decimal");
		
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		String copyInput = input;
		
		
		
		
		int output = Character.getNumericValue(copyInput.charAt(0)) * 128;
		output += Character.getNumericValue(copyInput.charAt(1)) * 64;
		output += Character.getNumericValue(copyInput.charAt(2)) * 32;
		output += Character.getNumericValue(copyInput.charAt(3)) * 16;
		output += Character.getNumericValue(copyInput.charAt(4)) * 8;
		output += Character.getNumericValue(copyInput.charAt(5)) * 4;
		output += Character.getNumericValue(copyInput.charAt(6)) * 2;
		output += Character.getNumericValue(copyInput.charAt(7)) * 1;
		
		
		System.out.println(input + " in decimal form is " +output);
		
	}

}
