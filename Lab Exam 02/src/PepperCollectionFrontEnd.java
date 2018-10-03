public class PepperCollectionFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Adding peppers\n");
		PepperCollection pepperCollection = new PepperCollection();
		pepperCollection.addPepper(new Pepper("Bell Pepper",0));
		pepperCollection.addPepper(new Pepper("Banana Pepper",1000));
		pepperCollection.addPepper(new Pepper("Poblano",3500));
		pepperCollection.addPepper(new Pepper("Ghost Pepper",1000000));
		pepperCollection.addPepper(new Pepper("Carolina Reaper",2000000));
		pepperCollection.addPepper(new Pepper("Tabasco Pepper",50000));
		pepperCollection.addPepper(new Pepper("Habanero Chili",350000));
		pepperCollection.addPepper(new Pepper("Jalapeno",10000));
		pepperCollection.addPepper(new Pepper("Red Savina Habenero",580000));
		
		System.out.println("Printing out unsorted peppers\n");
		
		pepperCollection.printPeppers();
		
		System.out.println("\nPrinting out sorted peppers (hottest to mildest)\n");
		pepperCollection.sortPeppers();
		pepperCollection.printPeppers();
	}

}