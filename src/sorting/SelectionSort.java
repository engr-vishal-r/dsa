package sorting;

public class SelectionSort {

	// selection sort takes O(n^2) time complexity to solve the problem.
	// selection sort reduces some efforts on swapping the index when compared to
	// bubble sort
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int size = arr.length;
		int temp = 0;
		int minIndex = -1;

		System.out.println("Before sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
			}
		System.out.println();
		System.out.println("After sorting : ");
		for (int num : arr) {
			System.out.print(num + " ");

		}
	}
}
