package RecursionPart2;

public class PrintTheArray {

	
	public static void print(int [] arr, int i) {
		
		if(i== arr.length) {
			return;
		}
		
		 System.out.print(arr[i]+" ");
		 print(arr, i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5,6};
		print(arr, 0);
	}

}
