
public class Dresser {
	private static final int NUMBER_OF_DRAWERS = 5;
	private static final int DRAWER_CAPACITY = 10;
	private Clothing[][] clothes;
	
	private static final int UNDERGARMET_DRAWER = 0;
	private static final int SOCKS_AND_STOCKINGS_DRAWER = 1;
	private static final int TOPS_DRAWER = 2;
	private static final int BOTTOMS_DRAWER = 3;
	private static final int CAPES_DRAWER = 4;

	//Constructors
	public Dresser()
	{
		clothes = new Clothing[NUMBER_OF_DRAWERS][DRAWER_CAPACITY];
	}
	
	//Methods
	public void add(Clothing aClothing)
	{
		//Outer if checks for clothing type
		//Inner if check if drawer is full
		//Else puts in drawer
		for (int i=0;i<clothes.length;i++)
		{
			if(aClothing.getType() == ClothingType.Undergarment)
			{
				if(clothes[UNDERGARMET_DRAWER][clothes[UNDERGARMET_DRAWER].length-1] != null)
				{
					System.out.println("The drawer is full!");
					return;
				}
				else
				{
					clothes[UNDERGARMET_DRAWER][i] = aClothing;
					break;
				}
			}
			else if(aClothing.getType() == ClothingType.Socks || aClothing.getType() == ClothingType.Stockings)
			{
				if(clothes[SOCKS_AND_STOCKINGS_DRAWER][clothes[SOCKS_AND_STOCKINGS_DRAWER].length-1] != null)
				{
					System.out.println("The drawer is full");
					return;
				}
				else
				{
					clothes[SOCKS_AND_STOCKINGS_DRAWER][i] = aClothing;
					break;
				}
			}
			else if(aClothing.getType() == ClothingType.Top)
			{
				if(clothes[TOPS_DRAWER][clothes[TOPS_DRAWER].length-1] != null)
				{
					System.out.println("The drawer is full");
					return;
				}
				else
				{
					clothes[TOPS_DRAWER][i] = aClothing;
					break;
				}
			}
			else if(aClothing.getType() == ClothingType.Bottom)
			{
				if(clothes[BOTTOMS_DRAWER][clothes[BOTTOMS_DRAWER].length-1] != null)
				{
					System.out.println("The drawer is full");
					return;
				}
				else
				{
					clothes[BOTTOMS_DRAWER][i] = aClothing;
					break;
				}
			}
			else if(aClothing.getType() == ClothingType.Cape)
			{
				if(clothes[CAPES_DRAWER][clothes[CAPES_DRAWER].length-1] != null)
				{
					System.out.println("The drawer is full");
					return;
				}
				else
				{
					clothes[CAPES_DRAWER][i] = aClothing;
					break;
				}
			}
		}
	}
	
	public void remove(ClothingType aType, ClothingColor aColor)
	{
		int removeDrawerIndex = -1;
		int removeClothingIndex = -1;
		
		for(int i=0;i<NUMBER_OF_DRAWERS;i++)
		{
			for(int j=0;i<DRAWER_CAPACITY;j++)
			{
				if(clothes[i][j] != null && clothes[i][j].getType() == aType && clothes[i][j].getColor() == aColor)
				{
					removeDrawerIndex = i;
					removeClothingIndex = j;
					break;
				}
			}
		}
		if (removeDrawerIndex == -1)
		{
			System.out.println("Clothing not found");
		}
		else
		{
			for(int i=removeClothingIndex;i>DRAWER_CAPACITY;i++)
			{
				clothes[removeDrawerIndex][i] = clothes[removeDrawerIndex][i+1];
			}
			clothes[removeDrawerIndex][DRAWER_CAPACITY-1] = null;
		}
		
	}
	
	public void print()
	{
		for(int i=0;i<NUMBER_OF_DRAWERS;i++)
		{
			for(int j=0;j<DRAWER_CAPACITY;j++)
			{
				if(clothes[i][j] == null)
				{
					break;
				}
				else
				{
					System.out.println(clothes[i][j]);
				}
			}
		}
	}
	
	
}
