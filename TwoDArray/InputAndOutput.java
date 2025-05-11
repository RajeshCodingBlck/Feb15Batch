package TwoDArray;

import java.util.Scanner;

public class InputAndOutput {

	
	public static void display(int [][] arr) {
		
		int n= arr.length;
		int m= arr[0].length;
		
		for(int i=0; i<n;i++) {
			   for(int j=0;j<m;j++) {
				   System.out.print(arr[i][j]+" ");
			   }
			   System.out.println();
		   }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	   Scanner s= new Scanner(System.in);
	   int n= s.nextInt(); // No of rows
	   int m= s.nextInt(); // No of cols
	   
	   int [][] arr= new int[n][m];
	   
	   // Input
	   for(int i=0; i<n;i++) {
		   for(int j=0;j<m;j++) {
			   arr[i][j]= s.nextInt();
		   }
	   }
	   
	   // display
	   display(arr);
	   
	   
	   
	   
	}

}
