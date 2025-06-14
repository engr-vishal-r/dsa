package linearSearch;

public class LeadersInArray {

	/*
	 * An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
	 */
	public static void main(String[] args) {
		LeadersInArray lia = new LeadersInArray();

		int arr[] = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;

		lia.printLeader(arr, n);
	}

	void printLeader(int arr[], int size) {
		int max_from_right = arr[size - 1];
		/* Rightmost element is always leader */
		System.out.print(max_from_right + " ");

		for (int i = size - 2; i >= 0; i--) {
		
			if (arr[i] > max_from_right) {
				max_from_right = arr[i];
				System.out.print(max_from_right + " ");
			}
		}
	}
}
