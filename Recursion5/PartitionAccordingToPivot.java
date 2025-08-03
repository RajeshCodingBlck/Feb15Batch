package Recursion5;

public class PartitionAccordingToPivot {

	
	public static void partition(int [] arr, int pivot) {
		
		
		int index=0;
		int i=0;
		
		while(i<arr.length) {
			
			if(arr[i]<=pivot) {
				
				// swap
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				
				i++;
				index++;
			}else {
				i++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {12,10,3,15,4,10,3};
		
		int pivot=6;
		partition(arr, pivot);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
