package trees;

/**
 * Created by Vineet Nair on 6/7/14.
 * Gets the height of the tree recursively
 */
public class HeightOfTree {

  public static int getHeight(Node root){
    if(root == null){
      return 0;
    }
    else{
      return 1+ Math.max(getHeight(root.getLeft()),getHeight(root.getRight()));
    }
  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    System.out.println("Height of the tree :"+ (getHeight(bt.root)-1));
  }
}
