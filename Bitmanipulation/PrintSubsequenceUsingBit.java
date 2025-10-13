package Bitmanipulation;

public class PrintSubsequenceUsingBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr= {1,2,3,4};
		
		int n=  arr.length;
		
	    for(int i=0; i<(1<<n);i++) {
	    	
	    	for(int j=0;j<32;j++) { // Bit traversal
	    		
	    		int bit=  (i>>j) & 1;
	    		if(bit==1) {
	    			System.out.print(arr[j]+" , ");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    
	}

}
