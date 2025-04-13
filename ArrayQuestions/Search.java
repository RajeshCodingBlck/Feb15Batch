package ArrayQuestions;

public class Search {

	
	public static boolean isPresent(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
//			System.out.println(i);
			if(arr[i]==target) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static int isPresent2(int []  arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
//			System.out.println(i);
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,20,30,10,4, 8,5};
       int target=80;
       System.out.println(isPresent2(arr, target));
       
	} 

}
