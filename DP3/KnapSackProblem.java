package DP3;

class Solution {
    
    
    static int helper(int i, int [] wt, int [] val, int W,
      int [][] dp){
        
        if(i==wt.length){
            
            return 0;
        }
        
        
        if(dp[i][W] !=-1){
            return dp[i][W];
        }
        // Inlcude
        int ans1=0;
        if(wt[i]<=W){
            ans1= val[i]+ helper(i+1, wt, val, W-wt[i], dp);
        }
        
        // Exclude
        int ans2= 0+ helper(i+1, wt, val, W, dp);
        
        
        int MeraAns= Math.max(ans1, ans2);
        dp[i][W]=MeraAns;
        return MeraAns;
        
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        
        int [][] dp= new int[wt.length][W+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0, wt, val, W, dp);
        
    }
}

public class KnapSackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
