package RecursionPart2;

public class SumOfArray {

	
	public static int Sum(int [] arr) {
		
	  if(arr.length ==0) {
		  return 0;
	  }
		
	  int []chhotaArray= new int[arr.length-1];
	  
	  for(int i=1;i<arr.length;i++) {
		  chhotaArray[i-1]= arr[i];
	  }
	  
	   int chhotaAns= Sum(chhotaArray);
	   int meraAns= arr[0]+ chhotaAns;
	   return meraAns;
	         
	}
	
	public static int SumMethod2(int [] arr , int i) {
		
		if(i==arr.length) {
			return 0;
		}
		int chhotaAns= SumMethod2(arr, i+1);
		int meraAns= arr[i]+ chhotaAns;
		return meraAns;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,2,3,4,5};
//		System.out.println(Sum(arr));
		
		System.out.println(SumMethod2(arr, 0));
		
		
	}

}
