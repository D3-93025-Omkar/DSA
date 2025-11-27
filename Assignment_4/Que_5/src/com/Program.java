package com;

public class Program {

	public static void main(String[] args) {
		int [] arr = { 30, 20, 10, -10, -20 };
		int key = -10;
		int idx = searchElement(arr, key);
		System.out.println("Element found at : " + idx);
	}

	private static int searchElement(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		 while (s <= e) {
			 int mid = s + (e - s) / 2;
			 if (arr[mid] == key) {
				 return mid;
			 }
			 else if (arr[mid] > key) {
				 s = mid + 1;
			 }
			 else {
				 e = mid - 1;
			 }
		 }
		 return -1;
	}
}
