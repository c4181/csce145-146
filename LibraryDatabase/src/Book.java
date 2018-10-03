
public class Book {
	private String name;
	private String aurthor;
	private int yearPublished;
	private String publisher;
	private int ISBN;
	private int pageCount;
	
	public Book ()
	{
		this.name = "No Name Yet";
		this.aurthor = "No Aurthor";
		this.yearPublished = 2000;
		this.publisher = "No Publisher";
		this.ISBN = 00000000;
		this.pageCount = 1;
	}
	public Book(String aName,String anAurthor,int aYear,String aPublisher,int anISBN,int aPageCount)
	{
		this.setName(aName);
		this.setAurthor(anAurthor);
		this.setYearPublished(aYear);
		this.setPublihser(aPublisher);
		this.setISBN(anISBN);
		this.setPageCount(aPageCount);
	}
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public String getAurthor()
	{
		return this.aurthor;
	}
	public int getYearPublished()
	{
		return this.yearPublished;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public int getISBN()
	{
		return this.ISBN;
	}
	public int pageCount()
	{
		return this.pageCount;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setAurthor(String anAurthor)
	{
		this.aurthor = anAurthor;
	}
	public void setYearPublished(int aYear)
	{
		if(aYear>0)
		{
			this.yearPublished = aYear;
		}
		else
		{
			ErrorDialog error = new ErrorDialog();
			error.setErrorLabel("Invalid Year");
			error.setVisible(true);
		}
	}
	public void setPublihser(String aPublisher)
	{
		this.publisher = aPublisher;
	}
	public void setISBN(int anISBN)
	{
		if(anISBN > 0)
		{
			this.ISBN = anISBN;
		}
		else
		{
			ErrorDialog error = new ErrorDialog();
			error.setErrorLabel("Invalid ISBN");
			error.setVisible(true);
		}
	}
	public void setPageCount(int aPageCount)
	{
		if(aPageCount>0)
		{
			this.pageCount = aPageCount;
		}
		else
		{
			ErrorDialog error = new ErrorDialog();
			error.setErrorLabel("Invalid Page Count");
			error.setVisible(true);
		}
	}
	public String toString()
	{
		return "Name: "+this.name+" Aurthor: "+this.aurthor+" Year Published: "+this.yearPublished+" Publisher: "+this.publisher+" ISBN: "+this.ISBN+" Page Count: "+this.pageCount;
	}
}
