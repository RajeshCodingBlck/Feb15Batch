package FunctionDemo;

public class TakeNothingButReturnSomething {

	
	public static  int  add() {
		
		int a=12;
		int b=13;
		int ans= a+b;
		return ans;
//		return a;
//		System.out.println(ans);  // Unreachable Code.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a= add();
       System.out.println(a);
		
		 System.out.println(add());
		 
	}

}
