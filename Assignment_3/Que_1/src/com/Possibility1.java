package com;

import java.util.Stack;

public class Possibility1 {

	public static void main(String[] args) {

        test("madar");
        test("level");
        test("noon");
        
        test("racecar");
        test("hello");
    }
	
	static void test(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != s.pop()) {
                System.out.println(str + " → Not Palindrome");
                return;
            }
        }

        System.out.println(str + " → Palindrome");
    }
}
