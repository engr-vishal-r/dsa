package slidingWindow;

public class FindLengthOfLongestSubArray {
	
	// The longest subarray we found was [4, 2, 1, 1] which means the answer is 4.
	public int findLength(int[] nums, int k) {
		int left = 0;
		int curr = 0; // curr is the current sum of the window
		int ans = 0;

		for (int right = 0; right < nums.length; right++) {
			curr += nums[right]; // Expand the window by adding current number
			// Shrink the window from the left if the sum exceeds k
			while (curr > k) {
				curr -= nums[left];
				left++;
			}

			ans = Math.max(ans, right - left + 1);
		}

		return ans;
	}

	public static void main(String args[]) {

		int [] nums = {3,1,2,7,4,2,1,1,5};
		int k =8;
		FindLengthOfLongestSubArray sw = new FindLengthOfLongestSubArray();
		int result = sw.findLength( nums,  k);
		System.out.println(result);
		
		
	}
  }
