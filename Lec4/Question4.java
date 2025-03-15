package Lec4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=5;
		
		int row=1;
		int nst=9;
		int nsp=0;
		while(row<=n) {
			// work
			
			// Print the Space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			
			
			// Print the Star
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			
			// Preparation for Next row
			
			nst=nst-2;
			nsp=nsp+1;
			row=row+1;
			System.out.println();
		}
		
	}

}
