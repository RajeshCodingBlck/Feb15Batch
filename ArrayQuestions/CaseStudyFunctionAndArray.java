package ArrayQuestions;

public class CaseStudyFunctionAndArray {

	
	public static void swap(int [] arr, int [] brr) {
		
		int [] temp=arr;
		arr=brr;
		brr=temp;
	}
	
	public static void swap2(int [] arr, int [] brr) {
		
		int temp=arr[0];
		arr[0]=brr[0];
		brr[0]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//	  int [] arr= {1,2,3,4,5}; // declare and Inilization
//	  int [] brr= {10,20,30,40,50};
//	  System.out.println("before Swap "+ arr[0]+ " "+ brr[0]);
//	  swap(arr, brr);
//	  System.out.println("After Swap "+ arr[0]+ " "+ brr[0]);
		
		
		int [] arr= {1,2,3,4};
		int [] brr= {10,20,30,40};
		System.out.println("Before Swap "+ arr[0]+ " "+ brr[0]);
		swap2(arr, brr);
		System.out.println("Before Swap "+ arr[0]+ " "+ brr[0]);
		
	  
	  
	}

}
