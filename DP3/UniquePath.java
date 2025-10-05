package DP3;

public class UniquePath {

	
	public static int getPathCount(int cr, int cc, int desR, int desC, int [][] dp) {
		
		
		if(cr==desR && cc==desC) {
			return 1;
		}
		
		if(cr> desR || cc> desC) {
			return 0;
		}
		
		if(dp[cr][cc] !=0) {
			return dp[cr][cc];
		}
		
		// Down
		int ChhotaAns1=getPathCount(cr+1, cc, desR, desC, dp);
		
		// Right
		int ChhotaAns2= getPathCount(cr, cc+1, desR, desC, dp);
		
		int MeraAns= ChhotaAns1+ ChhotaAns2;
		dp[cr][cc]=MeraAns;
		return MeraAns;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
