package DP3;


class Solution {


    public int helper(int i, int [] coins, int amount){

        if(i==coins.length){
            return (int)1e5;
        }
        if(amount==0){
            return 0;
        }
        // include
          int ans1=(int)1e5;
          if(amount>=coins[i]){
              ans1= 1+ helper(i, coins, amount-coins[i]);
          }
        // exclude
        int ans2= helper(i+1, coins, amount);
        int meraAns= Math.min(ans1, ans2);
        return meraAns;


    }
    public int coinChange(int[] coins, int amount) {
       
      int ans= helper(0, coins, amount);  
      if(ans>=1e5){
        return -1;
      }else{
        return ans;
      }
    }
}
public class DpOnTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
