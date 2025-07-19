package RecursionPart4;

public class Subsequence {

	
	
//	static int count=0;
	
	public static int subseq(String str,  String ans) {
		
	
		
		if(str.length()==0) {
			System.out.println(ans);
//			count++;
			return 1;
		}
		
		char ch= str.charAt(0);
		String chhotaStr= str.substring(1);
		
		// ch ko Subseq me  include karenge
		int chhotaAns1= subseq(chhotaStr, ans+ch);
		
		// ch ko Subseq me include nahi karenge
		int chhotaAns2= subseq(chhotaStr, ans+"");
		
		int meraAns= chhotaAns1+chhotaAns2;
		return meraAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="abc";
		int ans= subseq(str, "");
		System.out.println(ans);
		 //System.out.println(count);
		 
		 
	}

}
