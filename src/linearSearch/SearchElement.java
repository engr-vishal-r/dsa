package linearSearch;

//Java program to implement linear
//search in unsorted arrays
public class SearchElement {
	// Function to implement
	// search operation
	static int findElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		// If the key is not found
		return -1;
	}

	// Driver's Code
	public static void main(String args[]) {
		int arr[] = {  5, 2, 11, 55, 50, 200, 201, 15};
		int n = arr.length;

		// Using a last element as search element
		int key = 15;

		// Function call
		int position = findElement(arr, n, key);

		if (position == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element Found at Position: " + (position + 1));
	}
}