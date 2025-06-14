package leetCode;

public class MajorityElementInAnArray {

	/**
	 * Boyer-Moore Voting Algorithm
	 * This array has 5 elements.
	 * A majority element would need to appear at least 3 times.
	 */
	public static void main(String[] args) {

		int nums[] = {3, 3, 3,4, 2,3};

		int count = 0;
		int candidate = 0;
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}
		// Step 2: Verify candidate
		int freq = 0;
		for (int num : nums) {
			if (num == candidate) freq++;
		}

		if (freq > nums.length / 2) {
			System.out.println("Majority element: " + candidate);
		} else {
			System.out.println("No majority element found.");
		}
	}
}

