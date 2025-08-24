package MyStack;

import java.util.Stack;

public class reverseTheStack {

//	static InBuitStack obj= new InBuitStack();
	public static void reverse(Stack<Integer> st) {

		if (st.size() == 0) {
			return;
		}

		int topElement = st.pop();
		reverse(st);
		InBuitStack.addAtBottomMethod2(st, topElement);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		
        st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		System.out.println(st);
//		addAtBottomMethod2(st, 10);
		reverse(st);
		System.out.println(st);
	}

}
