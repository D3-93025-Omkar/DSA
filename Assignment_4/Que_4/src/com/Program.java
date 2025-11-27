package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program {
	
   public static void main(String[] args) {
	  int [] arr = {4,4,6,7,7,7};
	   int res = modOfArray(arr);
	   System.out.println("mod of arr : " + res);
}

   private static int modOfArray(int[] arr) {
         Map<Integer, Integer> map = new HashMap<>();
         
         for (int ele : arr) {
        	 map.put(ele, map.getOrDefault(ele, 0) + 1);
         }
         int mod = 0;
         int max = 0;
         
         
         for (Entry<Integer, Integer> e : map.entrySet()){
        	 if (e.getValue() > max) {
        		 max = e.getValue();
        		 mod = e.getKey();
        	 }
         }
         
         
         	
         
         return mod;
   }
}
