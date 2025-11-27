package com;

public class Queue {

	int [] arr;
	int counter;
	int SIZE;
	int front;
	int rear;
	
	public Queue(int size) {
		SIZE = size;
		counter = 0;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("Queue is Full !!");
		}
		else {
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
			counter++;
		}
	}
	
	public int pop() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
		}
		else {
			 counter--;
			 front = (front + 1) % SIZE;
			 temp = arr[front];
			 
			 if (front  == rear) {
				 front = rear = -1;
			 }
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty !!");
		}
		else {
			 temp = arr[(front + 1) % SIZE];
			 
			 if (front  == rear) {
				 front = rear = -1;
			 }
		}
		return temp;
	}
	
   public boolean isEmpty() {
	   return counter == 0;
   }
	
   public boolean isFull() {
	   return counter == SIZE;
   }
}
