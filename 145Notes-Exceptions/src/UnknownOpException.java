
public class UnknownOpException extends Exception {
	public UnknownOpException()
	{
		super("Unknown operation was used");//Make sure an error message is here
	}
	public UnknownOpException(String aMsg)
	{
		super(aMsg);
	}
}
