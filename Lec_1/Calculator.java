package Lec_1;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int ans= a+b+c;
		System.out.print(ans + " ");
		System.out.print(a+b+c + " ");
		System.out.print(a-b-c + " ");
		System.out.print(a*b*c + " ");
		System.out.print(a/b + " ");
		System.out.print(a%b + " ");
		

	}

}
