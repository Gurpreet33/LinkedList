package ctci;

public class SumList {
    int data;
    SumList next;
	
	SumList(int data)
	{
		this.data=data;
	}
	
	public static SumList insertend(SumList head,int data)
	{
		SumList node=new SumList(data);
		if(head==null)
		{
			head=node;
			return head;
		}
		SumList temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
		return head;
		
	}
	public static SumList insertbeg(SumList head,int data)
	{
		SumList node=new SumList(data);
		node.next=head;
		head=node;
		return head;
	}
	
	public static void print(SumList head)
	{
		while(head!=null)
		{System.out.print(head.data+" ");
		head=head.next;
		}
		System.out.println();
	}
	
	public static int compute(SumList head)
	{   int sum=0;
		if(head.next!=null)
		 sum=compute(head.next);
		sum=sum*10+head.data;
		return sum;
		
	}
	public static void main(String[] args) {
		SumList head1=null;
		SumList head2 =null;
		head1=insertend(head1,7);
		head1=insertend(head1,1);
		head1=insertend(head1,6);
		print(head1);
		head2=insertend(head2,5);
		head2=insertend(head2,9);
		head2=insertend(head2,2);
		print(head2);
      
		int a1=compute(head1);
		
		int a2=compute(head2);
		int sum=a1+a2;
		SumList head3=null;
		while(sum!=0)
		{
			int temp=sum%10;
			head3=insertbeg(head3,temp);
			sum=sum/10;
		}
		
		print(head3);
	}

}
