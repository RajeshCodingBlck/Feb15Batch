package Lec4;

public class Question14 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int row=1;
		int nsp=4;
		int nst=1;
		while(row<=9) {
			
			// work
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			
			// work for Star
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			
			// Preparation for Next Row
			if(row<5) {
				nst=nst+1;
				nsp=nsp-1;
			}else {
				nst=nst-1;
				nsp= nsp+1;
			}	
			row=row+1;
			System.out.println();
		}
		
	}

}
