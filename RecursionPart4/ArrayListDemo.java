package RecursionPart4;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		// CRUD
		arr.add(1);
		arr.add(12);
		arr.add(13000);
		
		System.out.println(arr);
		
		// Read
		arr.add(14);
		System.out.println(arr.get(3));
		
		
		// Update
//		arr[1]=15;
		arr.set(1, 20);
		System.out.println(arr);
		
		//remove
		
		arr.remove(1);
		System.out.println(arr);
		
		
		
		// iteration
		System.out.println(arr.size());
		
		for(int i=0; i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
//		int [] arr2= {10,2,3,4,};
//		
//		for(int val : arr2 ) {
//			
//			System.out.print(val+" ");
//		}
		
		System.out.println();
		
		for( int val: arr) {
			
			if(val== Integer.valueOf(13000)) {
				System.out.println("Hello");
			}else {
				System.out.println(val);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
