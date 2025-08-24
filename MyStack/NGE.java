package MyStack;

import java.util.*;
public class NGE {

	
	public static int [] nge(int [] arr) {
		
		
		int [] result= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			result[i]=-1;
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]< arr[j]) {
					result[i]=arr[j];
					break;
				}
			}
		}
		
		return result;
		
	}
	
	public static int [] nge2(int [] arr) {
		
		int [] result= new int[arr.length];
		
		Stack<Integer> st= new Stack();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			while(st.size()>0 && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			
			if(st.size()==0) {
				result[i]=-1;
			}else {
				result[i]= st.peek();
			}
			
			st.push(i);
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {9,3,10,4,2,3,5,7};
      int [] result= nge2(arr);
      
      for(int val : result) {
    	  System.out.print(val+" ");
      }
      
	}

}
