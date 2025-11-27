package com;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
   
   public int findLevelNode(int value) {
	   if (root == null) return -1;
	   Node trav = root;
	   int level = 0;
	 
	   while (trav != null) {
		   if (trav.data == value) {
			   return level;
		   }
		   else if (value < trav.data) {
			   level++;
			   trav = trav.left;
		   }
		   else {
			   level++;
			   trav = trav.right;
		   }
	   }
	  
	  return level;   
   }
   
   public void BFSTraversal() {
	   if (root == null) return;
	   Deque<Node> d = new LinkedList<>();
	   Node trav = root;
	   d.add(trav);
	   while (!d.isEmpty()) {
		    if (findLevelNode(d.peek().data) % 2 == 0) {
		    	trav = d.pollFirst();
		    	System.out.print(" even " + trav.data);
		    }
		    else {
		    	trav = d.pollLast();
		    	System.out.print(" " + trav.data);
		    }
		    if (trav.left != null) d.addLast(trav.left);
		    if (trav.right != null) d.addLast(trav.right);
	   }
	 
   }
	
}
