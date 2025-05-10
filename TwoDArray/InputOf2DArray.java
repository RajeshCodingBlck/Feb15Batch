package TwoDArray;

import java.util.Scanner;

public class InputOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [][] arr= new int[3][3];
		Scanner s= new Scanner(System.in);
		
//		arr[0][0]= s.nextInt();
//		arr[0][1]= s.nextInt();
//		arr[0][2]= s.nextInt();
//		arr[1][0]= s.nextInt();
//		arr[1][1]= s.nextInt();
//		arr[1][2]= s.nextInt();
		
		
		// Taking Input...
		for(int i=0; i<3;i++) { // row wise
			for(int j=0;j<3; j++) {
			   arr[i][j]= s.nextInt();
			}
		}
		
		for(int i=0; i<3;i++) { // row wise
			for(int j=0;j<3; j++) {  // col wise
			   System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
