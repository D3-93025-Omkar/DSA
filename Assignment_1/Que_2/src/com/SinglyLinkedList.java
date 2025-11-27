package com;

public class SinglyLinkedList {
   
	static class Node {
		private int data;
		private Node next;
		
		public Node(int value) {
           data = value;
		}
	}
	
	private Node head;
	
	public SinglyLinkedList() {
       head = null;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
        newNode.next = head;
		head = newNode;
	}

	public void addLast(int value) {
		Node newNode = new Node (value);
		
		if (head == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
	}
	
	public void inserValue(int value) {
		if (head == null) {
			addFirst(value);
			return;
		}
		
		if (head.data <= value) {
			addLast(value);
		}
		else {
			addFirst(value);
		}
	}
	
	public void insertElement(int value) {
		Node trav = head;
		Node newNode = new Node(value);
		if (head == null) {
			addLast(value);
			return;
		}
		
		if (head.data > value) {
			addFirst(value);
			return;
		}
		if (head.next == null){
			if (head.data < value) addLast(value);
			else addFirst(value);
			return;
		}
		
		boolean flag = false;
		while (trav.next != null) {
			if (trav.data <= value && value <= trav.next.data) {
				flag = true;
				newNode.next = trav.next;
				trav.next = newNode;
				break;
			}
			trav = trav.next;
		}
		
		if (flag == false) {
			System.out.println("hello");
			trav.next = newNode;
		}
		
		
	}
	
	
	
	public void display() {
		Node trav = head;
		
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println("Null");
	}
}
