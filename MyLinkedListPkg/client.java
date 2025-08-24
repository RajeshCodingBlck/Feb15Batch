package MyLinkedListPkg;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		Node n1= new Node(10);
//		Node n2= new Node(20);
//		Node n3= new Node(30);
//		
//		
//		// creation of link
//		n1.next=n2;
//		n2.next=n3;
//		
//		Node n4= new Node(40);
//		
//		n3.next=n4;
//		
//		
//		Node temp=n1;
//		
//		while(temp !=null) {
//			System.out.print(temp.data +" -> ");
//			 temp= temp.next;
//		}
		
		
		MyLinkedList ls= new MyLinkedList();
		
		ls.insertAtBegin(10);
		ls.insertAtBegin(20);
		ls.insertAtBegin(30);
		
		ls.insertAtEnd(40);
		
		ls.display();
		
		ls.deleteAtBegin();
		System.out.println();
		ls.display();
		
		ls.deleteAtBegin();
		System.out.println();
		ls.display();
		
	}

}
