/*
 * Written by Christopher Moyer
 */
public class CharacterCheck {
	
	public static boolean characterCheck(String aString)
	{
		ArrayStack<Character> charStack = new ArrayStack();
		for(int i=0;i<aString.length();i++)
		{
			//Check for an opening character and pushes it to the stack
			if(aString.charAt(i) == '(' || aString.charAt(i) =='“' ||aString.charAt(i) == '{' || aString.charAt(i) == '<')
			{
				charStack.push(aString.charAt(i));
			}
			//Checks for a closing character
			if(aString.charAt(i) == ')' || aString.charAt(i) == '”' || aString.charAt(i) == '}' || aString.charAt(i) == '>')
			{
				//Checks if stack is empty
				if(charStack.peek() == null)
					return false;
				//Checks for ()
				if(aString.charAt(i) == ')')
				{
					if(charStack.pop() != '(')
						return false;
				}
				//Checks for ""
				if(aString.charAt(i) == '”')
				{
					if(charStack.pop() != '“')
						return false;
				}
				//Checks for {}
				if(aString.charAt(i) == '}')
				{
					if(charStack.pop() != '{')
						return false;
				}
				//Checks for <>
				if(aString.charAt(i) == '>')
				{
					if(charStack.pop() != '<')
						return false;
				}
			}
		}
		//String was formatted correctly
		if(charStack.peek() == null)
			return true;
		//Characters are still in the stack and the string was not correctly formatted
		else
			return false;
	}
}
