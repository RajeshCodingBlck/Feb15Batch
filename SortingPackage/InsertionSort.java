package SortingPackage;

public class InsertionSort {

	public static void insertAtcorrectPosition(int [] arr, int i, 
			int temp) {
		
		while(i>=0 &&arr[i]>temp) {
			// shift
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=temp;	
	}
	public static void insertionSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			insertAtcorrectPosition(arr, i,arr[i+1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,1,2,5,4,7,6};
     insertionSort(arr);
//     for(int i=0;i<arr.length;i++) {
//    	 System.out.print(arr[i]+" ");
//     }
     
     for( int val: arr) {
    	 System.out.print(val+" ");
     }
     
     
	}

}
