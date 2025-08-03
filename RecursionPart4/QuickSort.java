package RecursionPart4;



public class QuickSort {

	public static int partition(int[] arr, int s, int e) {

		// int n= arr.length;
		int pivot = arr[e];

		int index = s;
		int i = s;

		while (i < e) {

			if (arr[i] <= pivot) {

				// swap
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;

				i++;
				index++;
			} else {
				i++;
			}
		}

		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
		return index;
	}

	public static void QuickSort(int [] arr, int s, int e) {
		
		    if(s == e) {
		    	return;
		    }
		    if(s>e) {
		    	return;
		    }
		
		   int pi=partition(arr, s, e);
		   QuickSort(arr, s, pi-1);
		   QuickSort(arr, pi+1, e);
		   
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,1,4,5,6,3};
		QuickSort(arr, 0, arr.length-1);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}
}
