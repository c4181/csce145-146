import java.util.Scanner;
/*
 * Written by Andrew Denman and Christopher Moyer
 */

public class StringHelperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the String Helper Tester");
		
		//Mesh Test
		System.out.println("Enter 2 words to mesh");
		String input1 = keyboard.nextLine();
		String input2 = keyboard.nextLine();
		String output1 = StringHelper.meshStrings(input1, input2);
		System.out.println("Meshing "+ input1 + " with " + input2);
		System.out.println(output1);
		
		//Oodle Test
		System.out.println("Enter a word and I'll replace the vowels with oodle");
		String input3 = keyboard.nextLine();
		String output2 = StringHelper.replaceVowelsWithOodle(input3);
		System.out.println("Replacing voewls with oodle in the word " + input3);
		System.out.println(output2);
		
		//Weight Test
		System.out.println("Enter a word and I'll give you it's weight");
		String input4 = keyboard.nextLine();
		double output3 = StringHelper.weight(input4);
		System.out.println("The weight of the word "+input4+" is");
		System.out.println(output3);
	}

}
