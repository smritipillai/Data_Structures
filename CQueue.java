public class CQueue{
  int front,rear,n;
  int arr[];
  public CQueue(int n){
    front = -1;
    rear = 0;
    this.n = n;
    arr = new int[n];
  }
  void Enqueue(int data){
    if((rear == n-1 && front == 0) || rear == front-1){
      System.out.println("Queue is full");
    }
    else if(rear == n-1 && front!= 0){
      rear = 0;
      arr[rear]=  data;
    }
    else if(front == -1){
      front = rear = 0;
      arr[rear] =  data;
    }
    else{
      rear++;
      arr[rear] = data;
    }
  }

int Dequeue(){
    if(front == -1){
      System.out.println("queue is empty");
      return 0;
    }
    int data = arr[front];
    arr[front] = -1;
    if( front == rear){
      front = -1;
      rear = -1;
    }
    else if(front == n-1){
      front = 0;
    }
    else front++;

    return data;
  }

  void print(){
    if(front == -1){
      System.out.println("is empty");
    }
    else if(rear>= front){
      for(int i = front; i<=rear; i++ ) {
        System.out.print(arr[i]+ " ");
      }
    }
      else{
        for(int i = front; i<=n; i++ ) {
          System.out.print(arr[i]+ " ");
        }
        for(int i = front; i<=rear; i++ ) {
          System.out.print(arr[i]+ " ");
        }
      }
    }
     public static void main(String[] args) {
       CQueue q =  new CQueue(5);
       q.Enqueue(10);
       q.Enqueue(20);
       q.Enqueue(30);
       q.Enqueue(40);
       q.print();
       System.out.println();
       System.out.println("deleted value: ");
       q.Dequeue();
       q.Dequeue();
       q.print();
       System.out.println();
       q.Enqueue(60);
       q.Enqueue(50);
       q.Enqueue(70);
       q.print();
       System.out.println();
       System.out.println("deleted value");
       q.Dequeue();
       System.out.println();
       q.Enqueue(80);
       q.print();
     }
   }
