import java.util.Random;
public class PetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Pet pet01 = new Pet();
		System.out.println(pet01.getName());
		Pet pet02 = Pet.createNewPet(PetType.armadillo);
		*/
		
		Random r = new Random();
		Pet[] petArr = new Pet[5];
		
		for(int i=0;i<petArr.length;i++)
		{
			petArr[i] = new Pet();
			petArr[i].setType(PetType.values()[r.nextInt(PetType.values().length)]);
		}
		Pet huh = Pet.splice(petArr);
	}

}
