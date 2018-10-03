import java.util.*;
public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface<Integer> stack = new LLStack();
		for(int i=0;i<10;i++)
			stack.push(i);
		stack.print();
		System.out.println("\n"+stack.pop()+"\n");
		stack.print();
	}
	
	//Built in Java Stack
	Stack<Integer> iStack = new Stack<Integer>();
}
