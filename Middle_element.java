package CONCEPTS_Day3;


public class Middle_element {
	Node head;
	class Node
	{
		int data;                                                            
		Node next;                              
		Node(int val)                                   
		{
			data=val;
			next=null;
		}
	}
	public void insertABegin(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
	}
	public Middle_element()
	{
		head=null;
	}
	public void findMiddle() 
	{
	    if (head==null) 
	    {
	        System.out.println("The list is empty.");
	    }
        Node smid=head;
	    Node fmid=head;
        while (fmid!=null && fmid.next!=null) {
	        smid=smid.next;         
	        fmid=fmid.next.next;    
	    }
	    System.out.println("The middle element is: " + smid.data);
	}
	public void display()
	{
		Node temp=head;
        while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	 public static void main(String[] args) {
		 Middle_element list = new Middle_element();
		 list.insertABegin(5);
	        list.insertABegin(4);
	        list.insertABegin(3);
	        list.insertABegin(2);
	        list.insertABegin(1);
	        list.display();
	        list.findMiddle();
	        list.display();
	 }
}
