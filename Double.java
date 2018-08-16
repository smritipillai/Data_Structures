import java.util.*;
class Node {
  int data;
  Node next;
  Node prev;

  //initializing next and prev as null
  public Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class LinkedList {
  Node head;
  public LinkedList() {
    this.head = null;
  }

  /*if head is null then the list is empty and therefore
  the entered value is added as an element else the value is added
  as the next element in the list */

  public void append (int data) {
    Node new_node = new Node(data);
    if(head == null)
      head = new_node;
    else
    {
      Node temp;
      for(temp = this.head;temp.next != null;temp = temp.next);
        temp.next = new_node;
        temp.prev = temp;
    }
  }
  public void print(){
    Node n;
    for(n = this.head; n!= null; n = n.next){
      System.out.println(n.data);
    }
 }

 /* when head is null it returns and if position is 0 then head is to its next node*/
 public void delete(int position) {
   Node temp = head;
   if(head == null)
     return;
   if (position == 0) {
     head = temp.next;
     return;
   }
   for(int i = 0; temp != null && i < position-2; i++) {
     temp = temp.next;
   }
   Node next = temp.next.next;           // next will be the node after the deleted node.
   temp.next = next;
   Node prev = temp.prev.prev;
   temp.prev = prev;
 }
}


public class Double{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.append(2);
    l.append(9);
    l.append(6);
    l.append(1);
    l.append(5);
    l.append(22);
    l.append(10);
    l.append(16);
    Scanner s = new Scanner (System.in);
    System.out.println("the linked list is");
    l.print();
    System.out.println("Enter the position at which the element must be deleted");
    int	t = s.nextInt();
    l.delete(t);
    System.out.println("linked list after deletion is:");
    l.print();
  }
}
