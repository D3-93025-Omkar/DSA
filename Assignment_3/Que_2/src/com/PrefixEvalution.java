package com;

import java.util.Stack;

public class PrefixEvalution {
	public static void main(String[] args) {
//		String str = "+ * 25 2 $ 3 2";
		
		String str = "- $ 5 3 * 4 2";
		
//		String str = "- + + 4 / * 5 6 3 9 7";
		
		String[] strArr = str.split(" ");
		
		 
		int result = prefixEvalution(strArr);
		System.out.println("result : " + result);
		
	}

	private static int prefixEvalution(String[] arr) {
	
		Stack<Integer> s = new Stack<>();
		
		for (int i = arr.length - 1; i >= 0; i--) {
		    if (Character.isDigit(arr[i].charAt(0))) {
		    	s.push(Integer.parseInt(arr[i]));
		    }
		    else {
		    	int op1 = s.pop();
		    	int op2 = s.pop();
		    	
		    	int res = calculate(op1, arr[i], op2);
		    
		    	s.push(res);
		    }
		}
		
		if (!s.isEmpty()) return s.pop();
		return 0;
	}

	private static int calculate(int op1, String str, int op2) {
		
		switch (str) {
		case "+" : return op1 + op2;
		case "-" : return op1 - op2;
		case "*" : return op1 * op2;
		case "/" : return op1 / op2;
		case "%" : return op1 % op2;
		case "$" : return (int)Math.pow(op1, op2);
 		
		}
		return 0;
	}

}
