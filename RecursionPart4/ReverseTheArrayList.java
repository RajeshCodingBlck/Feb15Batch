package RecursionPart4;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArrayList {

	
	public static void reverse(ArrayList<Integer> arr) {
		
		
		int i=0;
		int j=arr.size()-1;
		
		while(i<j) {
			
			// Swap
//			int temp=arr[i];
			int temp= arr.get(i);
//			arr[i]=arr[j];
			arr.set(i,arr.get(j) );
//			arr[j]=temp;
			arr.set(j, temp);
			
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr= new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		reverse(arr);
		System.out.println(arr);
		
		
		
	}

}
