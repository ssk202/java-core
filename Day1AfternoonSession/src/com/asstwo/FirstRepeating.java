package com.asstwo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FirstRepeating  {
	    public static int FirstRepeatingIndex(int[] arr) {
	      Set<Integer> seen = new HashSet<>();
	        for (int i = 0; i < arr.length; i++) {
	            if (seen.contains(arr[i])) {
	                return i + 1;
	            }
	            seen.add(arr[i]);
	        }
	        return -1;
	    }
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        int result = FirstRepeatingIndex(arr);
	        if (result != -1) {
	            System.out.println("Index of the first repeating element: " + result);
	        } else {
	            System.out.println("No repeating elements found.");
	        }
	    }
}
