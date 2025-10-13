package Bitmanipulation;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n=10;
		
		int ans=0;
		
//		while(n>0) {
//			
//			int bit= n&1;
//			if(bit==1) {
//				ans++;
//			}
//			n=n>>1;
//		}
//		
//		System.out.println(ans);
		
		
		while(n>0) {
			
			n= n&(n-1);
			ans++;
		}
		
	}

}
