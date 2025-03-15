package Lec4;

public class Pattern4Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		
		int row=1;
		
		int nst=1;
		int noDoller=4;
		
		while(row<=n) {
			
			// work
			
			// Print the Doller
			int i=1;
			while(i<=noDoller) {
				System.out.print("$");
				i=i+1;
			}
			
			// Print the Star
			int j=1;
			while(j<=nst) {
				System.out.print("*");
				j=j+1;
			}
			
			// Preparation for Next row
			
			nst= nst+1;
			noDoller= noDoller-1;
			row=row+1;
			System.out.println();
		}
		
	}

}
