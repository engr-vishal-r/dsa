package sorting;

public class BubbleSort {

	//Bubble sort takes O(n^2) time complexity to solve the problem.
	//selection sort reduces some efforts on swapping the index when compared to bubble sort
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int size = arr.length;
		int temp = 0;

		System.out.println("Before sorting : ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("After Sorting :");
		for (int num : arr) {

			System.out.print(num + " ");
		}
	}

}
