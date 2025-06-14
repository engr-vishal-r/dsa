package linearSearch;

public class PrintSecondMaxElement {

	public static void main(String[] args) {

		PrintSecondMaxElement psme = new PrintSecondMaxElement();

		int arr[] = { 50, 30, 40, 10, 15 };

		int n = arr.length;

		psme.findAndPrintSecMax(arr, n);
	}

	public static void findAndPrintSecMax(int arr[], int n) {

		int max_ele = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max_ele < arr[i]) {
				second_max = max_ele;
				max_ele = arr[i];
			} else if (arr[i] > second_max && arr[i] != max_ele) {
				second_max = arr[i];
			}

		}
		System.out.println(second_max);

	}

}
