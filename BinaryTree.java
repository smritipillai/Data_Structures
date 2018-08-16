
class Node{
  int data;
  Node left,right;
  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
class BinaryTree{
  Node root;
  BinaryTree(Node root){
    this.root = root;
  }
  void insert(Node root, int data){
    if(data > root.data){
      if(root.left == null){
        Node new_node = new Node(data);
        root.left =new_node;
      }
      else
      insert(root.left, data);
    }
    else{
      if(root.right == null){
        Node new_node = new Node(data);
        root.right= new_node;
      }
      else
      insert(root.right, data);
    }
    return;
  }
  void print(Node root){
    if(root == null){
    return;
    }
    print(root.right);
    System.out.println(root.data);
    print(root.left);
  }

    public static void main(String[] args){
    BinaryTree t = new BinaryTree(new Node(55));
    t.insert(t.root,15);
    t.insert(t.root,60);
    t.insert(t.root,50);
    t.insert(t.root,11);
    t.insert(t.root,43);
    t.insert(t.root,78);
    t.print(t.root);
  }
 }
