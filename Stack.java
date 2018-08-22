class Stack{
  static int max = 1000;
  int top;
  int a[] = new int[max];
  boolean isEmpty(){
    if(top < 0)
    return true;
    else
    return false;
  }
  Stack(){
    top = -1;
  }
  boolean push(int x){
    if(top >=  max-1){
      System.out.println("stack overflow");
      return false;
    }
    else{
      a[++top] = x;
      return true;
    }
  }
  int pop(){
    if(top < 0){
      System.out.println("stack underflow");
      return 0;
    }
    else{
      int x = a[top--];
      return x;
    }
  }
  public static void main(String[] args){
    Stack s = new Stack();
    s.push(5);
    s.push(15);
    s.push(25);
    s.push(35);
    System.out.println(s.pop() + " is popped from the stack");
  }
}
