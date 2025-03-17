package Lec2;

import java.util.Scanner;

public class divisiblityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int a= s.nextInt();
       
       if(a %3==0  && a%5==0) {
    	   System.out.println(a + " is divisible by 3 and 5");
       }else {
    	   System.out.println(a + " is not divisible by 3 and 5");
       }
	}

}
