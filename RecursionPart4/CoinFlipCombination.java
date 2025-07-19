package RecursionPart4;

public class CoinFlipCombination {

	
	public static void coinFlip(int n, String ans) {
		
		  if(n==0) {
			  System.out.println(ans);
			  return;
		  }
		
		// Head
		coinFlip(n-1, ans+"H");
		
		// Tail
		coinFlip(n-1, ans+"T");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		coinFlip(3, "");
		
	}

}
