package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class PostOrderTraversal {
  public static void printPostOrderRecursive(Node root){
    if(root == null) return;

    printPostOrderRecursive(root.getLeft());
    printPostOrderRecursive(root.getRight());

    System.out.print(root.getData() + "\t");


  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    printPostOrderRecursive(bt.root);
  }
}
