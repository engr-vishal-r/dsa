package leetCode;

public class PalindromeCheck {

	/**
	 *  
	 * 
	 * We first check if the input number is negative because negative numbers can't
	 * be palindromes. We create two variables, original to store the original
	 * number and reversed to store the reversed number. We iterate through the
	 * digits of the number x from right to left by repeatedly dividing it by 10 and
	 * accumulating the digits in reversed. Finally, we compare the original number
	 * with the reversed number to determine if it's a palindrome.
	 */

	public static boolean isPalindrome(int x) {
		int original = x;
		int reversed = 0;
		if (x < 0) {
			return false; //Negative numbers can't be palindromes
		}
		while (x > 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return original == reversed;
	}

	public static void main(String[] args) {
		int x = 1441;
		boolean result = isPalindrome(x);
		if(result==true) {
			System.out.println("Given Number " +  x + " is palindrome");
		}else {
			System.out.println("Given Number " +  x + " is not palindrome");
		}

	}
}
