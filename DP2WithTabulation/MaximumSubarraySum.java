package DP2WithTabulation;

public class MaximumSubarraySum {

	class Solution {
	    public int maxSubArray(int[] nums) {

	      int [] dp= new int[nums.length];
	      dp[0]=nums[0];

//	      dp[i]= Maximum Subarray Sum ending at Index i.

	      int overallMax=nums[0];
	      for(int i=1;i<nums.length;i++){

	         dp[i]= Math.max(dp[i-1]+nums[i], nums[i]);
	         overallMax=Math.max(overallMax, dp[i]);
	      }  

	      return overallMax;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
