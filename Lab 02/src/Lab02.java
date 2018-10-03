import java.util.Scanner;

public class Lab02 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("The machine will determine a combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
	
	
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int pennies = 1;
		
	
		int amountOfQuarters = num / quarter;
		//num % quarter = int amountOfQuarters;  Mistake
		int remainder = num % quarter;
		
		int amountOfDimes = remainder / dime;
		remainder = remainder % dime;
		
		int amountOfNickels = remainder / nickel;
		remainder = remainder % nickel;
		
		int amountOfPennies = remainder / pennies;
		
		System.out.println(num + " cents in coins:");
		System.out.println(amountOfQuarters + " quarters");
		System.out.println(amountOfDimes + " dimes");
		System.out.println(amountOfNickels + " nickels");
		System.out.println(amountOfPennies + " pennies");

	}

}
