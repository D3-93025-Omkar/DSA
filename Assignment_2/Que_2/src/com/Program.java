package com;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Queue q = new Queue(4);

	    while (true) {
	    	System.out.print("1. Push \n 2. Pop \n 3. Peak \n 4. Exit \n ");
	    	System.out.print("Enter Choice : ");
	    	Scanner sc1 = new Scanner(System.in);
	    	int ch = sc1.nextInt();
	    	
	    	switch (ch) {
	    	
	    	case 1 : 
	    		     System.out.print("Enter Data : ");
	    		     int data = sc1.nextInt();
	    		     q.push(data);
	    		     break;
	    		     
	    		     
	    	case 2 : 
	    		     System.out.println("Poped Value : " + q.pop());
	    		     break;
	    		    
	    	case 3 : 
	    		    System.out.println("Peek Value : " + q.peek());
	    		    break;
	    		    
	    	case 4 :
	    		     System.exit(0);
	    		     break;
	    		     
	    		    
	    	}
	    }
	}

}
