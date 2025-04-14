package dyanamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

	// The Longest Increasing Subsequence (LIS) problem is to find the length of the
	// longest subsequence of a given sequence
	// such that all elements of the subsequence are sorted in increasing order.
	// For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6
	// and LIS is {10, 22, 33, 50, 60, 80}.

	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int max = 0;

		// Initialize LIS values for all indexes
		for (int i = 0; i < n; i++)
			lis[i] = 1;

		// Compute optimized LIS values in bottom-up manner
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}

		// Pick maximum of all LIS values
		for (int i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of LIS is " + lis(arr, n));
	}
}