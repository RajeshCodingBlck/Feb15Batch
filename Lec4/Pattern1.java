package Lec4;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        
        // loop
        int i=1;
        while(i<=n) {
        	System.out.print("*" +" ");
        	i=i+1;
        }
        
        
	}

}
