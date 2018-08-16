import java.util.*;

public class Node{
  Node next;
  Node prev;
  int data;
  public Node(int data){
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}
class LinkedList{
  Node head;
  public LinkedList(){
    this.head = null;
  }
  public void append(int data){
    Node n = new Node(data);
    if(head==null)
    head = n;
    else
    {
      Node temp;
      for(temp = this.head; temp.next!=null; temp = temp.next);
        temp.next = n;
        temp.prev = temp;
    }
  }

public void print(){
  Node nl;
  for(nl = this.head; nl!=null; nl = nl.next){
    System.out.println(nl.data);
  }
 }

 public void delete(int position){
   Node temp = head;
   if(head == null)
   return;
   if(position == 0){
    head=temp.next;     //changing the value of head as next node value
   }
   for(int i = 0; temp!=null && i < position-1; i++){
     temp=temp.next;
   }
   if(temp==null && temp.next==null)   //if the position is greatr than no. of nodes
   return;
                                 // temp is initially pointing at head
   Node next= temp.next.next;   //and temp.next.next is the value after the deleted node.
   temp.next=next;
   Node prev = temp.prev.prev;
   temp.prev = prev;
   }
 }



public class Double{
  public static void main(String[] args){
    LinkedList l = new LinkedList();
    l.append(3);
    l.append(32);
    l.append(25);
    l.append(9);
    l.append(5);
    Scanner scan =new Scanner(System.in);
    System.out.print("the entered linked list is: "+ " ");
    l.print();
    System.out.println("enter the element to be deleted: ");
    int n = scan.nextInt();
    l.delete(n);
    System.out.println("the list after deleting data: ");
    l.print();
  }
}
