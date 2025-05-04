package SortingPackage;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int [] arr) {
		
		int n=arr.length;
		for(int round=1; round<= n-1;round++) {	
			for(int i=0;i<arr.length-round;i++) {
				if(arr[i]> arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int [] arr= {5,4,3,2,1};
	   int [] arr= {10,2,1,4,2,5};
//      bubbleSort(arr);
	   
	   // In Buit Function
	   Arrays.sort(arr);
	   
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
      
      
	}

}
