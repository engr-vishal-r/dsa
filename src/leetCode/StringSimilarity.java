package leetCode;

import java.util.*;

public class StringSimilarity {
	public static void main(String[] args) {
		String[] S = { "hello", "he", "yellow" };
		String Q = "hell";

		String mostSimilar = findMostSimilar(S, Q);
		System.out.println("Most similar string: " + mostSimilar);
	}

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

	public static int calculateSimilarity(String str1, String str2) {
		// Convert strings to sets of bigrams
		Set<String> set1 = getBigrams(str1);
		Set<String> set2 = getBigrams(str2);

		// Find the intersection of the two sets (common bigrams)
		Set<String> commonBigrams = new HashSet<>(set1);
		commonBigrams.retainAll(set2);

		return commonBigrams.size();
	}

	public static Set<String> getBigrams(String str) {
		Set<String> bigrams = new HashSet<>();
		for (int i = 0; i < str.length() - 1; i++) {
			bigrams.add(str.substring(i, i + 2));
		}
		return bigrams;
	}

}