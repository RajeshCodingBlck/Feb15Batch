package MathProblems;

public class SumOfOddEvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234;

		int sumOfEven = 0;
		int sumOfOdd=0;
		while (n != 0) {
			int ld = n % 10;
			
			if(ld%2 ==0) {
				sumOfEven+=ld;
			}else {
			   sumOfOdd+=ld;
			}
			n = n / 10;
		}
		System.out.println(sumOfEven + " "+ sumOfOdd);
	}

}
