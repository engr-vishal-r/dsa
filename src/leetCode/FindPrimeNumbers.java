package leetCode;

import java.util.*;

public class FindPrimeNumbers {

    public static void main(String[] args) {
        int n= 1000;
      List<Integer> findPrimes = sieve(n);
      System.out.println(findPrimes);
    }
    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n+1];  //Creates a boolean array to track whether each number is prime.
        Arrays.fill(isPrime, true); //Initially assumes all numbers are prime (true).
        isPrime[0] = isPrime[1] = false; //0 and 1 are not prime, so they’re set to false.

        /**
         * Core Algorithm: Sieve of Eratosthenes
         * For each number i from 2 up to √n:
         * If i is still marked as prime,
         * Mark all multiples of i as not prime.
         * For example, if i = 3, it marks 6, 9, 12... as not prime.
         *
         */
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }

        /**
         * Collect the Prime Numbers
         * Collects all indices still marked true into a list — these are the prime numbers.
         */
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }

        return primes;
    }

}
