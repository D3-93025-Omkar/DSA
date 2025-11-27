package com;

public class Possibility3 {
	public static void main(String[] args) {

        test("madar");
        test("level");
        test("noon");
        
        test("racecar");
        test("hello");
    }

	private static void test(String str) {
		int s = 0, e = str.length() - 1;
		
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				System.out.println("this is not palindrom !!");
				return;
			}
			s++;
			e--	;
		}
		System.out.println("this is palindrom !!");
		
	}

}
