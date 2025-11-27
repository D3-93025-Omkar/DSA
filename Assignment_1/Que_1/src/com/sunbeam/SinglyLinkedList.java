package com.sunbeam;



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
      
     public void addList(int value) {
    	 Node newNode = new Node(value);
    	 Node trav = head;
    	 
    	 if (head == null) {
    	    newNode.next = head;
    	    head = newNode;
    	    return;
    	 }
    	 while (trav.next != null) {
    		 trav = trav.next;
    	 }
    	 trav.next = newNode;
    	 
     }
     
     public void insertAfter(int data1, int data2) {
    	 Node trav = head;
    	 Node newNode = new Node(data2);
    	 
    	 while (trav != null) {
    		 if (trav.data == data1) {
    			 newNode.next = trav.next;
    			 trav.next = newNode;
    			 break;
    		 }
    		 trav = trav.next;
    	 }
     }
     
     public void insertBefore(int data1, int data2) {
    	 Node trav = head;
    	 Node newNode = new Node(data2);
  	 
    	 if (trav.data == data1) {
    		 newNode.next = trav;
    		 head = newNode;
    		 return;
    	 }
    	 
    	 while (trav.next != null) {
    		 if (trav.next.data == data1) {
    			 newNode.next = trav.next;
    			 trav.next = newNode;
    			 break;
    		 }
    		 trav = trav.next;
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
