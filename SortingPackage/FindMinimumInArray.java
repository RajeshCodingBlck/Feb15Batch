package SortingPackage;

public class FindMinimumInArray {

	public static int getMinimum(int [] arr) {
		
		int aabhiTakMinimum=arr[0];
		int TuheKaha=0; // index
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]< aabhiTakMinimum) {
				aabhiTakMinimum=arr[i];
				TuheKaha=i;
			}
		}
		return TuheKaha;
	}
	
	public static int getMinimumInRange(int [] arr, 
			int l, int r) {
		
		int aabhiTakMinimum=arr[l];
		int TuheKaha=l; // index
		
		for(int i=l+1;i<=r;i++) {
			
			if(arr[i]< aabhiTakMinimum) {
				aabhiTakMinimum=arr[i];
				TuheKaha=i;
			}
		}
		return TuheKaha;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {10,2,-1,3,5,-10,2};
      System.out.println(getMinimum(arr));
      
	}

}
