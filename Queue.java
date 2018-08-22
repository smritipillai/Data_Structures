class Node {
  int data;
  Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;
  public LinkedList() {
    this.head = null;
  }
  public void Append(int data) {
    Node newnode = new Node(data);
    if(head == null)
      head = newnode;
    else
    {
      Node temp;
      for(temp = this.head; temp.next != null; temp = temp.next);
        temp.next = newnode;
    }
  }
  public void print(){
    Node n;
    for(n = this.head; n != null; n = n.next){
      System.out.println(n.data);
    }
  }
  public void delete() {
    Node temp = head;
    head = head.next;
    temp.next = null;
  }
}

public class Queue {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.Append(34);
    l.Append(12);
    l.Append(56);
    l.Append(23);
    l.Append(33);
    System.out.println("After insertion ");
    l.print();
    System.out.println("After first deletion");
    l.delete();
    l.print();
    System.out.println("After second deletion");
    l.delete();
    l.print();
  }
}
