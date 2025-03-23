package MathProblems;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=1234;
		
		int sum=0;
		while(n!=0) {
			int ld= n%10;
			sum= sum+ld;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
