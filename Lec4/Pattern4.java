package Lec4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		int row=1;
		while(row<=n) {
			
			// work
			int col=1;
			
			
			while(col<=5) {
				
				if(col<=n-row) {
					System.out.print("$");
				}else {
					System.out.print("*");
					
				}
				col=col+1;
			}
			
			
			
			
			row=row+1;
			System.out.println();
		}
	}

}
