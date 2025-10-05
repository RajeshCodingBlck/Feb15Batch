package DP3;


//static int knapsack(int W, int val[], int wt[]) {
//    // code here
//    
//    int [][] dp= new int[wt.length][W+1];
//    
//    for(int i=0;i<dp.length;i++){
//        for(int j=0;j<dp[0].length;j++){
//            dp[i][j]=-1;
//        }
//    }
//    // return helper(0, wt, val, W, dp);
//    
//    for(int i=0;i<dp.length;i++){
//        for(int w=0;w<dp[0].length;w++){
//            
//            if(w==0){
//                dp[i][w]=0;
//                continue;
//            }
//            if(i==0){
//                if(wt[i]<=w){
//                    dp[i][w]=val[i];
//                }else{
//                    dp[i][w]=0;
//                }
//                continue;
//            }
//            
//            if(wt[i]<=w){
//                dp[i][w]= Math.max(val[i]+ dp[i-1][w-wt[i]], 
//                dp[i-1][w]);
//            }else{
//                dp[i][w]=dp[i-1][w];
//            }
//        }
//    }
//    
//    return dp[wt.length-1][W];
//    
//}
public class KnapSack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
