package SortingPackage;

import java.util.Arrays;

public class checkPairSum {

	public static boolean isPairExist(int [] arr, int target) {
		
		Arrays.sort(arr);
		int i=0;
		int j= arr.length-1;
		
		while(i<j) {
			
			int sum= arr[i]+arr[j];
			if(sum> target) {
				j--;
			}else if(sum<target) {
				 i++;
			}else {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,1,3,3,5,7,8};
      int target=20;
      System.out.println(isPairExist(arr, target));
      
      
	}

}
