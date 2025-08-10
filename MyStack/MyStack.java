package MyStack;

import java.util.*;
public class MyStack {

	
	// state
	private ArrayList<Integer> arr;
	MyStack(){
		arr= new ArrayList();
	}
	
	public boolean isEmpty() {
	
		 if(arr.size()==0) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public int size() {
		
		return arr.size();
	}
	public void push(int val) {
		
		arr.add(val);
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		int val= arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return val;
	}
	
	public int peek() {
	  
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		int val= arr.get(arr.size()-1);
		//arr.remove(arr.size()-1);
		return val;
	}
	

}
