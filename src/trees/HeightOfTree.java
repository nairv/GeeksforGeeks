package trees;

/**
 * Created by vineet on 6/7/14.
 * Gets the height of the tree recursively
 */
public class HeightOfTree {
  public static int max(int x , int y){
    return x>y? x:y;
  }
  public static int getHeight(Node root){
    if(root == null){
      return 0;
    }
    else{
      return 1+max(getHeight(root.getLeft()),getHeight(root.getRight()));
    }
  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    System.out.println("Height of the tree :"+ (getHeight(bt.root)-1));
  }
}
