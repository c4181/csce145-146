
public class GenLinkedList <T>	{
	private class ListNode {
		private T data;
		private ListNode link;
		public ListNode()
		{
			data = null;
			link = null;
		}
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	public GenLinkedList()
	{
		head = current = previous = null;
	}
	
	public void insert(T aData)
	{
		//Create the node
		ListNode newNode = new ListNode(aData,null);
		if(head==null)
		{
			head = newNode;
			current = head;
			return;
		}
		//The list isn't empty
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void print()
	{
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public T getCurrent()
	{
		if(current != null)
			return current.data;
		else
			return null;
	}
	
	public void setCurrent(T aData)
	{
		if(current!=null)
			current.data = aData;
	}
	
	public void moveCurrentForward()
	{
		if(current==null)
			return;
		previous = current;
		current = current.link;
	}
	
	public void resetCurrent()
	{
		current = head;
		previous = null;
	}
	
	public boolean moreToIterate()
	{
		return current != null;
	}
	
	public void insertAfterCurrent(T aData)
	{
		ListNode newNode = new ListNode(aData,null);
		if(current!=null)
		{
			newNode.link = current.link;
			current.link = newNode;
			
		}
	}
	
	public void deleteCurrent()
	{
		if(current != null && previous != null)//Current is not head
		{
			previous.link = current.link;
			current = current.link;
		}
		else if(current != null && previous == null)//Current is the head
		{
			head = head.link;
			current = head;
		}
	}
	
	
	
}
