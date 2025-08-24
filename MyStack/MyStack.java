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
	
	public int pop()  throws Exception{
		
		if(isEmpty()) {
//			System.out.println("Stack is Empty");
			
			 Exception e1= new Exception(" Stack khali ho chukka he ");
			 throw e1;
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
