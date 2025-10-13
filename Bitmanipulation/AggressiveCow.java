package Bitmanipulation;

public class AggressiveCow {

	
	public static boolean isPossible(int [] stalls, int k, int d) {
		
		
		int LastPositionCow= stalls[0];
		int count=1;
		
		for(int i=1;i<stalls.length;i++) {
			
			if(stalls[i]-LastPositionCow >=d) {
				LastPositionCow=stalls[i];
				count++;
			}
			
			if(count==k) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,4,8,9};
		int k=3;
		
//		linear Search
//		for(int d=0;d<=100;d++) {
//			System.out.println(d+ " "+ isPossible(arr, k, d));
//		}
		
		// Binary Search
		
		int low=0;
		int high=arr[arr.length-1]-arr[0];
		
		int ans=0;
		
		while(low<=high) {
			
			int mid= (low+high)/2;
			
			if(isPossible(arr, k, mid)==true) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		
	}

}
