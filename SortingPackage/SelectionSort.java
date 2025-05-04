package SortingPackage;

public class SelectionSort {

	public static int getMinimumInRange(int[] arr, int l, int r) {

		int aabhiTakMinimum = arr[l];
		int TuheKaha = l; // index

		for (int i = l + 1; i <= r; i++) {

			if (arr[i] < aabhiTakMinimum) {
				aabhiTakMinimum = arr[i];
				TuheKaha = i;
			}
		}
		return TuheKaha;
	}
	public static void selectionSort(int[] arr) {
         
		 for(int i=0;i<arr.length;i++) {
			 
			 int minIndex= getMinimumInRange(arr, i, arr.length-1); 
			 int temp=arr[i];
			 arr[i]=arr[minIndex];
			 arr[minIndex]=temp;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,5,4,1,2,7};
     selectionSort(arr);
     
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
	}

}
