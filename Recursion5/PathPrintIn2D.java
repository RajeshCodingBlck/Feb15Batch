package Recursion5;

public class PathPrintIn2D {
    
	// "static void main" must be defined in a public class.
	public class Main {
	    
	    public static void path(int currRow, int currCol, int desRow, int desCol,String ans){
	        
	        if(currRow==desRow && currCol==desCol){ // +ve Base Case
	            System.out.println(ans);
	            return;
	        }
	        if(currRow>desRow || currCol>desCol){ // -ve Base case
	            return;
	        }
	        
	        // Right Shift
	        path(currRow, currCol+1, desRow, desCol, ans+"R");
	        // DownShift
	        path(currRow+1, currCol, desRow, desCol, ans+"D");
	        
	        
	    }
	    public static void main(String[] args) {
	       
	        int n=3;
	        int m=3;
	        path(0,0, n-1, m-1, "");
	    }
	}
	
}
