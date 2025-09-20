package Prioritypkg;

import java.util.PriorityQueue;

public class PriorityQueueInBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Integer> pq= new PriorityQueue();
      
      pq.add(-10);
      pq.add(-20);
      pq.add(-3);
      
      System.out.println(-1*pq.peek());
      System.out.println(pq);
      pq.remove();
      System.out.println(pq);
      System.out.println(pq.size());
      
      
	}

}
