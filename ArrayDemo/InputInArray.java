package ArrayDemo;

import java.util.Scanner;

public class InputInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int [] arr= new int[5];
		
//		arr[0]= s.nextInt();
//		arr[1]=s.nextInt();
//		arr[2]=s.nextInt();
//		arr[3]=s.nextInt();
//		arr[4]=s.nextInt();
		
		
		for(int i=0; i<5;i++) {
			arr[i]= s.nextInt();
		}
		
//		System.out.println(arr[0]);
		for(int i=0; i<=4;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
