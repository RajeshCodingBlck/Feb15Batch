package NumberSystem;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n= 19;
		
		int ans=0;
		int placeValue=1;
		while(n!=0) {

			int rem= n%2;
			ans= rem*placeValue+ ans;
			
			placeValue= placeValue*10;
			n=n/2;
		}
		System.out.println(ans);
		
		
	}

}
