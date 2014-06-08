package trees;

/**
 * Created by vineet on 6/7/14.
 */
public class SizeOfTree {
  public static int printSize(Node root){
    if(root == null)
      return 0;
    else{
      return 1 + printSize(root.getRight()) + printSize(root.getLeft());
    }
  }

  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    System.out.println("Size of the Tree :" + printSize(bt.root));
  }
}
