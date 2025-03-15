package Lec4;

public class RevisionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int row=1;
		
		int nst=1;
		int nsp=4;
		while(row<=5) {
			// work
			
			  // work for Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			 int i=1;
			 while(i<=nst) {
				 if(i%2==1) {
					 System.out.print("*"+" ");
				 }else {
					 System.out.print(" "+ " ");
				 }
				 i=i+1;
			 }
			
			 // preparation for Next row
			 nst=nst+2;
			 nsp=nsp-1;
			System.out.println();
			row=row+1;
		}
		
	}

}
