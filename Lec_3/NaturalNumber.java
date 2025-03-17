package Lec_3;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int i=1; // ith Natural Number Print karne ja rahe he.
		while(i<=n) {
			System.out.println(i);
			i=i+1;
		}
		
		
	}

}
