package arraysLinearSearch;

public class SearchElementBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 2, 7, 9, 11, 15, 50, 55, 200, 210 };
		int target = 15;

		int result = findAndPrintTargetInd(arr, target);
		System.out.println(result);

	}

	public static int findAndPrintTargetInd(int arr[], int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;

	}
}
