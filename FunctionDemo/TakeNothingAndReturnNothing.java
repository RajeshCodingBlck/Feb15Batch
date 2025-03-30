package FunctionDemo;

public class TakeNothingAndReturnNothing {

	
	public static void sub() {
		System.out.println("Sub is Start");
		int a=12;
		int b=13;
		int ans= a-b;
		System.out.println(ans);
		System.out.println("Sub is End");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Main is Start");
		  add();
          System.out.println("Hello");
          System.out.println("Main is End");
	}
	
	public static void add() { 
		System.out.println("add is Start");
		int a=12;
		int b=13;
		int ans= a+b;
		sub();
		System.out.println(ans);
		System.out.println("add is End");
		
	}
	


}
