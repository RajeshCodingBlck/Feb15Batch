package SortingPackage;

public class InsertionSortHelper {

	public static void insertAtcorrectPosition(int [] arr, int i, 
			int temp) {
		
		while(i>=0 &&arr[i]>temp) {
			// shift
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int [] arr= {3,4,6,7,9,10,5};
		int [] arr= {3,4,5,6,7,1};
      int n=arr.length;
      insertAtcorrectPosition(arr, n-2, arr[n-1]);
      for(int i=0;i<n;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
      
	}

}
