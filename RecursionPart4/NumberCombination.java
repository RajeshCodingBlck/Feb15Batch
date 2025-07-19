package RecursionPart4;

public class NumberCombination {

	
	public static void getBN(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		getBN(n-1, ans+"0");
		getBN(n-1, ans+"1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        getBN(3, "");
	}

}
