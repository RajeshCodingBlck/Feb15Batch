package DPPackage;

import java.util.HashMap;

public class Fibo {

	public static int fibo(int n) {

		if (n == 0) {

			return 0;
		}

		if (n == 1) {
			return 1;
		}

		System.out.println(n);

		int chhotaAns1 = fibo(n - 1);
		int chhotaAns2 = fibo(n - 2);

		int meraAns = chhotaAns1 + chhotaAns2;
		return meraAns;

	}

	public static int fibo(int n, HashMap<Integer, Integer> hm) {

		if (n == 0) {

			return 0;
		}

		if (n == 1) {
			return 1;
		}

		// check karo ye kaam pehle bhi ho chhuka he kya
		if (hm.containsKey(n)) {
			return hm.get(n);
		}

		System.out.println(n);

		int chhotaAns1 = fibo(n - 1, hm);
		int chhotaAns2 = fibo(n - 2, hm);
		int meraAns = chhotaAns1 + chhotaAns2;

		// Store karlo ye kaam ho chukka he aur uska asnwer bhi
		hm.put(n, meraAns);
		return meraAns;

	}

	public static int fibo(int n, int[] arr) {

		if (n == 0) {

			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if(arr[n] !=0) {
			return arr[n];
		}
		
		System.out.println(n);
		
		

		int chhotaAns1 = fibo(n - 1, arr);
		int chhotaAns2 = fibo(n - 2, arr);

		int meraAns = chhotaAns1 + chhotaAns2;
		
		arr[n]=meraAns;
		return meraAns;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> hm = new HashMap();
		System.out.println(fibo(10, hm));
	}

}
