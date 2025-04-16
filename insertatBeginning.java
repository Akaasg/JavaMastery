//Singly linked list insert at beginning 
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class Linkedlist {
	Node head,tail;
	void insertatBeginning( int data) {
		Node nn=new Node( data);
		{
			if(head==null)
			{
				head=nn;
				tail=nn;
			}
			else {
		           nn.next=head;
		           head=nn;
			}
		}
	}
	public void display() {
		System.out.println("Displaying elements in the Linkedlist");
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of Elements to be inserted in list:");
		int n=s.nextInt();
		Linkedlist l=new Linkedlist();
		for(int i=0; i<n; i++)
		{
			System.out.println("Insert element "+i+":");
			int a=s.nextInt();

			l.insertatBeginning(a);
		}
		l.display();
	}
}