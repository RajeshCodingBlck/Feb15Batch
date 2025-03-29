package NumberSystem;

public class reverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n= 100030;
		int ans=0;
		
		int placeValue=1;
		while(n!=0) {
			int lastDigit= n%10;
			if(lastDigit==0) {
				lastDigit=7;
			}
//			ans= ans*10+ lastDigit; 
			ans = lastDigit*placeValue + ans;
			placeValue= placeValue*10;
			n=n/10;
		}
		System.out.println(ans);
	}

}
