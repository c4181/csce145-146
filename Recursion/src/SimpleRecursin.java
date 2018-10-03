
public class SimpleRecursin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDown(5);
		System.out.println(factorial(5));
	}
	public static void countDown(int num)
	{
		System.out.println(num);
		if(num <= 0)//Halt	
			return;
		else
			countDown(num-1);//Recursive call
	}
	public static int factorial(int num)
	{
		if(num==0)//Halt Condition
			return 1;
		else
			return num*factorial(num-1);//REcursive call
			//return num*factorial(num--);//DONT DO THIS
	}
	public static int gcd(int num1, int num2)
	{
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static int fibbo(int pos)
	{
		if(pos==1 || pos==2)
			return 1;
		else
			return fibbo(pos-1)+fibbo(pos-2);
	}

}
