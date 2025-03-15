package Lec4;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n=5;
		 
		 int row=1;
		 while(row<=5) {
			 
			 // work
			 int col=1;
			 while(col<=row) {
				 System.out.print("*");
				 col=col+1;
			 }
			 row=row+1;
			 System.out.println();
		 }
	}

}
