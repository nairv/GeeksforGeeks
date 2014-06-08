package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class MirrorTree {
  public static void mirror(Node root){
    if(root == null)
      return;

    //Swap elements in the left and right children
    mirror(root.getLeft());
    mirror(root.getRight());

    // Swap the elements in this node
    Node temp = root.getLeft();
    root.setLeft(root.getRight());
    root.setRight(temp);

  }
  public static void main(String args[])
  {
    BinaryTree bt = new BinaryTree();
    InorderTraversal.printInorder(bt.root);

    mirror(bt.root);
    System.out.println("\nMirror tree after conversion:");
    InorderTraversal.printInorder(bt.root);

  }
}
