package com;


public class StackLL {
	
	static class Node{
		int data;
		Node prev;
		
		public Node(int value) {
            data = value;
            prev = null;
		}	
	}
	private Node top;
	
	public StackLL() {
         top = null;

	}
	
    public void push(int value) {
    	Node newNode = new Node(value);

    	newNode.prev = top;
    	top = newNode;
    	
    }
    
    public int pop() {
        int temp  = -1;
        
    	if (top == null) {
    		System.out.println("Stack is Empty !!");
    	}
    	else {
    		temp = top.data;
    		top = top.prev;
    	}
    	
    	return temp;
    	}
    
    public int peek() {
        int temp  = -1;
        
    	if (top == null) {
    		System.out.println("Stack is Empty !!");
    	}
    	else {
    		temp = top.data;
    	}
    	
    	return temp;
    	}
    	
    

}
