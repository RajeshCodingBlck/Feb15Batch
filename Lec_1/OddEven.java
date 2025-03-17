package Lec_1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int a= s.nextInt();
      
      if(a%2==0) {
    	  System.out.println("a is Even");
      }else {
    	  System.out.println("a is Odd");
      }
      
	}

}
