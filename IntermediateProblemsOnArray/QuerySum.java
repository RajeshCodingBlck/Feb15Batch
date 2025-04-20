package IntermediateProblemsOnArray;

import java.util.Scanner;

public class QuerySum {

	public static int getSum(int[] arr, int l, int r) {

		int sum = 0;
		for (int i = l; i <= r; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int getSumMethod2(int[] prefix, int l, int r) {

		if(l==0) {
			return prefix[r];
		}else {
			return prefix[r]-prefix[l-1];
		}
		
	}

	public static int[] getPrefixSumArray(int[] arr) {

		int n = arr.length;
		int[] prefix = new int[n];

		prefix[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 2, -3, 4, 5, 6, 7 };
		Scanner s = new Scanner(System.in);

		int q = s.nextInt();

//       for(int i=1;i<=q;i++) {
//    	   int l= s.nextInt();
//    	   int r= s.nextInt();
//    	   int Sum= getSum(arr, l, r);
//    	   System.out.println(Sum);  
//       }
                       // Precomputation....
		int[] prefix = getPrefixSumArray(arr);
		for (int i = 1; i <= q; i++) {
			int l = s.nextInt();
			int r = s.nextInt();
			int Sum = getSumMethod2(prefix, l, r);
			System.out.println(Sum);
		}

		// 5 1 4 1 6 0 2 0 0 0 1

	}

}
