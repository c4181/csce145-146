
public class DivideByZeroException extends Exception {
	public DivideByZeroExeception()
	{
		super("Tried to divide by zero");
	}
	public DivideByZeroException(String aMsg)
	{
		super(aMsg);
	}
}
