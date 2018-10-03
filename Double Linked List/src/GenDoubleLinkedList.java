
public class GenDoubleLinkedList <T> {
	private class ListNode {
		private T data;
		private ListNode nextLink;
		private ListNode prevLink;
		public ListNode()
		{
			data = null;
			nextLink = null;
			prevLink = null;
		}
		public ListNode(T aData, ListNode aNextLink, ListNode aPrevLink)
		{
			data = aData;
			nextLink = aNextLink;
			aPrevLink = aPrevLink;
		}
	}
	
	private ListNode head;
	private ListNode current;
	public GenDoubleLinkedList()
	{
		head = current = null;
	}
	
	//Methods
	
	//Go to next if next is not null
	public void insert(T aData)
	{
		ListNode newNode = new ListNode(aData,null,null);
		//List is empty
		if(head==null)
		{
			head = current = newNode;
			return;
		}
		//List is not empty
		ListNode temp = head;
		while(temp.nextLink!=null)
		{
			temp=temp.nextLink;
		}
		temp.nextLink = newNode;
		newNode.prevLink = temp;
	}
	public void goToNext()
	{
		if(current.nextLink != null)
		{
			current = current.nextLink;
		}
	}
	//Go to previous if previous is not null
	public void goToPrev()
	{
		if(current.prevLink != null)
		{
			current = current.prevLink;
		}
	}
	//Get data if current node is not null
	public T getDataAtCurrent()
	{
		if(current!=null)
			return current.data;
		else
			return null;
	}
	//Sets the data at current node if current is not equal to null
	public void setDataAtCurrent(T aData)
	{
		if(current!=null)
			current.data = aData;
	}
	//
	public void insertNodeAfterCurent(T aData)
	{
		ListNode newNode = new ListNode(aData,null,null);
		//Curent is in the middle
		if(current!=null && current.nextLink!=null)
		{
			newNode.nextLink = current.nextLink;
			current.nextLink.prevLink = newNode;
			current.nextLink = newNode;
			newNode.prevLink = current;
		}
		//Current is at the end or head
		else if(current!=null && current.nextLink==null)
		{
			current.nextLink = newNode;
			newNode.prevLink = current;
		}
	}
	public void deleteCurrentNode()
	{
		//Current is head
		if(current != null && current.prevLink==null)
		{
			current = head = head.nextLink;
			head.prevLink = null;
		}
		//Current is in the middle
		else if(current != null && current.prevLink != null)
		{
			current.nextLink.prevLink = current.prevLink;
			current.prevLink.nextLink = current.nextLink;
		}
		
	}
	public void showList()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
		System.out.println();
	}
	public boolean inList(T aData)
	{
		ListNode temp = head;
		boolean inList = false;
		while(temp != null)
		{
			if(temp.data.equals(aData))
				return true;
			else
				temp = temp.nextLink;
		}
		return false;
	}
}
