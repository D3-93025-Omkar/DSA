package com;

public class CircularLinkedList {
	
	static class Node {
		int data;
		Node next;
		
		public Node(int value) {
		    data = value;
		}
		
	}
	
	Node tail;
	int size;
	
	public CircularLinkedList() {
		tail = null;
		size = 0;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		
	}
	
	public void addLast(int value){
		Node newNode = new Node(value);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = tail.next;
		}
	}
	
	public void deleteFirst() {
		
		if (tail == null) return;
		if (tail.next == tail.next.next) {
			tail = null;
			return;
		}
		tail.next = tail.next.next;
	}
	
	public void deleteLast() {
		if (tail == null) return;
		if (tail.next == tail.next.next) {
			tail = null;
			return;
		}
		
		Node trav = tail;
		do {
			trav = trav.next;
		}
		while (trav.next != tail);
		
		trav.next = trav.next.next;
		tail = trav;
	}
	
	public void insertPosition(int pos, int value) {
	    if (pos < 1) return;
	    if (pos == 1) {
	    	addFirst(value);
	    }
	    else {
	    	Node newNode = new Node(value);
	    	Node trav = tail.next;
	    	for (int i = 1; i < pos - 1 && trav != tail; i++) {
	    		trav = trav.next;
	    	}
	    	if (trav == tail) {
	    		addLast(value);
	    		return;
	    	}
	    	newNode.next = trav.next;
	    	trav.next = newNode;
	    	
	    }
	}
	
	public void deletePostion(int pos) {
		 if (pos < 1) return;
		 
		 if (pos == 1) {
			 deleteFirst();
		 }
		 else {
			 Node trav = tail.next;
             for (int i = 1; i < pos - 1 && trav != tail; i++) {
            	 trav = trav.next;
             }
             if (trav == tail) return;
             if (trav.next == tail) deleteLast();
             else {
            	 trav.next = trav.next.next;
             }
		 }
		 
	}
	
	public void display() {
		
		if (tail == null) return;
		Node trav = tail;
		do {
		    trav = trav.next;
		    System.out.print(trav.data + "->");
		}
		while (trav != tail);
		
	}

}
