package RecursionPart3;

public class StairProblem {

	
	public static void stairs(int n,String ans) {
		
		
		 if(n==0) {
			 System.out.println(ans);
			 return;
		 }
		
		 if(n<0) {
			 return;
		 }
		// 1 ka Jump lu
		 stairs(n-1 , ans+"1");
		 
		 // 2 ka Jump lu
		 stairs(n-2, ans+"2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		stairs(3, "");
		
	}

}
