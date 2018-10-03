enum PetType{cat, dog, hamster, hedgehog, armadillo, turkey, owl, abomination};
public class Pet {
	//Instance Variables
	private String name;
	private double weight;
	private int age;
	private PetType type;
	
	//Constructors
	public Pet()
	{
		this.name = "No Name yet";
		this.weight = 0.0;
		this.age = 0;
		this.type = PetType.abomination;
	}
	public Pet(String aName, double aWeight, int anAge, PetType aType)
	{
		//Fill in with mutators
		this.setName(aName);
		this.setWeight(aWeight);
		this.setAge(anAge);
		this.setType(aType);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public PetType getType()
	{
		return this.type;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight >= 0.0)
		{
			this.weight	= aWeight;
		}
	}
	public void setAge(int anAge)
	{
		if(anAge >= 0)
		{
			this.age = anAge;
		}
	}
	public void setType(PetType aType)
	{
		this.type = aType;
	}

	//Other Methods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.age+" "+this.type;
	}
	public boolean equals(Pet aPet)
	{
		return aPet != null && 
				aPet.getName().equals(this.name) && 
				aPet.getAge() ==this.age &&
				aPet.getWeight() ==this.weight && 
				aPet.getType() == this.type;
	}
	public static Pet createNewPet(PetType aType)
	{
		Pet newPet = new Pet();
		newPet.setType(aType);
		return newPet;
	}
	
	public static Pet breed(Pet pet01, Pet pet02)
	{
		if(pet01.getType() == pet02.getType())
		{
			return createNewPet(pet01.getType());
		}
		else
		{
			System.out.println("STOP YOU FREAK");
			return null;
		}
	}
	public static Pet splice(Pet pet01, Pet pet02)
	{
		if(pet01.getType() == pet02.getType())
		{
			System.out.println("That's not interesting");
			return createNewPet(pet01.getType());
		}
		else
		{
			System.out.println("You are committing and act agsint God!");
			System.out.println("A part "+pet01.getType()+ " and part "+pet02.getType());
			return createNewPet(PetType.abomination);
		}
	}
	public static Pet splice(Pet[] petArr)//Overloaded method
	{
		if(petArr == null)
		{
			return null;
		}
		System.out.println("You are creating a super crime against nature!");
		System.out.println("A part");
		/* Same as for each loop
		for(int i=0;i<petArr.length;i++)
		{
			System.out.println(petArr[i].getType()+" ");
		}*/
		for(Pet pet : petArr)//For each loop
		{
			System.out.println(pet.getType()+" ");
		}
		System.out.println();
		return createNewPet(PetType.abomination);
	}
}
