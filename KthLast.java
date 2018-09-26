package ctci;

import java.util.Scanner;

public class KthLast {
	int data;
	KthLast next;
	KthLast(int data)
	{
		this.data=data;
	}
	
	public static KthLast insertend(KthLast head,int data)
	{
		KthLast node=new KthLast(data);
		KthLast temp=head;
		if(head==null)
		{
			head=node;
			return head;
		}
		while(temp.next!=null)
			temp=temp.next;
		temp.next=node;
		return head;
		
	}
	
	public static void print(KthLast head)
	{
		while(head!=null)
		{
			System.out.print(head.data +" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static int KthElement(KthLast head,int k)
	{
		int i=0;
		KthLast prev=head;
		KthLast temp=head;
		while(temp.next!=null)
		{   
			if(i==k)
			{
			  prev=prev.next;
			}
			else
				i++;
			
			temp=temp.next;
		
			
		}
		return prev.data;
			
	}
	
	
	public static void main(String[] args) {
		KthLast head=null;
		for(int i=0;i<10;i++)
			head=insertend(head,i+15);
		 print(head);
		 
		 Scanner sc=new Scanner(System.in);
		 int k=sc.nextInt();
		 int a=KthElement(head,k);
		 System.out.println(a);
		 
		 sc.close();
	}

}
