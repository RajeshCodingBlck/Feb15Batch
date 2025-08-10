package Polymorphism;

public class A {

	void add(int a, int b) {

		System.out.println(a + b);
	}

	void add(int a, int b , int c) {

		System.out.println(a + b+c);
	}
	
	void add(String str, int a) {
		System.out.println(str+a);
	}
	
	void add( int a, String str) {
		System.out.println(str+a);
	}
	
//	String add(String str, int a) {
//		
//		return str+a;
//	}
}
