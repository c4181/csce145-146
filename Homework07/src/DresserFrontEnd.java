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
					+ "\nEnter 2: to remove an item"
					+ "\nEnter 3: to print out the dresser contents"
					+ "\nEnter 9: to quit");
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
						+ "\nIt may be Undergarment, Socks, Stockings, Top, Bottom, or Cape");
				ClothingType userType = ClothingType.valueOf(keyboard.nextLine());
				
				System.out.println("Enter a color"
						+ "\nIt may be Brown, Pink, Orange, Green, Blue, Purple, or Grey");
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
