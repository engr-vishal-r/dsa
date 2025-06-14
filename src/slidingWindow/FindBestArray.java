package slidingWindow;


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

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int k = 4;
		FindBestArray sw = new FindBestArray();
		int result = sw.findBestSubarray(nums, k);
		System.out.println(result);

	}
}
