package ComparatorPackage;

import java.util.*;


class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1 >o2) {
			return -1;
		}else {
			 return 1;
		}
	}
	
	
}
public class Demo1 {
   
	public static void main(String [] args) {
		
		ArrayList<Integer> arr= new ArrayList();
		
		arr.add(10);
		arr.add(12);
		arr.add(3);
		arr.add(14);
		
		Collections.sort(arr, new cmp());
		System.out.println(arr);
		
		
	}
}
