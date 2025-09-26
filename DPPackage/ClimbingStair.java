package DPPackage;

public class ClimbingStair {

	public static int stairs(int n, int [] arr) {
		
		 if(n==0 || n==1) {
			 return 1;
		 }
		
		 if(arr[n] !=0) {
			 return arr[n];
		 }
		// 1 ka jump
		   int ans1=stairs(n-1, arr);
		// 2 ka jump
		   int ans2=stairs(n-2, arr);
		   
		   int meraAns= ans1+ans2;
		   return arr[n]=meraAns;
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(stairs(4));
	}

}
