package Prioritypkg;

import java.util.PriorityQueue;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {10,2,1,45,30};
		
		PriorityQueue<Integer> pq= new PriorityQueue();
		
	    for(int i=0;i<arr.length;i++) {
	    	pq.add(arr[i]);
	    }
	    
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=pq.remove();
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	}

}
