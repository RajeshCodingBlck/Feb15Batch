package Stringpkg;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		int [] arr;
		
		// new Keyword
		String str= new String("Hello");
		String str2= "Hello"; // String literal  
		
		int [] arr= new int [5];
		System.out.println(arr);
		
		System.out.println(str);
		System.out.println(str2);
		
		
		// arr[2]
		// character ko access karna he charAt()
		System.out.println(str.charAt(0));
		
		// arr.length
		System.out.println(str.length());
		
		// subString 
		
		System.out.println( str.substring(   1 , 3 +1 ));
		
		System.out.println(str.substring(1));
		
		
		// String ka input kese le.
		
		
		Scanner s= new Scanner(System.in);
		
//		String str3= s.next(); // when we need to take input of word.
		String str3= s.nextLine(); // when we need to take input of line.
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
