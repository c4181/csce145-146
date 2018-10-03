/*
 * Written by Christopher Moyer
 */
public class Tester {

	public static void main(String[] args) {
		
		CharacterCheck charCheck = new CharacterCheck();
		
		System.out.println(charCheck.characterCheck("()"));
		
		System.out.println(charCheck.characterCheck("<<<>>>"));
		
		System.out.println(charCheck.characterCheck("{(“tacos”)}"));
		
		System.out.println(charCheck.characterCheck("if(pass == true){return “yay!”;}"));
		
		System.out.println(charCheck.characterCheck("abcd"));
		
		System.out.println(charCheck.characterCheck("“””"));
		
		System.out.println(charCheck.characterCheck("<(“)"));
		
		System.out.println(charCheck.characterCheck(":-)"));
		
		System.out.println(charCheck.characterCheck("<3"));
		
		System.out.println(charCheck.characterCheck("(<{“”}>"));
	}

}
