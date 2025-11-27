package com;

import java.util.HashMap;
import java.util.Map;

public class Program {
	
    public static void main(String[] args) {
    	String str = "apple banana apple orange banana apple";
		countOccranceOfWordInGivenLine(str);
	}

	private static void countOccranceOfWordInGivenLine(String str) {
		
		String [] strA = str.split(" ");
		Map<String, Integer> mp = new HashMap<>();
		
		for (int i = 0; i < strA.length; i++) {
			mp.put(strA[i], mp.getOrDefault(strA[i], 0) + 1);
		}
		System.out.println(mp);
	}
}
