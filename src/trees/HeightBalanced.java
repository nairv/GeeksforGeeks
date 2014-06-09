package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class HeightBalanced {
  public static boolean isHeightBalanced(Node root){
    if(Math.abs(HeightOfTree.getHeight(root.getLeft())- HeightOfTree.getHeight(root.getRight())) > 1)
      return false;
    else
      return true;
  }
}
