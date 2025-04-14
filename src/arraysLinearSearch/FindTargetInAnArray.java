package arraysLinearSearch;

public class FindTargetInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTargetInAnArray fta = new FindTargetInAnArray();
		int arr[] = { 5, 2, 11, 15 };
		int target = 13;
		int n = arr.length;

		fta.findAndPrintTargetInd(arr, target, n);

	}

	public static void findAndPrintTargetInd(int arr[], int target, int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

	}

}
