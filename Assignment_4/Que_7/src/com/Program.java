package com;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		int [] arr = { 10, 20, 15, 3, 4, 4, 1 };
		int key = 4;
		int res = rankOfEle(arr, key);
		System.out.println("Rank of given ele : " + res);
	}

	private static int rankOfEle(int[] arr, int key) {
		int rank = 0;
		for (int e : arr) {
			if (e <= key) {
				rank++;
			}
		}
		return rank;
	}
}
