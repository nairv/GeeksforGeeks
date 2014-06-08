package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class IdenticalTree {
  public static boolean checkIdentical(Node root1 , Node root2){
    if(root1 == null && root2 == null)
      return true;

    if(root1.getData() == root2.getData()){
      return checkIdentical(root1.getLeft(),root2.getLeft()) && checkIdentical(root1.getRight(),root2.getRight());
    }
    return false;
  }
  public static void main(String args[]){
    BinaryTree bt1 = new BinaryTree();
    BinaryTree bt2 = new BinaryTree();
    bt2.root.setData(100);

    System.out.print("Two trees are identical :"+ checkIdentical(bt1.root, bt2.root));
  }
}
