package MathProblems;

import java.util.Scanner;

public class NumberSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int n=1489;
       
//       System.out.println(n);
//       
//       n= n/10;
//       System.out.println(n);
//       n=n/10;
//       
//       System.out.println(n);
//       n=n/10;
//       System.out.println(n);
//       
//       n=n/10;
//       System.out.println(n);
       
       
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        
        int count=0;
        while(n!=0) {
        	n=n/10;
        	count++;
        }
        System.out.println(count);
        
       
	}

}
