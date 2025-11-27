package com;

public class Stack {
	private int top;
	private int [] arr;
	private int SIZE;
	
	public Stack(int n) {
		SIZE = n;
		top = -1;
		arr = new int[SIZE];
	}
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("Statck is  full !!");
		}
		else {
			top++;
			arr[top] = value;
		}
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is Empty !!");
		}
		else {
			temp = arr[top];
		}
		return temp;
	}

	
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is Empty !!");
		}
		else {
			temp = arr[top];
			top--;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
    public boolean isFull() {
		return top == SIZE - 1;
	}

}
