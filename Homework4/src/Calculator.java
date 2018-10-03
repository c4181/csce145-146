/*
 * Written by Christopher Moyer
 */
import java.io.*;
import java.util.Scanner;
public class Calculator {
	private String[] expressions;
	public static final String DELIM = " ";
	public static final char SPACE = ' ';
	
	public static String[] readFile(String fileName)
	{
		if(fileName==null)
			return null;
		
		try 
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			//1st pass Count amount of stuff
			int expCount = 0;
			while(fileScanner.hasNextLine())
			{
				expCount++;
				fileScanner.nextLine();
			}
			fileScanner = new Scanner(new File(fileName));
			String fileLine;
			String[] splitString;
			String[] retString = new String[expCount];
			//Body
			expCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				retString[expCount] = fileLine;
				expCount++;
			}
			fileScanner.close();
			return retString;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public int evaulateExp(String aString)
	{
		System.out.println("Calculating "+aString);
		String[] splitExp = aString.split(DELIM);
		ArrayStack<Integer> stack = new ArrayStack();
		
		for(int i=0;i<splitExp.length;i++)
		{
			try
			{
				stack.push(Integer.parseInt(splitExp[i]));
			}
			catch(Exception e)
			{
				
				if(stack.count()>=2)
				{
					int num1 = stack.pop();
					int num2 = stack.pop();
					switch(splitExp[i])
					{
					case "+":
						stack.push(num2+num1);
						break;
					case "-":
						stack.push(num2-num1);
						break;
					case "*":
						stack.push(num2*num1);
						break;
					case "/":
						if(num1==0)
						{
							System.out.println("Cannot divide by 0");
							return 0;
						}
						stack.push(num2/num1);
						break;
					default:
						System.out.println("Eception! For input string: "+splitExp[i]);
						break;
					}
				}
				else
				{
					System.out.println("Ill formatted expression");
					return 0;
				}
				
			}
		}
			return stack.pop();
	}
	public void printExp()
	{
		for(int i=0;i<expressions.length;i++)
		{
			System.out.println(expressions[i]);
		}
	}
	
}
