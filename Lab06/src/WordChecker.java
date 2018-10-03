/*
 * Written by Christopher Moyer
 */
public class WordChecker {
	
	public static String containsLetters(String string1, String string2)
	{
		
		if(string1.length() > string2.length())
		{
			return "They are not contained";
		}
		if(string1.equals("") && string2.equals(""))
		{
			return "They are contained";
		}
		if(string2.indexOf(string1.charAt(0)) != -1)
		{
			//If character at index 0 is contained, make a new string deleting the character at index 0
			String newString = string2.substring(1, string2.length());
			//Recursive call with the new string
			containsLetters(string1, newString);														
		}
		else
		{
			return "They are not contained";
		}
		return "They are contained";
	}
}
