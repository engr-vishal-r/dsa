package linearSearch;

public class PrintSubSets {

	public static void main(String args[]) {

		int arr[] = { 3, 5, 6, 7 };

		for (int len = 1; len <= arr.length; len++) {
			for (int start = 0; start <= arr.length - len; start++) {
				int end = start + len;
				getSubsets(arr, start, end);
			}
		}
	}

	public static void getSubsets(int arr[], int start, int end) {

		for (int i = start; i < end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
