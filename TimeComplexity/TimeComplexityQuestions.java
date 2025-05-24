package TimeComplexity;

public class TimeComplexityQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  int n=100000000;
	  
	  for(int i=1;i<=n;i++) {
		  System.out.println("Hello");
	  }
	  
	  // O(n)
	  
	  for(int i=1;i<=n;i= i*2) {
		  System.out.println("Hello");
	  }
	  // O(logn )
	  
	  
	  for(int i=n; i>=1;i= i/2) {
		  System.out.println("Hello");
	  }
	  // O(logn)
	  
	  
//	  int i=1;
//	  while(i<=n) {
//		  System.out.println("Hello");
//		  i=i*2;
//		  i=i*3;
//		  
////		  i=i*6;
//	  }
	  
	  // (logn base 6)
	  
	  
	  // Nested Loop time complexity
	  
	   for(int i=1; i<=n;i++) {
		   for(int j=1; j<=n;j++) {
			   System.out.println("Hello");
		   }
	   }
	   
	  // O(n^2)

	   
	   for(int i=1; i<=n;i++) {
		   for(int j=1; j<=n;j=j*2) {
			   System.out.println("Hello");
		   }
	   }
//	    TC O(nlogn)
	   
	   for(int i=n; i>=1;i=i/2) {
		   for(int j=1; j<=n;j=j*2) {
			   System.out.println("Hello");
		   }
	   }
	   
//	   TC O(logn*logn)
	   
	   
	   for(int i=1;i<=n;i++) {
		   for(int j=i;j<=n;j++) {
			   System.out.println("Hello");
		   }
	   }
	   // TC O(n^2)
	   
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n;j+=i) {
			   System.out.println("Hello");
		   }
	   }
	   
	   
	   
	  
	}

}
