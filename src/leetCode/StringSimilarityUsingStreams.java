package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class StringSimilarityUsingStreams {
    public static void main(String[] args) {
        String[] S = { "hello", "he", "yellow" };
        String Q = "hell";

        String mostSimilar = Arrays.stream(S)
                .max(Comparator.comparingInt(s -> similarity(s, Q)))
                .orElse("");

        System.out.println("Most similar string: " + mostSimilar);
    }

    private static int similarity(String a, String b) {
        return bigrams(a).stream()
                .filter(bigrams(b)::contains)
                .mapToInt(x -> 1).sum();
    }

    private static Set<String> bigrams(String s) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++)
            result.add(s.substring(i, i + 2));
        return result;
    }
}