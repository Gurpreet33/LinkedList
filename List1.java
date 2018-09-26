package ctci;

public class List1 {
    int data;
    List1 next;
	private List1 head1;
    List1(int data)
    {
    	this.data=data;
    }
	public static List1 insertbeg(List1 head,int data)
	{
		List1 node=new List1(data);
		node.next=head;
		head=node;
		return head;
	}
	
	public static void print(List1 head)
	{
		while(head!=null)
		{
			System.out.print(head.data + " ");
			head=head.next;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		List1 head1=null;
		for(int i=10;i>0;i--)
		head1=insertbeg(head1,i);
		print(head1);
		
		List1 head2=null;
		for(int i=20;i>10;i--)
		head2=insertbeg(head2,i);
		print(head2);
		
		 List1 temp = head1;
		 temp=temp.next.next.next;
		 List1 temp1=head2;
		 while(temp1.next!=null)
			 temp1=temp1.next;
		 temp1.next=temp;
		 
		 
		 List1 res=func(head1,head2);
		
	}
   
   
	
}
