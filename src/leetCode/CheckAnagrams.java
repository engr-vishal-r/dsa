package leetCode;

public class CheckAnagrams {

    static boolean isAnagram(String s1, String s2) {
        // Normalize case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Early exit if lengths differ
        if (s1.length() != s2.length())
            return false;

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++; // Increment for s1
            freq[s2.charAt(i) - 'a']--; // Decrement for s2
        }

        // Check if all counts are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "vijay";
        String s2 = "jayvi";

        if (isAnagram(s1, s2) == true) {
            System.out.println("Given Strings " + s1 + " and " + s2 + " are Anagram");
        } else {
            System.out.println("Given Strings " + s1 + " and " + s2 + " are not Anagram");
        }

    }
}
