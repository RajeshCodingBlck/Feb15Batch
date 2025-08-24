package MyStack;

import java.util.Stack;

public class InBuitStack {

	
	public static void addAtBottom(Stack<Integer> st, int val) {
		
		
		Stack<Integer> temp=  new Stack();
		
		while(st.size()>0) {
			int data= st.pop();
			temp.push(data);
		}
		
		st.push(val);
		
		while(temp.size()>0) {
			int data= temp.pop();
			st.push(data);
		}
	
		
	}
	
	public static void addAtBottomMethod2(Stack<Integer> st, int val) {
		
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		
		int topElement= st.pop();
		addAtBottomMethod2(st, val);
		st.push(topElement);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Stack<Integer> st= new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st);
//		addAtBottomMethod2(st, 10);
		reverse(st);
		System.out.println(st);
		
//		System.out.println(st);
//		
//		st.push(12);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		System.out.println(st.peek());
//		System.out.println(st.size());
//		System.out.println(st.pop());
//		System.out.println(st.peek());

		
		
		
	}

}
