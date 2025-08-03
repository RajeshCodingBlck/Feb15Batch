package Recursion5;

public class PartitionInArray {

	
	public static int partition(int [] arr, int s, int e) {
		
		//int n= arr.length;
		int pivot= arr[e];
		
		int index=s;
		int i=s;
		
		while(i<arr.length-1) {
			
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
		
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
