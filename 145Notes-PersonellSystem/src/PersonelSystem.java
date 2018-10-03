
public class PersonelSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[5];
		
		people[0] = new Person();
		people[1] = new Student();
		people[2] = new Ugrad();
		people[3] = new Person("Bob");
		people[4] = new Ugrad("JJ",1,4);
		
		for(int i=0;i<people.length;i++)
		{
			System.out.println(people[i].toString());
		}
	}

}
