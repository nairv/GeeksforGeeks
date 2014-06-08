package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class DeleteTree {

  public static void deleteTree(Node root){
    if(root == null) return;

    deleteTree(root.getLeft());
    deleteTree(root.getRight());
    root = null;

  }

  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();

    deleteTree(bt.root);

    System.out.println(bt.root.getLeft().getData());
  }
}
