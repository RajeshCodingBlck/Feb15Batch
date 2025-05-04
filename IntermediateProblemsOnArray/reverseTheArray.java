package IntermediateProblemsOnArray;

public class reverseTheArray {

	public static void reverse(int [] arr) {
		
		int i=0;
		int j= arr.length-1;
		while(i<=j) {
			// Swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	
	public static void reverseInRange(int [] arr, int l, int r) {
		
		
		int i=l;
		int j= r;
		while(i<=j) {
			// Swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6};
//       reverse(arr);
        reverseInRange(arr, 1, 3);
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}
