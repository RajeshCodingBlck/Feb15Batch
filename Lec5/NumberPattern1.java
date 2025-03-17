package Lec5;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int row=1;
		int nsp=4;
		int nst=1;
		
		
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+"\t");
				i=i+1;
			}
			
			int j=1;
			int count=1;
			while(j<=nst) {
				System.out.print(count+"\t");
				count=count+1;
				j=j+1;
			}
			
		    	
			
			// Preparation for Next Row
			nst=nst+2;
			nsp=nsp-1;
			row=row+1;
			System.out.println();
		}
		
	}

}
