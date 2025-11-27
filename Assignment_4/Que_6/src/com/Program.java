package com;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		int res = firstNonReapeatingEle(arr);
		System.out.println("first not reapeating ele : " + res);
		
	}

	private static int firstNonReapeatingEle(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int e : arr) {
			map.put(e, map.getOrDefault(e, 0) + 1);
		}
		for (int e : arr) {
		   if (map.get(e) == 1) {
			   return e;
		   }
		}
		return  0;
	}
}
