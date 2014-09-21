package trees;
import utils.Node;

/**
 * Created by vineet on 9/20/14.
 * Find the Lowest Common Ancestor of two Nodes in a BST
 *
 * Since it is a BST , and it is the nodes are ordered we can traverse the tree from the root to the LCA of the two nodes
 */
public class LCABst {
  static Node root;
  public static Node getLCA(Node temp , Node a , Node b){
    int aData = a.getData();
    int bData = b.getData();
    int tempData = temp.getData();

    if(aData == tempData || bData == tempData || (aData < tempData && bData > tempData ) ){
      return temp;
    }
    else if(aData < tempData && bData < tempData){
      return getLCA(temp.getLeft() , a , b);
    }
    else if(aData > tempData && bData > tempData){
      return getLCA(temp.getRight() , a , b);
    }
    else
      return null;

  }
}
