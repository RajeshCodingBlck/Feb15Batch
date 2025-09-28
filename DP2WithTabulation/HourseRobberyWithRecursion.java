package DP2WithTabulation;

public class HourseRobberyWithRecursion {

	public static int helper(int i, int[] nums, int[] dp) {

		if (i >= nums.length) {
			return 0;
		}

		if (dp[i] != -1) {
			return dp[i];
		}

		// ith index vale ghar par chori karoge.
		int chhotaAns1 = nums[i] + helper(i + 2, nums, dp);

		// ith index vale ghar par chori nahi karoge.
		int chhotaAns2 = helper(i + 1, nums, dp);

		int MeraAns = Math.max(chhotaAns1, chhotaAns2);
		return dp[i] = MeraAns;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] dp = new int[nums.length + 1];
//
//		Arrays.fill(dp, -1);
//		return helper(0, nums, dp);
		
		
//		Default 0 ko indicator nahi le sakte due to 0 can become the answer
	}

}
