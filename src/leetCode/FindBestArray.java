package leetCode;

import slidingWindow.SlidingWindow;

public class FindBestArray {
	public int findBestSubarray(int[] nums, int k) {
		int curr = 0;
		for (int i = 0; i < k; i++) {
			curr += nums[i];
		}

		int ans = curr;
		for (int i = k; i < nums.length; i++) {
			curr += nums[i] - nums[i - k];
			ans = Math.max(ans, curr);
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, -1, 4, 12, -8, 5, 6 };
		int k = 4;
		SlidingWindow sw = new SlidingWindow();
		int result = sw.findLength(nums, k);
		System.out.println(result);

	}
}
