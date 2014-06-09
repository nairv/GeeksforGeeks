package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class DiameterBT {
  public static int diameter(Node root){
    if(root == null) return 0;

    int lheight = HeightOfTree.getHeight(root.getLeft());
    int rheight = HeightOfTree.getHeight(root.getRight());

    int ldiameter = diameter(root.getLeft());
    int rdiameter = diameter(root.getRight());

    return Math.max(lheight+ rheight + 1 , Math.max(ldiameter , rdiameter));
  }
}
