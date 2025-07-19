package Recursion5;

import java.util.ArrayList;

public class TargetSumSubsequence {

	
	public static void printSubseq(int [] arr, int i,int target,int sum
			, ArrayList<Integer> ans) {
		
		
		if(sum> target) {
			return;
		}
		
		if(i==arr.length) {
			
			System.out.println(ans);
			return;
		}		
		// arr[i] ko Include kar raha hu Subseqence Me.
		 ans.add(arr[i]);
		 printSubseq(arr, i+1, target, sum+arr[i], ans);
		 
		 // Not pick
		 ans.remove(ans.size()-1);
		 printSubseq(arr, i+1, target, sum, ans);
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3};
      int target= 7;
      
      ArrayList<Integer> ans= new ArrayList();
      printSubseq(arr,0, target, 0, ans);
	}

}
