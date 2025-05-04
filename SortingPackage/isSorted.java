package SortingPackage;

public class isSorted {

	public static boolean isSorted(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]<=arr[i+1]) {
				//return true;
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,13,4,5};
		System.out.println(isSorted(arr));
	}

}
