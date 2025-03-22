package MathProblems;

import java.util.Scanner;

//import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		
		
//		for(int i=1;i<=n;i++) {
//			
//			if(n%i==0) {
//				System.out.println(i);
//			}
//		}
		
		
//		for(int i=1;i<=n/2;i++) {
//			
//			if(n%i ==0 ) {
//				System.out.println(i);
//			}
//		}
//		
//		System.out.println(n);
		
		
		for(int i=1 ; i*i<=n;i++) {
			
		    if(n%i==0) { 
		       int div1= i;
		       int div2= n/i;
		       System.out.println(div1);
		       if(div1 !=div2) {
		    	   System.out.println(div2);
		       }
		    }
		}
		
		
		
		
		
		
	}

}
