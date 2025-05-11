package TwoDArray;

public class checkTarget {

	
	public static boolean  isPresent(int [][] arr, int target) {
		
		
		// rows
		for(int i=0; i<arr.length;i++) {
			// cols
			for(int j=0;j<arr[0].length;j++) {
				
				if(arr[i][j]==target) {
					return true;
				}
				
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr= {
    		  {1,2,3},
    		  {4,5,6},
    		  {7,8,9},
    		    
      };
      
      System.out.println(isPresent(arr, 19));
      
      
	}

}
