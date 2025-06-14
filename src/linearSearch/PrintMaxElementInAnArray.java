package linearSearch;

public class PrintMaxElementInAnArray {

	public static void main(String[] args) {

		PrintMaxElementInAnArray pmea = new PrintMaxElementInAnArray();

		int arr[] = { 30, 20, 50, 10 };
		int n = arr.length;
		pmea.printMaxEle(arr, n);

	}

	public static void printMaxEle(int arr[], int n) {

		int max_ele = Integer.MIN_VALUE;

		for (int i = 0; i <arr.length; i++) {
			if (arr[i] > max_ele) {
				max_ele = arr[i];

			}
		}
		System.out.println("Maximum Element in the Array : " + max_ele);

	}
}
