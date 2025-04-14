package dyanamicProgramming;

public class LongestCommonStringSequence {

	static int lcs(String str1, String str2) {

		char[] strA = str1.toCharArray();
		char[] strB = str2.toCharArray();
		int m = strA.length;
		int n = strB.length;

		int[][] dp = new int[m + 1][n + 1];

		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(str1.charAt(i -1) == str2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}else {
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		String str1 = "stone";
		String str2 = "longest";

		int result = lcs(str1, str2);
		System.out.println("Longest Common String Sequence is : " + result);

	}

}
