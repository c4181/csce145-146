
public class CrazyCatPersonHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat01 = new Cat();
		cat01.setName("Mr. Flufferkins");
		cat01.setWeight(20.0);
		cat01.setNumberOfLegs(4);
		System.out.println(cat01.getName());
		
		Cat cat02 = new Cat("Roscoe", 10.0,4);
		/*
		cat02.setName("Roscoe the Wondercat");
		cat02.setWeight(10);
		cat02.setNumberOfLegs(4);
		 */	
		System.out.println(cat02);
		System.out.println(cat01.equals(cat02));
	}

}
