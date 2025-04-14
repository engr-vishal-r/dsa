package sorting;

public class MergeInNonDecreasingOrder {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1; // index for nums1
		int j = n - 1; // index for nums2
		int k = m + n - 1; // index for the merged array nums1

		// Loop until both nums1 and nums2 have elements remaining
		while (i >= 0 && j >= 0) {
			// Compare the elements at the current positions in nums1 and nums2
			if (nums1[i] > nums2[j]) {
				// If element in nums1 is greater, copy it to the end of nums1
				nums1[k--] = nums1[i--];
			} else {
				// If element in nums2 is greater or equal, copy it to the end of nums1
				nums1[k--] = nums2[j--];
			}
		}

		// If there are remaining elements in nums2, copy them to nums1
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		MergeInNonDecreasingOrder merger = new MergeInNonDecreasingOrder();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merger.merge(nums1, m, nums2, n);

		// Print the merged array nums1
		for (int num : nums1) {
			System.out.print(num + " ");

		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("time taken : " + (endTime - startTime));
	}
}
