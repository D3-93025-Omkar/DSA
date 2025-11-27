package com;

public class List {

	public static void main(String[] args) {
		CircularLinkedList ll = new CircularLinkedList();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addFirst(30);
//		ll.addFirst(40);
		
		ll.addLast(44);
		ll.addLast(9600);
		ll.addLast(98);
		ll.addLast(47);
		ll.addLast(87);
//		
//		ll.display();
//		System.out.println();
//		ll.deleteFirst();
//		ll.display();
		
		ll.display();
		System.out.println();
//		ll.deleteLast();
//		ll.display();
		
//		ll.insertPosition(10, 89);
		
		ll.deletePostion(3);
		ll.display();
	}
}
