package IntermediateProblemsOnArray;

public class Transpose {

	public static void transpose(int [][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr[0].length;j++) {
				
//			System.out.println("Swap btw "+ i+" "+ j+
//					             " "+ j+ " "+ i);
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	
	public static void reverse(int [][] arr) {
		
		int i=0;
		int j= arr.length-1;
		
		while(i<j) {
			
			// swap
			int [] temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][] arr= {
    		   {1,2,3},
    		   {4,5,6},
    		   {7,8,9}
       };
       
       transpose(arr);
       reverse(arr);
       
       
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[0].length;j++) {
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
       
	}

}
