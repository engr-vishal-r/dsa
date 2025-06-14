package leetCode;

import java.util.*;

public class StringSimilarity {
	public static void main(String[] args) {
		String[] S = { "hello", "yellow", "hell", };
		String Q = "hell";

		String mostSimilar = findMostSimilar(S, Q);
		System.out.println("Most similar string: " + mostSimilar);
	}

	/**
	 * Loops through each string in strings.
	 * Calculates similarity using calculateSimilarity.
	 * Tracks the string with the highest similarity.
	 */
	public static String findMostSimilar(String[] strings, String query) {
		int maxSimilarity = 0;
		String mostSimilar = "";

		for (String str : strings) {
			int similarity = calculateSimilarity(str, query);
			if (similarity > maxSimilarity) {
				maxSimilarity = similarity;
				mostSimilar = str;
			}
		}

		return mostSimilar;
	}

	/**
	 * Converts both strings into sets of bigrams using getBigrams.
	 * Calculates the intersection of the two sets (shared bigrams).
	 * Returns the number of common bigrams.
	 */
	public static int calculateSimilarity(String str1, String str2) {
		// Convert strings to sets of bigrams
		Set<String> set1 = getBigrams(str1);
		Set<String> set2 = getBigrams(str2);

		// Find the intersection of the two sets (common bigrams)
		Set<String> commonBigrams = new HashSet<>(set1);
		commonBigrams.retainAll(set2);

		return commonBigrams.size();
	}

	/**
	 * Extracts all bigrams from a string using a sliding window of size 2.
	 * Returns a set of unique bigrams.
	 */
	public static Set<String> getBigrams(String str) {
		Set<String> bigrams = new HashSet<>();
		for (int i = 0; i < str.length() - 1; i++) {
			bigrams.add(str.substring(i, i + 2));
		}
		return bigrams;

	}

}