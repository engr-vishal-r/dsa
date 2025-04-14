package dyanamicProgramming;

public class LongestCommonIntSubsequence {
	public static int lcs(int[] int1, int[] int2) {
		int m = int1.length;
		int n = int2.length;

		// Create a DP table to store the lengths of LCS
		int[][] dp = new int[m + 1][n + 1];

		// Fill the DP table using tabulation method
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (int1[i - 1] == int2[j - 1]) {
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
		int[] int1 = { 0, 1, 3, 4 };
		int[] int2 = { 1, 4 };

		int result = lcs(int1, int2);
		System.out.println("Length of Longest Common Subsequence: " + result);
	}
}
