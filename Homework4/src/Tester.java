/*
 * Written by Christopher Moyer
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		String[] expressions = calc.readFile("revPol.txt");
		for(int i=0;i<expressions.length;i++)
		{
			System.out.println(calc.evaulateExp(expressions[i]));
		}
	}

}
