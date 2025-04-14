package leetCode;

import java.util.Arrays;

public class MinProductOfTwoElements {

	// Function to calculate minimum product of pair
	static int printMinimumProduct(int a[]) {

		// Sort the array
		Arrays.sort(a);

		// Returning the product of first two numbers
		return a[0] * a[1];
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int a[] = { 11, 8, 5, 7, 5, 100 };
		System.out.println(printMinimumProduct(a));
	}
}