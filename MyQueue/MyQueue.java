package MyQueue;

import java.util.ArrayList;

public class MyQueue {

	ArrayList<Integer> arr;

	MyQueue() {
		arr = new ArrayList();
	}

	public boolean isEmpty() {
     
		return arr.size()==0;
	}

	public void enqueue(int val) {

		arr.add(val);
	}

	public int dequeue() throws Exception {

		
		if(isEmpty()) {
//			System.out.println("Queue is Empty");
			Exception e1=new Exception("Queue is Empty");
			throw e1;
			//return -1;
		}
		int val= arr.get(0);
		arr.remove(0);
		return val;
	}

	public int front() throws Exception {

		if(isEmpty()) {
			Exception e1=new Exception("Queue is Empty");
			throw e1;
		}
		
		int val= arr.get(0);
		//arr.remove(0);
		return val;
	}

}
