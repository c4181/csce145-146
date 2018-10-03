//Written by Andrew Denman and Christopher Moyer
public class DimensionException extends Exception{
	public DimensionException()
	{
		super("Dimensions must be of length one at least");
	}
	public DimensionException(String aMsg)
	{
		super(aMsg);
	}
}
