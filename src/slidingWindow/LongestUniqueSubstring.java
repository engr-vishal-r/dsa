package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcdabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}

