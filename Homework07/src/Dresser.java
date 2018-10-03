
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
					for(int j=0;j<clothes[UNDERGARMET_DRAWER].length;j++)
					{
						if(clothes[UNDERGARMET_DRAWER][j] == null)
						{
							clothes[UNDERGARMET_DRAWER][j] = aClothing;
							break;
						}
					}
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
					for(int j=0;j<clothes[SOCKS_AND_STOCKINGS_DRAWER].length;j++)
					{
						if(clothes[SOCKS_AND_STOCKINGS_DRAWER][j] == null)
						{
							clothes[SOCKS_AND_STOCKINGS_DRAWER][j] = aClothing;
							break;
						}
					}
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
					for(int j=0;j<clothes[TOPS_DRAWER].length;j++)
					{
						if(clothes[TOPS_DRAWER][j] == null)
						{
							clothes[TOPS_DRAWER][j] = aClothing;
							break;
						}
					}
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
					for(int j=0;j<clothes[BOTTOMS_DRAWER].length;j++)
					{
						if(clothes[BOTTOMS_DRAWER][j] == null)
						{
							clothes[BOTTOMS_DRAWER][j] = aClothing;
							break;
						}
					}
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
					for(int j=0;j<clothes[CAPES_DRAWER].length;j++)
					{
						if(clothes[CAPES_DRAWER][j] == null)
						{
							clothes[CAPES_DRAWER][j] = aClothing;
							break;
						}
					}
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
			for(int j=0;j<DRAWER_CAPACITY;j++)
			{
				if(clothes[i][j] != null && clothes[i][j].getType() == aType && clothes[i][j].getColor() == aColor)
				{
					System.out.println("Your clothing was found at"+i+" "+j);
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
			for(int i=removeClothingIndex;i<DRAWER_CAPACITY-1;i++)
			{
				clothes[removeDrawerIndex][i] = clothes[removeDrawerIndex][i+1];
			}
			clothes[removeDrawerIndex][DRAWER_CAPACITY-1] = null;
		}
		
	}
	
	//Lists each drawer and clothing in the drawer
	public void print()
	{
		for(int i=0;i<NUMBER_OF_DRAWERS;i++)
		{
			System.out.println("Drawer "+i);
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
			System.out.println();
		}
	}
	
	
}
