package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class ChildrenSumProperty {
  public static boolean isChildrenSumProperty(Node root){
    //If the node is a leaf or if the node is null
    // return true
    if(root == null || (root.getLeft() == null && root.getRight()== null) ){
      return true;
    }



    int left = root.getLeft()== null? 0:root.getLeft().getData();
    int right = root.getRight()== null?0:root.getRight().getData();

    if( (root.getData() == left + right) && isChildrenSumProperty(root.getLeft()) && isChildrenSumProperty(root.getRight())){
      return true;
    }
    else
      return false;
  }
}
