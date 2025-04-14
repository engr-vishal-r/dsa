package leetCode;

import java.util.*;

public class GroupPalindromes {

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    //Method to group palindromes and non-palindromes
    public static List<List<String>> groupPalindromes(String[] words) {
        List<String> palindromes = new ArrayList<>();
        List<String> nonPalindromes = new ArrayList<>();

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            } else {
                nonPalindromes.add(word);
            }
        }

        return Arrays.asList(palindromes, nonPalindromes);
    }

    public static void main(String[] args) {
        String[] input = {"madam", "racecar", "apple", "noon", "java", "level", "code"};
        List<List<String>> grouped = groupPalindromes(input);

        System.out.println("Palindromes: " + grouped.get(0));
        System.out.println("Non-Palindromes: " + grouped.get(1));
    }
}
