package TwoDArray;

public class columnWiseZigZagOrder {

	public static void colZigZag(int [][] arr) {
		
		
		// cols
		for(int j=0; j<arr[0].length; j++) {
			
			if(j%2==0) { // even
			
				// rows
				for(int i=0; i<arr.length;i++) {
					System.out.print(arr[i][j]+" ");
				}
				
			}else { // odd
				
				for(int i=arr.length-1; i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] arr= { 
	    		 {1,2,3,4,5},
	    		 {6,7,8,9,10},
	    		 {11,12,13,14,15},
	    		 {16,17,18,19,20},
	    		 {21,22,23,24,25},
	     };
		 
		 colZigZag(arr);
		 
	}

}
