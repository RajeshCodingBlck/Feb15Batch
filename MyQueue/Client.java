package MyQueue;

public class Client {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		MyQueue q= new MyQueue();
		
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.front());
		
		
	}

}
