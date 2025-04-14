package leetCode;

public class ReverseAndAddToGetPalindrome {
	public static void main(String[] args) {
		int input = 29;
		int result = reverseAndAdd(input);
		System.out.println("Output: " + result);
	}

	public static int reverseAndAdd(int number) {
		int repetitions = 0;
		while (repetitions < 5) {
			int reversed = reverseNumber(number);
			int sum = number + reversed;
			if (isPalindrome(sum))
				return sum;
			number = sum;
			repetitions++;
		}
		return -1; // Indicates that the number of repetitions exceeded 5 without forming a
					// palindrome
	}

	public static int reverseNumber(int number) {
		int reversed = 0;
		while (number > 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}

	public static boolean isPalindrome(int number) {
		return number == reverseNumber(number);
	}
}