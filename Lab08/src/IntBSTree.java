import java.util.Scanner;
import java.io.*;
public class IntBSTree {
	private class Node
	{
		private int data;
		private Node leftChild;
		private Node rightChild;
		public Node (int aData)
		{
			data = aData;
			leftChild=rightChild=null;
		}
	}
	
	private Node root; //First element of tree
	public IntBSTree()
	{
		root = null;
	}
	
	public void insert(int aData)
	{
		if(root==null)
			root = new Node(aData);
		else
			insert(root,aData);
	}
	
	private Node insert(Node aNode, int aData)
	{
		if(aNode == null)
			aNode = new Node(aData); //Found a leaf
		else if(aData < aNode.data)
		{
			aNode.leftChild = insert(aNode.leftChild,aData);
		}
		else if(aData > aNode.data)// Go right
			aNode.rightChild = insert(aNode.rightChild,aData);
		return aNode;
	}
	public boolean search(int aData)
	{
		return search(root,aData);
	}
	
	private boolean search(Node aNode,int aData)
	{
		if(aNode == null)
			return false;//Wasn't in the tree
		if(aData == aNode.data)//We found it
			return true;
		else if(aData < aNode.data)//go left
			return search(aNode.leftChild,aData);
		else
			return search(aNode.rightChild,aData);//go right
	}
	private Node searchNode(int aData)
	{
		return searchNode(root,aData);
	}
	private Node searchNode(Node aNode,int aData)
	{
		if(aNode == null)
			return null;//Wasn't in the tree
		if(aData == aNode.data)//We found it
			return aNode;
		else if(aData < aNode.data)//go left
			return searchNode(aNode.leftChild,aData);
		else
			return searchNode(aNode.rightChild,aData);//go right
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
	public void printPostOrder(Node aNode)
	{
		if(aNode==null)
			return;
		printPostOrder(aNode.leftChild);
		printPostOrder(aNode.rightChild);
		System.out.println(aNode.data);
	}
	
	public void remove(int aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, int aData)
	{
		//Find the value
		if(aNode==null)//The value isn't found
			return null;
		if(aData < aNode.data)//Go left
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData > aNode.data)//Go right
			aNode.rightChild = remove(aNode.rightChild,aData);
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
	
	private Node deleteMinFromTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode.rightChild;
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
	}
	
	public int getDepth(int aValue)
	{
		Node tempNode = searchNode(aValue);
		
		if(tempNode == null)
			return -1;
		int depth = 0;
		depth = findDepth(root,aValue,depth);
		return depth;
	}
	private int findDepth(Node aNode,int aValue,int depth)
	{
			if(aValue == aNode.data)//We found it
				return depth;
			else if(aValue < aNode.data)//go left
				return findDepth(aNode.leftChild,aValue,depth+1);
			else
				return findDepth(aNode.rightChild,aValue,depth+1);//go right
	}
	
}
