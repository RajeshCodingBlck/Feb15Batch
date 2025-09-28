package DP2WithTabulation;



public class ClimbingStairs {

	public static int helper(int n) {

		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(helper(10));
	}

}
