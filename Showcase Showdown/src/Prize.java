/*
 * Written by Christopher Moyer
 */
public class Prize {
	private String name;
	private int price;
	
	public Prize()
	{
		this.name = "No Name";
		this.price = 0;
	}
	public Prize(String aName,int aPrice)
	{
		this.setName(aName);
		this.setPrice(aPrice);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>0)
		{
		this.price = price;
		}
	}
	
	public String toString()
	{
		return this.name;
	}
	
}
