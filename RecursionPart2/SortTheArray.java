package RecursionPart2;

public class SortTheArray {

	
	public static void sort(int [] arr, int i) {
		
		
		if(i==arr.length) {
			return;
		}
		sort(arr, i+1);
		
		for(int j=i; j<arr.length-1;j++) {
			if(arr[j]> arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {6,1,4,2,3};
		sort(arr, 0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
