package RecursionPart4;

public class SubsequenceInString {

	
	public static void subseq(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch= str.charAt(0);
		String chhotaStr= str.substring(1);
		
		// ch Hamre Subseq ka Part Banega
		      subseq(chhotaStr,ans+ch);
		      
        // ch Hamre Subseq ka Part Banega
		      subseq(chhotaStr,ans);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 subseq("abc", "");
		 
	}

}
