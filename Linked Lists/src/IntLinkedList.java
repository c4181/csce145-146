
public class IntLinkedList {
	private class ListNode
	{
		private int data;
		private ListNode link;
		
		public ListNode()
		{
			data = 0;
			link = null;
		}
		public ListNode(int aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;//First element in linked list
	private ListNode curr;//Current node of list
	private ListNode prev;//One node behind the current
	
	public IntLinkedList()
	{
		head = curr = prev = null;
	}
	//Insert assumes data is added to the end of the linked list
	public void insert(int aData)
	{
		//Create the new node
		ListNode newNode = new ListNode(aData,null);
		if(head == null)//Head is empty
		{
			head = newNode;
			curr = head;
			return;
		}
		//List is not empty
		ListNode temp = head;
		while(temp.link !=null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public int getCurrent()
	{
		if(curr != null)
		{
			return curr.data;
		}
		else
			return 0;
	}
	
	public void setCurrent(int aData)
	{
		if(curr != null)
			curr.data = aData;
	}
	
	public void moveCurrentForward()
	{
		if(curr != null)
		{
			prev = curr;
			curr = curr.link;
		}
	}
	
	public void resetCurrent()
	{
		curr = head;
		prev = null;
	}
	
	public void insertAfterCurrent(int aData)
	{
		ListNode newNode = new ListNode(aData,null);
		if(curr != null)
		{
			newNode.link = curr.link;
			curr.link = newNode;
		}
		else if(head != null)
		{
			System.out.println("Current is outside the linked list");
		}
		else
		{
			System.out.println("The list was empty");
		}
	}
	
	public void deleteCurrentNode()
	{
		if(curr != null && prev !=null)//Curr is in the middle
		{
			prev.link = curr.link;
			curr = curr.link;
		}
		else if(curr != null && prev == null)//Curr was head
		{
			head = head.link;
			curr = head;
		}
		else//Curr was null
		{
			System.out.println("Cannot erase something that doesn't exist");
		}
	}
}
