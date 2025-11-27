package com;



public class  LinkedList {

	Node front;
	Node rear;
	int counter = 0;
	
	static class Node {
		private int data;
		private Node next, prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	public LinkedList() {
		front = rear = null;
	}
	
	public void pushFront(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			front = rear = newNode;
		}
		else {
			newNode.next = front;
			front.prev = newNode;
			front = newNode;
		}
		
	}
	
	public void pushRear(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			front = rear = newNode;
		}
		else {
			rear.next = newNode;
			newNode.prev = rear;
			rear = newNode;
		}

	}
	
	public int popFront() {
		int temp = -1;
		if (isEmpty()) return -1;
		if (front == rear) {
			temp = front.data;
			front = rear = null;
		}
		else {
			temp = front.data;
			front = front.next;
			front.prev = null;
		}
		return temp;

	}
	

	public int peekFront() {
		int temp = -1;
		if (isEmpty()) return -1;
		if (front == rear) {
			temp = front.data;
		}
		else {
			temp = front.data;
		}
		return temp;

	}
	
	public int popRare() {
		int temp = -1;
		Node nn;
		if (isEmpty()) return -1;
		if (front == rear)  {
			temp = front.data;
			nn = front;
		    front.prev = nn;
		    nn.next = front;
		    front = rear = null;
		    front = nn;
		    counter++;
			
		}
		else {
			temp = rear.data;
			nn = rear;
			front.prev = nn;
			nn.next = front;
			front = nn;
			counter ++;
			rear = rear.prev;
			rear.next = null;
		}
		
		System.out.println("deleted / redo ele : " + temp);
       return temp;
	}
	
	
	public void undo() {
		if (counter == 0) return;
		System.out.println("undo ele : " + front.data);
		Node nn = new Node(front.data);
		rear.next = nn;
		nn.prev = rear;
		front = front.next;
	}
	
	public void redo() {
      if (counter == 0) return;
      popRare();
	}
	

	public int peekRare() {
		int temp = -1;
		if (isEmpty()) return -1;
		if (front == rear)  {
			temp = front.data;
		}
		else {
			temp = rear.data;
		}
       return temp;
	}
	
	
	
	public void display() {
		if (rear == null) return;
		Node trav = front;
		
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println("null");
		
	}
	
	public int getRare() {
		return rear.data;
	}

	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
}
