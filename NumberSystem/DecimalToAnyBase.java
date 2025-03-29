package NumberSystem;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base=2;
		int n = 19;
		int ans = 0;
		int placeValue = 1;
		while (n != 0) {

			int rem = n % base;
			ans = rem * placeValue + ans;

			placeValue = placeValue * 10;
			n = n / base;
		}
		System.out.println(ans);
	}

}
