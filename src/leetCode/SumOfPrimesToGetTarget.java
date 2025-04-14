package leetCode;

public class SumOfPrimesToGetTarget {
	public static void main(String[] args) {
		int input = 997;
		int sumOfPrimes = sumOfPrimeDigits(input);
		System.out.println("Output: " + sumOfPrimes);
	}

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