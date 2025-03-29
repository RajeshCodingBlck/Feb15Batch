package NumberSystem;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int next=-1;
		for(int i=2;i<=6;i++) {
			next= a+b;
			a=b;
			b=next;
		}
		System.out.println(next);
		
	}

}
