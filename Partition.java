package ctci;
import java.util.*;

public class Partition {
   
	 int data;
	 Partition next;
	 Partition(int data)
	 {
		 this.data=data;
	 }
	
	 public static Partition insertend(Partition head, int data)
	 {
		 Partition node=new Partition(data);
		 if(head==null)
		 {
			 head=node;
			 return head;
		 }
		 Partition temp=head;
		 while(temp.next!=null)
			 temp=temp.next;
		 temp.next=node;
		 return head;
	 }
	 
	 public static void print(Partition head)
	 {
		 while(head!=null)
		 {
			 System.out.print(head.data+ " ");
			 head=head.next;
		 }
		 System.out.println();
	 }
	 
	 public static Partition partitionfunc(Partition head,int p)
	 {
		 Partition temp1=head.next;
		 Partition temp2=head;
		
		 
		 
		 while(temp1!=null && temp2!=null)
		 {
			 if(temp1.data>=p && temp2.data<p)
			 {
				 temp2=temp2.next;
				 temp1=temp1.next;
			 }
			 else if(temp1.data >=p && temp2.data>=p)
				 temp1=temp1.next;
			 else if(temp1.data < p && temp2.data<p)
				   temp2=temp2.next;
			 else if(temp1.data<p&&temp2.data>=p)
			  {
				 int tem=temp1.data;
				 temp1.data=temp2.data;
				 temp2.data=tem;
				 temp1=temp1.next;
				 temp2=temp2.next;
			 }
			 
			 
		 }
		 return head;
		 
	 }
	 
	public static void main(String[] args) {
	  Partition head=null;
	  for(int i=0;i<10;i++)
	  {
		  if(i%2==0)
		  head=insertend(head,i+20);
		  else
		head=insertend(head,i+10);
	  }
	  print(head);
	  
	  Scanner sc=new Scanner(System.in);
	  int p=sc.nextInt();
	  head=partitionfunc(head,p);
	  print(head);
	  
	  sc.close();
	  
	  

	}

}
