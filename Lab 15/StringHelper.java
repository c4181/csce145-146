
public class StringHelper {
	
	
	public static String meshStrings(String aString1, String aString2) {//Mesh String function
		String returnString = "";//return String
		if(aString1 != null && aString1.length() <= aString2.length()) {//check for valid input and which string is longer
			for(int i=0; i <aString1.length();i++) {//mesh first part if aString1 is smaller
				returnString += aString1.charAt(i) +""+ aString2.charAt(i);
			}
			int temp = aString2.length() - aString1.length();//mesh remainder of the longer word
			for(int i = (aString2.length() -temp); i <aString2.length();i++) {
				returnString += ""+aString2.charAt(i);
			}
		}
		else
		{
			for(int i=0; i <aString2.length();i++) {//mesh first part if aString2 is smaller
				returnString += aString1.charAt(i) +""+ aString2.charAt(i);
			}
			int temp = aString1.length() - aString2.length();//mesh remainder of the longer word
			for(int i = (aString1.length() -temp); i <aString1.length();i++) {
				returnString += ""+aString1.charAt(i);
			}
		}
		
		return returnString;
	}
	
	public static String replaceVowelsWithOodle(String aString)//replaceVowelsWithOodle
	{
		if (aString==null)//check valid input
		{
			return "invalid string";
		}
		String returnString = "";//return String
		for(int i=0; i<aString.length(); i++)//replacing vowels with oodle
		{
			if(aString.charAt(i) == 'a' || aString.charAt(i) == 'A')
			{
				returnString += ""+"oodle";			
			}
			else if(aString.charAt(i) == 'e' || aString.charAt(i) == 'E') 
			{
				returnString += ""+"oodle";	
			}
			else if(aString.charAt(i) == 'i' || aString.charAt(i) == 'I')
			{
				returnString += ""+"oodle";	
			}
			else if(aString.charAt(i) == 'o' || aString.charAt(i) == 'O')
			{
				returnString += ""+"oodle";	
			}
			else if(aString.charAt(i) == 'u' || aString.charAt(i) == 'U')
			{
				returnString += ""+"oodle";	
			}
			else
			{
				returnString += ""+aString.charAt(i);
			}
		}
		return returnString;
	}
	
	public static double weight(String aString) 
	{
		if (aString==null)//check valid input
		{
			return 0.0;
		}
		double returnWeight = 0.0;//return double
		for(int i=0; i<aString.length(); i++)//checking for weight of the chars
		{
			if(aString.charAt(i) == 'a' || aString.charAt(i) == 'A')
			{
				returnWeight += 2.5;			
			}
			else if(aString.charAt(i) == 'e' || aString.charAt(i) == 'E') 
			{
				returnWeight += 2.5;	
			}
			else if(aString.charAt(i) == 'i' || aString.charAt(i) == 'I')
			{
				returnWeight += 2.5;	
			}
			else if(aString.charAt(i) == 'o' || aString.charAt(i) == 'O')
			{
				returnWeight += 2.5;	
			}
			else if(aString.charAt(i) == 'u' || aString.charAt(i) == 'U')
			{
				returnWeight += 2.5;	
			}
			else
			{
				returnWeight += 3.4;
			}
		}
		return returnWeight;
	}

}
