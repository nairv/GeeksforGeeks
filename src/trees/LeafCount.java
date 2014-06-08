package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class LeafCount {
  public static int getLeafCount(Node root){
    if(root == null) return 0;
    if(root.getLeft()== null && root.getRight()== null)
      return 1;
    else
      return getLeafCount(root.getLeft()) + getLeafCount(root.getRight());
  }
}
