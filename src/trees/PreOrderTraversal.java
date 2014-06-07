package trees;

/**
 * Created by vineet on 6/7/14.
 */
public class PreOrderTraversal {
  public static void printPreOrderRecursive(Node root){
    if(root == null) return;
    else
      System.out.print(root.getData() + "\t");

    printPreOrderRecursive(root.getLeft());
    printPreOrderRecursive(root.getRight());
  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    printPreOrderRecursive(bt.root);
  }
}
