package Lec5;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		
		int nst1=1;
		int nst2=1;
		int nsp=3;
		while(row<=5) {
			// work
			
			if(row==1 || row==5) {
				
				int i=1;
				while(i<=5) {
					System.out.print("*");
					i=i+1;
				}
				
			}else {
				
				int i=1;
				while(i<=nst1) {
					System.out.print("*");
					i=i+1;
				}
				
				int j=1;
				while(j<=nsp) {
					System.out.print(" ");
					j=j+1;
				}
				
				int k=1;
				while(k<=nst2) {
					System.out.print("*");
					k=k+1;
				}
				// preparation for Next row
				nst1=nst1;
				nsp=nsp;
				nst2=nst2;	
			}
			row=row+1;
			System.out.println();
		}
	}

}
