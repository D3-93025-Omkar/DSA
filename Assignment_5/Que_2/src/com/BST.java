package com;

public class BST {
	static class Node {
		private Node right, left;
		private int data;
		
		public Node(int value) {
			right = left = null;
			data = value;
		}
	}
      
	Node root;

	public BST() {
		root = null;
	}
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return;
		}
		
		Node trav = root;
		while (true) {
		    if (value < trav.data) {
		    	if (trav.left == null) {
		    		trav.left = newNode;
		    		return;
		    	}
		    	trav = trav.left;
		    }
		    else {
		    	if (trav.right == null) {
		    		trav.right = newNode;
		    		return;
		    	}
		    	trav = trav.right;
		    }
		}
	}
	
	private Node binarySearch(Node trav, int value) {
		
		if (trav == null) {
			return null;
		}
		
		if (trav.data == value) {
			System.out.println("data : " + trav.data);
			return trav;
		}
		else if (value < trav.data) {
			return binarySearch(trav.left, value);
		}
		else {
			 return binarySearch(trav.right, value);
		}
	}
	
    public void binarySearch(int value) {
        if (binarySearch(root, value) != null) {
        	System.out.println("Value Found !!");
        }
        else {
        	System.out.println("Value nor Found !!");
        }
	}
	
	public void preOrderTraversal(Node trav) {
		if (trav == null) return;
		
	    System.out.print(" " + trav.data);
	    preOrderTraversal(trav.left);
	    preOrderTraversal(trav.right);
	}
	
   public void preOrderTraversal() {
	   System.out.print("PreOrder Traversal : ");
	   preOrderTraversal(root);
	   System.out.println();
	}
   
   public void findSuccessor(int value) {
	   if (root == null) return;
	   Node trav = binarySearch(root, value);
	   Node succ = trav.right;
	   if (succ == null) return;
	   
	   while (succ.left != null) {
		   succ = succ.left;
	   }
	   
	   System.out.println("Successor of given node : " + succ.data);
	   
	  
   }
	
}
