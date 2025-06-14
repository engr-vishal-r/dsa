package linearSearch;

public class PrintSecondMinInArray {

	public static void main(String[] args) {

		PrintSecondMinInArray psmia = new PrintSecondMinInArray();

		int arr[] = { 30, 7, 10, 5 };

		int n = arr.length;

		psmia.findAndPrintSecMin(arr, n);
	}

	public static void findAndPrintSecMin(int arr[], int n) {

		int min_ele = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (min_ele > arr[i]) {
				second_min = min_ele;
				min_ele = arr[i];
			} else if (arr[i] < second_min && arr[i] != min_ele) {
				second_min = arr[i];
			}
		}

		System.out.println(min_ele);
		System.out.println(second_min);
	}

}
