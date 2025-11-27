package com;

import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static Object choseDataStructure() {
		System.out.println("---------------------------------");
		System.out.println("1. STACK");
		System.out.println("2. QUEUE");
		System.out.println("---------------------------------");
		System.out.print("Enter your choice : ");
		int c = sc.nextInt();
		
		if (c == 0) System.exit(0);
		if (c == 1) return new StackLL();
		if (c == 2) return new Queue();
		return null;
	}
	
	public static void main(String[] args) {

    Object st = choseDataStructure();

    StackLL stack = null;
    Queue queue = null;

    if (st instanceof StackLL) {
        stack = (StackLL) st;
    } else if (st instanceof Queue) {
        queue = (Queue) st;
    } else {
        return;
    }

    while (true) {
        System.out.print("1. Push \n2. Pop \n3. Peek \n4. Exit \n");
        System.out.print("Enter Choice : ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.print("Enter Data : ");
                int data = sc.nextInt();
                if (stack != null) stack.push(data);
                if (queue != null) queue.push(data);
                break;

            case 2:
                if (stack != null) System.out.println("Popped Value : " + stack.pop());
                if (queue != null) System.out.println("Popped Value : " + queue.pop());
                break;

            case 3:
                if (stack != null) System.out.println("Peek Value : " + stack.peek());
                if (queue != null) System.out.println("Peek Value : " + queue.peek());
                break;

            case 4:
                System.exit(0);
        }
    }
}

}
