package com.bingo;

import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		// Initialize the array
		int[] array = { 5, 10, 15, 20, 25 };
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		// Accept two numbers from the user
		System.out.print("Enter the first number (between 1 and 40): ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number (between 1 and 40): ");
		int num2 = scanner.nextInt();
		// Check if both numbers are in the array
		boolean foundNum1 = false;
		boolean foundNum2 = false;
		for (int i = 0; i < array.length; i++) {
			if (num1 == array[i]) {
				foundNum1 = true;
			}
			if (num2 == array[i]) {
				foundNum2 = true;
			}
		}
		// Display the result
		if (foundNum1 && foundNum2) {
			System.out.println("Bingo");
		} else {
			System.out.println("Not found ");
		}
		// Close the scanner
		scanner.close();
	}
}
