package IntermediateProblemsOnArray;

public class RotateInArray {

	
	public static void reverseInRange(int [] arr, int l, int r) {
		
		int i=l;
		int j=r;
		while(i<=j) {
			// Swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	public static void rotateInArray(int [] arr, int k) {
		
		k= k%arr.length;
		// Reverse The Hole Array
		reverseInRange(arr,0, arr.length-1);
		// first K element reverse
		reverseInRange(arr, 0, k-1);
		// remaining n-k elements reverse
		reverseInRange(arr, k, arr.length-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      int k=6;
      rotateInArray(arr, k);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
	}

}
