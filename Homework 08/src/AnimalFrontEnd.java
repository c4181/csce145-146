import java.util.Scanner;
public class AnimalFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		AnimalCollection animals = new AnimalCollection();
		
		System.out.println("Welcome to the Cat and Dog Collection!");
		
		while(quit==false)
		{
			System.out.println("Would you like to"
					+ "\n1. Add a cat or dog"
					+ "\n2. Remove a cat or dog"
					+ "\n3. Quit");
			int userInput1=0;
			int userInput2=0;
			userInput1=keyboard.nextInt();
			keyboard.nextLine();
			if(userInput1==1)//Adds a new animal
			{
				System.out.println("Would you like to add a 1. House Cat, 2. A Leopard, 3. A Domestic Dog, or 4. A wolf");
				userInput2=keyboard.nextInt();
				keyboard.nextLine();
				if(userInput2==1)//Adds House Cat
				{
					System.out.println("Enter the house cat's name, weight, mood, and type");
					HouseCat houseCat = new HouseCat();
					houseCat.setName(keyboard.nextLine());
					houseCat.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					houseCat.setMood(keyboard.nextLine());
					houseCat.setType(keyboard.nextLine());
					animals.addAnimal(houseCat);
				}
				else if(userInput2==2)//Adds Leopard
				{
					System.out.println("Enter the leopard's name, weight, mood, and number of spots");
					Leopard leopard = new Leopard();
					leopard.setName(keyboard.nextLine());
					leopard.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					leopard.setMood(keyboard.nextLine());
					leopard.setNumberOfSpots(keyboard.nextInt());
					keyboard.nextLine();
					animals.addAnimal(leopard);
				}
				else if(userInput2==3)//Adds DomesticDog
				{
					System.out.println("Enter the domestic dog's name, weight, energy level, and type");
					DomesticDog dog = new DomesticDog();
					dog.setName(keyboard.nextLine());
					dog.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					dog.setEnergyLevel(keyboard.nextInt());
					keyboard.nextLine();
					dog.setType(keyboard.nextLine());
					animals.addAnimal(dog);
				}
				else if(userInput2==4)//Adds Wolf
				{
					System.out.println("Enter the wolf's name, weight, energy level, and pack leader name");
					Wolf wolf = new Wolf();
					wolf.setName(keyboard.nextLine());
					wolf.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					wolf.setEnergyLevel(keyboard.nextInt());
					keyboard.nextLine();
					wolf.setPackLeaderName(keyboard.nextLine());
					animals.addAnimal(wolf);
				}
			}
			if(userInput1==2)
			{
				System.out.println("Enter the animals name to be removed");
				animals.removeAnimal(keyboard.nextLine());
			}
			if(userInput1==3)
			{
				System.out.println("Goodbye!");
				quit=true;
				break;
			}
			animals.printAnimals();
		}
	}

}
