package ctci;
import java.util.*;

public class RemoveDups {
   
	 int data;
	 RemoveDups next;
	 RemoveDups(int data)
	 {
		 this.data=data;
		 this.next=null;
	 }
	 
	 public static RemoveDups insertend(RemoveDups head,int data)
	 {   RemoveDups node=new RemoveDups(data);
		 RemoveDups temp=head;
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
	
	 public static void print(RemoveDups head)
	 {
		 if(head==null)
			 return;
		 while(head!=null)
		 {
			 System.out.print(head.data + " ");
			 head=head.next;
			 
		 }
		 System.out.println();
	 }
	 
	 public static RemoveDups removeduplicates(RemoveDups head)
	 {   if(head==null)
		 return head;
		 HashSet<Integer> h1=new HashSet<Integer>();
		 RemoveDups temp=head;
		 RemoveDups prev=head;
		 while(temp!=null)
		 {
			 if(h1.contains(temp.data))
				 prev.next=temp.next;
			 else
			 {
				 h1.add(temp.data);
				 prev=temp;
				 
				 
			 }
			 temp=temp.next;
		 }
			 
		 return head;
		 
	 }
	 
	public static void main(String[] args) {
	
		RemoveDups head=null;
		for(int i=0;i<10;i++)
			head=insertend(head,i+10);
			
			head=insertend(head,12);
			head=insertend(head,13);
			head=insertend(head,16);
			head=insertend(head,17);
			head=insertend(head,18);
			print(head);
			head=removeduplicates(head);
			print(head);
			print(head);
	}

}
