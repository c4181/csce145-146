enum ClothingType{Undergarment, Socks, Stockings, Top, Bottom, Cape};
enum ClothingColor{Brown, Red, Pink, Orange, Green, Blue, Purple, Grey};
public class Clothing {
	//Instance Variables
	private ClothingType type;
	private ClothingColor color;
	
	//Constructors
	public Clothing()
	{
		this.type = ClothingType.Undergarment;
		this.color = ClothingColor.Brown;
	}
	public Clothing(ClothingType aType, ClothingColor aColor)
	{
		this.setType(aType);
		this.setColor(aColor);
	}
	
	//Accessors
	public ClothingType getType()
	{
		return this.type;
	}
	public ClothingColor getColor()
	{
		return this.color;
	}
	
	//Mutators
	public void setType(ClothingType aType)
	{
		this.type = aType;
	}
	public void setColor(ClothingColor aColor)
	{
		this.color = aColor;
	}
	
	
	//Methods
	public String toString()
	{
		return this.type+" "+this.color;
	}
	public boolean equals(Clothing aClothing)
	{
		return aClothing!=null && aClothing.getType() == this.type && aClothing.getColor() == this.color;
	}
}
