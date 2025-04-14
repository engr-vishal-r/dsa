package sorting;

public class InsertionSort {

	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int size = arr.length;

		System.out.println("Before sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < size; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println();
		System.out.println("After sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");

		}
	}
}
