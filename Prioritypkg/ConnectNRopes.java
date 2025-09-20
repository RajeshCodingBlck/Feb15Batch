package Prioritypkg;

import java.util.PriorityQueue;

public class ConnectNRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {4,3,2,6};
       
       PriorityQueue<Integer> pq= new PriorityQueue();
       
       for(int i=0;i<arr.length;i++) {
    	   pq.add(arr[i]);
       }
       
       int totalCost=0;
       while(pq.size()>1) {
    	   
    	   int val1= pq.remove();
    	   int val2= pq.remove();
    	   
    	   totalCost +=(val1+val2);
    	   pq.add(val1+val2);
       }
       System.out.println(totalCost);
       
	}

}
