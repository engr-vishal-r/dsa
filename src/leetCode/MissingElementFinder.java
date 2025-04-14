package leetCode;

public class MissingElementFinder {
	public static void main(String[] args) {
        int[] array = { 1,3, 4, 5, 6}; 
        int missingElement = findMissingElement(array);
        System.out.println("The missing element is: " + missingElement);
    }

    public static int findMissingElement(int[] array) {
        int n = array.length + 1; // Since there is one missing element, the array length should be n-1
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0; // Sum of elements in the array

        // Calculate the sum of elements in the array
        for (int num : array) {
            arraySum += num;
        }

        // The missing element can be found by subtracting the sum of the array from the expected sum
        return totalSum - arraySum;
    }
}