package leetCode;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 2, 4 };
		int[] arr = new int[nums.length + 1];
		for (int i : nums) {
			arr[i]++;

		}
		int missing = 0;
		int repeat = 0;
		for (int curr = 1; curr < arr.length; curr++) {
			if (arr[curr] == 2) {
				repeat = curr;
			}
			if (arr[curr] == 0) {
				missing = curr;
			}
		}
		int result[] = new int[] { repeat, missing };
		System.out.println(result[0] + " " + result[1]);
	}

}
