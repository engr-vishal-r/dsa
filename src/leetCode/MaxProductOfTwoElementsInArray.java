package leetCode;

import java.util.Arrays;

public class MaxProductOfTwoElementsInArray {

	public static void main(String[] args) {
		int[] nums = { -3, 4, 5, -1 };

		Arrays.sort(nums);  // sorts in ascending order

		int n = nums.length;

		// Two candidates for max product:
		// 1. Product of two largest numbers
		int prod1 = nums[n - 1] * nums[n - 2];

		// 2. Product of two smallest (could both be negative)
		int prod2 = nums[0] * nums[1];

		int maxProduct = Math.max(prod1, prod2);

		System.out.println("Max Product: " + maxProduct);
	}
}