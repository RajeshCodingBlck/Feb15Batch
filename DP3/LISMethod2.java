package DP3;

public class LISMethod2 {

	
//	class Solution {
//
//
//	     public static int getIndex(int [] dp , int val){
//
//	         int low=1;
//	         int high=dp.length-1;
//	        
//	         int ans=-1;
//	         while(low<=high){
//	            
//	            int mid= (low+high)/2;
//
//	            if(dp[mid]< val){
//	                 low=mid+1;
//	            }else{
//	                ans=mid;
//	                high=mid-1;
//	            }
//	         }
//	         return ans;
//	     }
//
//
//
//
//	    public int lengthOfLIS(int[] nums) {
//	     
//	     int [] dp= new int[nums.length+1];
//	     Arrays.fill(dp, (int)1e9);
//
//	     for(int i=0;i< nums.length;i++){
//
//	        int index= getIndex(dp, nums[i]);
//	         dp[index]=nums[i];
//	     }
//	      
//
//	      int ans=0;
//	      for(int i=1;i<dp.length;i++){
//
//	        if(dp[i] !=1e9){
//	           ans=i;
//	        }else{
//	            break;
//	        }
//	      }
//	      return ans;
//	    }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// dp[i]= Minimum Ending value for i length Increasing subsequence.
		
	}

}
