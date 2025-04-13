package ArrayDemo;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();  // Take the Size of Array
		int [] arr= new int[n]; // Create N size Array
		
		// Taking Input from User.
		for(int i=0; i<n ;i++) {
			arr[i]= s.nextInt();
		}
		
		int sum=0;
		for(int  i=0; i<n ;i++) {
			sum= sum+ arr[i];
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
