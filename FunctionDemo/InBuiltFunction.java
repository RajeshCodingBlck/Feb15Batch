package FunctionDemo;

public class InBuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=100;
		int b=13;
		int maxValue= Math.max(a, b);
		System.out.println(maxValue);
		int minValue= Math.min(a, b);
		System.out.println(minValue);
		
		int  base=2;
		int  exponent= 4;
		int c=1;
		int d=4;
		System.out.println(Math.pow(base, exponent));
		System.out.println(Math.pow(c, d));
		
		int  e= -13;
		System.out.println(Math.abs(e));
		
		// Sqrt
		System.out.println(Math.sqrt(50));
		
		
	  int ans= Math.max(12, Math.max(13, 14));
	  
		
		
	}

}
