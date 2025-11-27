package com;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Enter the  value of array");
		for (int  i = 0; i < n; i++) {
		     arr[i] = sc.nextInt();
		}
		
	    Stack st = new Stack(n);
	    
	    for (int i = 0; i < n; i++) {
			 System.out.print(arr[i] + " ");
		}
	    
	    System.out.println();
	    System.out.println("After Reversing!!");
	    
		for (int i = 0; i < n; i++) {
			st.push(arr[i]);
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = st.pop();
		}
		
		for (int i = 0; i < n; i++) {
			 System.out.print(arr[i] + " ");
		}
	}

}
