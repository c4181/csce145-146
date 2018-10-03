public class LinkedBSTree <T extends Comparable<T>> {
	private class Node
	{
		private T data;
		private Node leftChild;
		private Node rightChild;
		public Node (T aData)
		{
			data = aData;
			leftChild=rightChild=null;
		}
	}
	
	private Node root; //First element of tree
	public LinkedBSTree()
	{
		root = null;
	}
	
	public void insert(T aData)
	{
		if(root==null)
			root = new Node(aData);
		else
			insert(root,aData);
	}
	
	private Node insert(Node aNode, T aData)
	{
		if(aNode == null)
			aNode = new Node(aData); //Found a leaf
		else if(aData.compareTo(aNode.data)<0)
		{
			aNode.leftChild = insert(aNode.leftChild,aData);
		}
		else if(aData.compareTo(aNode.data) >= 0)// Go right
			aNode.rightChild = insert(aNode.rightChild,aData);
		return aNode;
	}
	public boolean search(T aData)
	{
		return search(root,aData);
	}
	private boolean search(Node aNode,T aData)
	{
		if(aNode == null)
			return false;//Wasn't in the tree
		if(aData.compareTo(aNode.data) == 0)//We found it
			return true;
		else if(aData.compareTo(aNode.data) < 0)//go left
			return search(aNode.leftChild,aData);
		else
			return search(aNode.rightChild,aData);//go right
	}

	public void printPreoder()
	{
		printPreOrder(root);
	}
	private void printPreOrder(Node aNode)
	{
		if(aNode==null)
			return;
		System.out.println(aNode.data);//Access the Node
		printPreOrder(aNode.leftChild);
		printPreOrder(aNode.rightChild);
	}
	
	public void printInOrder()
	{
		printInOrder(root);
	}
	private void printInOrder(Node aNode)
	{
		if(aNode==null)
			return;
		printInOrder(aNode.leftChild);
		System.out.println(aNode.data);//Access the Node
		printInOrder(aNode.rightChild);
	}
	
	public void printPostOrder()
	{
		printInOrder(root);
	}
	private void printPostOrder(Node aNode)
	{
		if(aNode==null)
			return;
		printPostOrder(aNode.leftChild);
		printPostOrder(aNode.rightChild);
		System.out.println(aNode.data);
		
	}
	
	
	
	public void delete(T aData)
	{
		root = delete(root,aData);
	}
	private Node delete(Node aNode, T aData)
	{
		//Find the value
		if(aNode==null)//The value isn't found
			return null;
		if(aData.compareTo(aNode.data) < 0)//Go left
			aNode.leftChild = delete(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data) > 0)//Go right
			aNode.rightChild = delete(aNode.rightChild,aData);
		else//We Found it!!
		{
			
			//We may or may not have a left child so whatever just return it
			if(aNode.rightChild == null)
				return aNode.leftChild;
			//We do have a right child but do not have a left
			if(aNode.leftChild == null)
				return aNode.rightChild;
			//We have two kids
			Node temp = aNode;//Temp points to the node we are deleting
			//Point aNode to the smallest value in the rught subtree
			aNode = findMinInTree(aNode.rightChild);
			//Delete smallest element from right subtree
			aNode.rightChild = deleteMinFromTree(temp.rightChild);
			aNode.leftChild = temp.leftChild;
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if(aNode==null)
			return null;
		if(aNode.leftChild==null)
			return aNode;
		else
			return (aNode.leftChild);
		
	}
	public T findMaxArea()
	{
		Node tempNode = root;
		while(tempNode.rightChild != null)
		{
			tempNode = tempNode.rightChild;
		}
		return tempNode.data;
		
	}
	public void deleteByArea(double anArea)
	{
		Node tempNode = root;
		Shape tempShape = (Shape)tempNode.data;
		while(tempShape.getArea() < anArea)
		{
			tempNode = tempNode.rightChild;
			tempShape = (Shape)tempNode.data;
		}
			
		deleteGreaterValues(tempNode);
	}
	
	private void deleteGreaterValues(Node aNode)
	{
		if(aNode.rightChild!=null)
		{
			deleteGreaterValues(aNode.rightChild);
			delete(aNode.data);
		}
		
		delete(aNode.data);
		return;
	}
	
	private Node deleteMinFromTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode.rightChild;
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
	}
	
	
	
}
