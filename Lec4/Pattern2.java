package Lec4;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=5;
		
		
		int row=1;
		
		while(row<=n) {
			
			// work
			int i=1;
			while(i<=n) {
				System.out.print("*");
				i=i+1;
			}
			
			System.out.println();
			row=row+1;
		}
		
	}

}
