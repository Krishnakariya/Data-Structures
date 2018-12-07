public class LinkedList {
	private Node head;
	public void insertAtEnd(int d) {
		if(head==null) {
			Node a=new Node();
			a.data=d;
			a.next=null;
			head=a;
		}
		else {
			Node head1=head;
			Node a=new Node();
			a.data=d;
			a.next=null;
			head1.next=a;
			}
	}
	public void insertAtStart(int d) {
		if(head==null) {
			Node a=new Node();
			a.data=d;
			a.next=null;
			head=a;
			}
		else {
			 Node newhead=new Node();
			 newhead.data=d;		
			 newhead.next=head;
			 head=newhead;
		}
	}
	public void deleteNode(int d) {
		Node prev=null;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==d)
			{
				if(prev!=null) {
					prev.next=temp.next;
				}
				else {
					temp=temp.next;
				}
				return;
			}		
			prev=temp;
			temp=temp.next;
		}
	}
	public void print(){
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
class Node{
	int data;
	Node next;
}