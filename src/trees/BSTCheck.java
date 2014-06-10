package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class BSTCheck {

  /*
  This recursive function passes the bounding values to check whether the
  childrens' values lie in the range
   */
  public static boolean isBST(Node root , int min , int max){

    // First checks if the current node is null
    // If yes , return true
    if(root == null) return true;

    // If the current node's value does not lie between the min and max values
    // return false
    if(root.getData() < min || root.getData() > max)
      return false;

    // Now check for the subtrees satisfying the property
    //
    return
      isBST(root.getLeft() , min , root.getData()-1) && isBST(root.getRight() , root.getData()+1 , max);
  }

  /*
  This function does an inorder traversal and keeps a track of
  prev node and checks condition for current node value to be greater than prev node value
   */
  public static boolean isBST(Node root , Node prev){
    //If it is a null node return true
    if(root == null) return true;

    // If the left subtree returns false , return false
    if(!isBST(root.getLeft() , prev))
      return false;

    // Get the prev node value
    int prevData = (prev== null)? Integer.MIN_VALUE:prev.getData();

    // Check condition for present node value to be greater than
    // Prev node value , else return false
    if(root.getData()< prevData) return false;

    // Assign current node to prev node before traversing the right subtree
    prev = root;

    //Do the same on the right subtree
    if(!isBST(root.getRight() , prev))
      return false;

    // If everything is fine , return true
    return true;
  }
}
