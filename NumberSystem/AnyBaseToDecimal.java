package NumberSystem;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10011;

		int ans = 0;
		int placeValue = 1;
		int base=2;
		while (n != 0) {
			int lastDigit = n % 10;
			ans = ans + lastDigit * placeValue;

			n = n / 10;
			placeValue = placeValue * base;
		}
		System.out.println(ans);
	}

}
