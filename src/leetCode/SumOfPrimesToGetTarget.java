package leetCode;

public class SumOfPrimesToGetTarget {
	public static void main(String[] args) {
		int input = 777;
		int sumOfPrimes = sumOfPrimeDigits(input);
		System.out.println("Output: " + sumOfPrimes);
	}

	/**
	 * Extracts each digit of the number using % 10.
	 * Checks if that digit is prime using the isPrime() method.
	 * If it is prime, adds it to the sum.
	 * Removes the last digit using /= 10 and repeats.`
	 *
	 * For 997:
	 * Last digit: 7 → Prime → Add 7
	 * Next digit: 9 → Not prime
	 * Next digit: 9 → Not prime
	 * Final Sum = 7
	 *
	 */
	public static int sumOfPrimeDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			if (isPrime(digit)) {
				sum += digit;
			}
			number /= 10;
		}
		return sum;
	}

	/**
	 * Digits ≤ 1 → Not prime
	 * Loops from 2 to √num and checks divisibility
	 * If divisible by any number in that range → Not prime
	 * For digits (0–9), only 2, 3, 5, 7 will return true.

	 */

	public static boolean isPrime(int num) {
		if (num <= 1) {			
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
				
			}
			
		}
		return true;
	}
}