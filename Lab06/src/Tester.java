/*
 * Written by Christopher Moyer
 */
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		WordChecker check = new WordChecker();
		
		System.out.println("Enter 2 words.  I will determine if the letters of one is contained in the other");
		String wordOne = keyboard.nextLine();
		String wordTwo = keyboard.nextLine();
		System.out.println(check.containsLetters(wordOne,wordTwo));
	}

}
