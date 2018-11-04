public class MinHeap{
  static int n;
  int []arr;
  int size;
  public MinHeap(){
    this.n = n;
    size = 0;
    arr = new int[n+1];
  }
public void insert(int x){
    for(int i =0; i< n; i++){
      if(size == n){
        System.out.println("Tree is full");
      }
    size++;
    int s = size;
    arr[s]= x;
    bubbleUp(s);
    }
  }
  public void bubbleUp(int pos) {
    int parentId = pos/2;
    int currentId = pos;
    while (currentId > 0 && arr[parentId] > arr[currentId]) {

        swap(currentId,parentId);
        currentId = parentId;
        parentId = parentId/2;
    }
  }
  public void swap(int a,int b){
    int temp = a;
    a = b;
    b = temp;
  }
  public void display(){
    for(int i =0; i<n; i++){
      System.out.print("  " + arr[i]);
    }
  }
  public static void main(String[] args) {
      System.out.print("Original Array : ");
      MinHeap m = new MinHeap();
      m.display();
      System.out.println("Min-Heap : ");
      m.insert(3);
      m.insert(2);
      m.insert(1);
      m.insert(7);
      m.insert(8);
      m.insert(4);
      m.insert(10);
      m.insert(16);
      m.insert(12);
      m.display();
  }
}
