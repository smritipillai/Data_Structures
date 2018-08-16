import java.util.Scanner;

class Node {
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
class LinkedList{
  Node head;
  public LinkedList(){
    this.head = null;
  }
  public void Append(int data){
    Node new_node = new Node(data);
    if(head == null)
    head = new_node;
    else {
      Node temp;
      for(temp = this.head; temp.next!=null; temp=temp.next)
      temp.next = new_node;
    }
  }

  public void print() {
    Node n;
    for(n = this.head; n!= null; n = n.next){
      System.out.println(n.data);
    }
  }
  public void delete(){
    if(head == null)
    return;
    Node temp = this.head;
    while(temp.next.next!= null){
      temp = temp.next;
    }
    temp.next = null;
    for(temp = this.head; temp!= null; temp = temp.next)
    System.out.println(temp.data);
  }
}

public class Queue {
  public static void main(String[] args){
    LinkedList l = new LinkedList();
    l.Append(55);
    l.Append(64);
    l.Append(24);
    l.Append(43);
    l.Append(10);
    System.out.println("after insertion: ");
    l.print();
    System.out.println("after deletion: ");
    l.delete();
  }
}
