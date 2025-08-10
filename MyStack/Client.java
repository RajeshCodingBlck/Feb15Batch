package MyStack;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyStack st= new MyStack();
		
		st.push(12);
		st.push(13);
		st.push(20);
		st.push(-1);
		
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.size());
		st.pop();
		st.pop();
		System.out.println(st.peek());
		
		
	}

}
