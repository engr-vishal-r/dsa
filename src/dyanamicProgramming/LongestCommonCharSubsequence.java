package dyanamicProgramming;

public class LongestCommonCharSubsequence {
	public static int lcs(char[] s1, char[] s2) {
		int m = s1.length;
		int n = s2.length;

		// Create a DP table to store the lengths of LCS
		int[][] dp = new int[m + 1][n + 1];

		// Fill the DP table using tabulation method
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		// Length of LCS will be at the bottom-right cell
		return dp[m][n];
	}

	public static void main(String[] args) {
		char[] str1 = { 'a', 'b', 'c', 'd' };
		char[] str2 = { 'b', 'd' };

		int result = lcs(str1, str2);
		System.out.println("Length of Longest Common Subsequence: " + result);
	}
}
