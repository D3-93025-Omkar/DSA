package com;

public class Program {

	public static void main(String[] args) {
		
		int [] arr = {-5, 10, -5, 20, -5, 30};
		int key = -5;
	    int n = 2;
		
		int res = nthOccuranceOfEle(arr, n, key);
		System.out.println("nth occurance of ele at index : " + res);
	}
	
	public static int nthOccuranceOfEle(int [] arr, int n, int key) {
		int idx = -1;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				cnt++;
				if (cnt == n) {
					return i;
				}
			}
		}
		
		return idx;
	}
}
