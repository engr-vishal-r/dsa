package recursion;

public class SearchElementRecursion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 2, 7,9, 11, 15, 50, 55, 200, 210 };
		int target = 15;

		int result = findAndPrintTargetInd(arr, target, 0, arr.length - 1);
		System.out.println(result);

	}

	public static int findAndPrintTargetInd(int arr[], int target, int left, int right) {

		if (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				return findAndPrintTargetInd(arr, target, mid+1, right);
			} else
				return findAndPrintTargetInd(arr, target, left, mid-1);
		}
		return -1;

	}
}
