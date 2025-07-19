package Recursion5;

public class BalanceParenthesis {

	
	
	public static boolean  isBalance(String str) {
		
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(') {
				count++;
			}else {
				if(count==0) {
					return false;
				}else {
					count--;
				}
			}
		}
		
		return count==0;
		
	}
	public static void GenParenthesis(int remOpening, int remClosing,
			String ans) {
		
		
		if(remOpening==0  && remClosing==0) {
			
			System.out.println(ans);
//			if(isBalance(ans)) {
//				System.out.println(ans);
//			}
			return;
		}
		
		if(remOpening<0  || remClosing <0) {
			return ;
		}
		
		if(remOpening > remClosing) {
			return;
		}
	    
		// 1st Position par ya me (
		GenParenthesis(remOpening -1,remClosing, ans+"(");
		
		// 1st Position par ya me )
		GenParenthesis(remOpening ,remClosing-1, ans+")");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		GenParenthesis(3, 3, "");
		
	}

}
