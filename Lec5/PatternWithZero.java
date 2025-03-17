package Lec5;

import java.util.Scanner;

public class PatternWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n=s.nextInt();
       int row=1;
       int nst=1;
       while(row<=n) {
    	   // work
    	   int i=1;
    	   while(i<=nst) {
    		   if(i==1 || i==nst) {
    			   System.out.print(row+"\t");
    		   }else {
    			   System.out.print(0+"\t");
    		   }
    		   i=i+1;
    	   }
    	   
    	   // Preparation for Next row
    	   nst=nst+1;
    	   row=row+1;
    	   System.out.println();
       }
       
       
	}

}
