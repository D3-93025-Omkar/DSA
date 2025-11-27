package com;

public class Program {

	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 20, 50 };
        int key = 20;
		
		int res = findLastOccurunce(arr, key);
		System.out.println("Last occurance of ele : " + res);
	}

	private static int findLastOccurunce(int [] arr, int key) {
		int idx  = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				idx = i;
			}
		}
		
		return idx;
	}
}
