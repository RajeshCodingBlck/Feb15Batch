package TimeComplexity;

public class SumOfNaturalNumber {

	public static int sum(int n) {
		
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int sum2(int n) {
		
		int sum= n*(n+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start= System.nanoTime();
		 System.out.println(sum(5));
		 long end= System.nanoTime();
		 System.out.println(end-start);
		 
	}

}
