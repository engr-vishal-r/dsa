package leetCode;

public class MaxProductOfTwoElementsInArray {

	public static void main(String[] args) {
		int nums[] = { -3, 4, -5, -1 };
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		// Convert array to positive
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.abs(nums[i]);
		}

		for (int num : nums) {
			if (num > max1) {
				max2 = max1;
				max1 = num;

			} else if (num > max2) {
				max2 = num;
			}
		}

		int maxProduct = (max1 - 1) * (max2 - 1);

		System.out.println(maxProduct);
	}

}
