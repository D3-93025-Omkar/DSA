package com.sunbeam;

public class Tester {
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addList(10);
//		ll.addList(20);
//		ll.addList(30);
//		ll.addList(40);
//		ll.addList(50);
		
		ll.display();
		
//		ll.insertAfter(50, 55);
		ll.insertBefore(10, 33);
//		ll.insertBefore(50, 96);
		
		ll.display();
	}

}
