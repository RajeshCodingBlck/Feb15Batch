package DP3;

public class LIS {

 
	class Solution {
	    public int lengthOfLIS(int[] nums) {



	        int [] dp= new int[nums.length];
	        // dp[i]= Length of Longest  increasing Subsequence ending at index i
	        
	       int overallMax=1;
	       for(int i=0;i<dp.length;i++){

	         dp[i]=1;
	         for(int j=i-1;j>=0;j--){

	            if(nums[j]< nums[i]){
	                dp[i]= Math.max(dp[i], dp[j]+1);
	            }
	         }

	         overallMax= Math.max(overallMax, dp[i]);
	       }

	       return overallMax;

	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
