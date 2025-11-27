package com;

public class Queue {

	static class Node {
		Node next;
		int data;
		
		public Node(int value) {
             data = value;
             next = null;
		}
	}
	
	Node front;
	Node rear;
	public Queue() {
	    front = null;
	    rear = null;
	}
	
    public void push(int value) {
    	Node newNode = new Node(value);
    	if (front == null) {
    		front = rear = newNode;
    	}
    	rear.next = newNode;
    	rear = newNode;
    }
    
    public int pop() {
    	if (isEmpty()) return -1;
    	int temp = front.data;
    	front = front.next;
    	return temp;
    }
    
    public int peek() {
    	if (isEmpty()) return -1;
    	int temp = front.data;
    	return temp;
    }
    
    public boolean isEmpty() {
    	return front == null;
    }
}
