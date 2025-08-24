package MyLinkedListPkg;

public class MyLinkedList {

	
	Node head=null;
	
	// Insert AtBegin
	public void insertAtBegin(int val) {
		// Creation of New Node
		Node newNode= new Node(val);
		newNode.next=head;
		head=newNode;
	}
	
	public void display() {
		
		Node temp= head;
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void insertAtEnd(int val) {
		
		if(head==null) {
			
			insertAtBegin(val);
			return;
		}
		Node newNode= new Node(val);
		Node temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		temp.next=newNode;	
	}
	
	public int getSize() {
		
		int count=0;
		Node temp=head;
		
		while(temp !=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void deleteAtBegin() {
		
		if(head==null) {
			return;
		}
		Node temp2=head.next;
		head.next=null;
		head=temp2;
	}
	
	public void deleteAEnd() {
		
		if(head==null) {
			return ;
		}else if(head.next==null) {
			
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next=null;
		
	}
}
