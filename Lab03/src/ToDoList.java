/*
 * Written by Christopher Moyer
 */
public class ToDoList {
	
	private class ListNode {
		private String data;
		private ListNode link;
		
		//Constructor
		public ListNode()
		{
			data = "None";
			link = null;
		}
		public ListNode(String aData,ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	
	//Constructor
	public ToDoList()
	{
		head = current = previous = null;
	}
	
	//Methods
	
	//Moves to next node if the next node is != null
	public void goToNext()
	{
		if(current.link != null)
		{
			previous = current;
			current = current.link;
		}
	}
	
	public void goToPrevious()
	{
		if(previous == null)//Current is at head
		{
			return;
		}
		
		//Find previous
		ListNode temp = head;
		while(temp.link != previous)
		{
			temp = temp.link;
		}
		//Move pointers
		previous = temp;
		current = previous.link;
	}
	
	public String getDataAtCurrent()
	{
		if(current!=null)
		{
			return current.data;
		}
		else
			return "Current is null";
	}
	
	public void setDataAtCurrent(String aData)
	{
		if(current!=null)
			current.data = aData;
	}
	
	public void addItem(String aData)//Adds item to end
	{
		ListNode newNode = new ListNode(aData,null);
		if(head==null)//head is empty
		{
			head = newNode;
			current = head;
			return;
		}
		//List is not empty
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void insertAfterCurrent(String aData)
	{
		ListNode newNode = new ListNode(aData,null);
		if(current.link!=null)//Middle of list
		{
			newNode.link = current.link;
			current.link = newNode;
		}
		else//end of list
			current.link = newNode;
	}
	
	public void deleteCurrentNode()
	{
		if(current != null && previous != null)//Current is in the middle
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
	
	public void showList()
	{
		System.out.println("Printing List");
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
		System.out.println();
	}
}
