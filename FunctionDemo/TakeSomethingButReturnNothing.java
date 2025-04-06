package FunctionDemo;

public class TakeSomethingButReturnNothing {

	public static void add(int a, int b) {

		System.out.println("add is Start");
		int ans = a + b;
		System.out.println(ans);
		System.out.println("add is End");
	}

	public static void fun(int x, int y) {
		x++;
		y++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 13;
		System.out.println("Before fun a" + a);
		System.out.println("Before fun b " + b);
		fun(a, b);
		// a and b not change
	
		System.out.println("After fun a" + a);
		System.out.println("After fun b " + b);
	}

}
