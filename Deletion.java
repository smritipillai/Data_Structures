
import java.util.Scanner;

class Node{
  Node next;
  int data;
  public Node(int data){
    //initialising entered values
    this.data=data;
    this.next=null;
  }
}
  class LinkedList{
    Node head;
    public LinkedList(){

      //initialising head as null
      this.head=null;
    }
public void append(int data){

  //creating an instance using new
  Node n=new Node(data);
  if(head==null)
    head=n;               //append the entered data if head points to null

  else
  {
    Node temp;

    //append the data till until it encounters next
    for(temp=this.head; temp.next!=null; temp=temp.next);
      temp.next=n;
  }
}

public void print(){
  Node m;
  for(m=this.head; m!=null; m=m.next){
    System.out.println(m.data);
  }
 }
 public void delete(int position){
   //if there's no data present
   if(head==null)
   return;

   Node temp = head;   //storing the value of head in temp variable
   if(position == 0){
    head=temp.next;     //changing the value of head as next node value
   }
   for(int i=0; temp!=null && i<position-1; i++){
     temp=temp.next;
   }
   if(temp==null && temp.next==null)   //if the position is greatr than no. of nodes
   return;
                                 // temp is initially pointing at head
   Node next= temp.next.next;   //and temp.next.next is the value after the deleted node.
   temp.next=next;
   }
}

 public class Deletion{
 public static void main(String[] args){
   LinkedList l = new LinkedList();
     l.append(5);
     l.append(6);
     l.append(2);
     l.append(3);
     l.append(4);
     Scanner scan= new Scanner(System.in);
     System.out.println("entered linked list is: ");
     l.print();
     int t;
     System.out.println("enter the position which is to be deleted: ");
     t=scan.nextInt();
     l.delete(t);
     System.out.println("list after deletion: ");
     l.print();
   }
 }
