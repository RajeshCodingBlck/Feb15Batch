package Lec4;

public class Pattern3Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		
		int row=1;
		int nst=1;
		while(row<=n) {
			
			// work
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
			}
			
			// Preparation for Next row
			
			nst= nst+1;
			row=row+1;
			System.out.println();
		}
		
	}

}
