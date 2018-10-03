import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		Dresser dresser = new Dresser();
		
		System.out.println("Welcome to the dresser!");
		while(quit == false)
		{
			int userInput = -1;
			System.out.println("Enter 1: to add an item"
					+ "\n Enter 2: to remove an item"
					+ "\n Enter 3: to print out the dresser contents"
					+ "\n Enter 9: to quit");
			userInput = keyboard.nextInt();
			keyboard.nextLine();
			
			if(userInput==9)
			{
				System.out.println("Goodbye!");
				quit = true;
			}
			else if(userInput==1)
			{
				System.out.println("Enter the type"
						+ "\n It may be undergarment, socks, stockings, top, bottom, or cape");
				ClothingType userType = ClothingType.valueOf(keyboard.nextLine());
				
				System.out.println("Enter a color"
						+ "\n It may be brown, pink, orange, green, blue, purple, or grey");
				ClothingColor userColor = ClothingColor.valueOf(keyboard.nextLine());
				
				Clothing garment01 = new Clothing(userType, userColor);
				
				dresser.add(garment01);
			}
			else if(userInput==2)
			{
				System.out.println("Enter the type");
				ClothingType userType = ClothingType.valueOf(keyboard.nextLine());
				System.out.println("Enter the color");
				ClothingColor userColor = ClothingColor.valueOf(keyboard.nextLine());
				
				dresser.remove(userType, userColor);
				
			}
			else if(userInput==3)
			{
				dresser.print();
			}
		}
	}

}
