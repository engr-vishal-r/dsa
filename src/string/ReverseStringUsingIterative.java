package string;

public class ReverseStringUsingIterative {

	public static void main(String[] args) {
		String input = "Hello, World!";
		 long startTime = System.nanoTime();
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);
	        long endTime = System.nanoTime();
	        long timeTaken = endTime -startTime;
	        System.out.println(timeTaken);
	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			// Swap characters at left and right indices
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			// Move pointers towards the center
			left++;
			right--;
		}

		// Convert char array back to string
		return new String(charArray);
	}
}