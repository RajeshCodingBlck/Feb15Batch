package RecursionPart4;

public class SubsequenceUsingLogicalBreak {

	
	public static void subseq(String str, int i,String ans) {
		
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		
		char ch= str.charAt(i);
		// pick
		subseq(str, i+1, ans+ch);
		
		// Not Pick
		subseq(str, i+1, ans+"");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		subseq("abc", 0, "");
	}

}
