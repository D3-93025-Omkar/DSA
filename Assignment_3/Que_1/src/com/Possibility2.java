package com;

import java.util.Stack;

public class Possibility2 {

	public static void main(String[] args) {

        test("madar");
        test("level");
        test("noon");
        
        test("racecar");
        test("hello");
    }

	private static void test(String string) {
		
		int n = string.length() / 2;
		Stack<Character> s = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			 s.push(string.charAt(i));
		}
		
		if (string.length() % 2 == 0) n = n;
		else n = n + 1;
		
		for (int i = n; i < string.length(); i++) {
			if (string.charAt(i) != s.pop()) {
				System.out.println("this is not palindrom !!");
				return;
			}
		}
		
		System.out.println("this is palindrom !!");
	}
}
