package linearSearch;

public class PrintMinElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintMinElementInAnArray pmea = new PrintMinElementInAnArray();

		int arr[] = { 30, 20,-50, 10 };
		int n = arr.length;
		pmea.printMinEle(arr, n);

	}

	public static void printMinEle(int arr[], int n) {

		int min_ele = arr[n-1];

		for (int i = n-2; i >=0; i--) {
			if (arr[i] < min_ele) {
				min_ele = arr[i];

			}
		}
		System.out.println("Maximum Element in the Array : " + min_ele);

	}
}

