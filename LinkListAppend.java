public class Node{
  Node next;
  int data;
  public node(int data){
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
  //append the entered data if head points to null
    head=n;
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
}
public static void main(String[] args){
  LinkedList l= new LinkedList(){
    l.append(5);
    l.append(6);
    l.append(2);
    l.print();
  }
}
