package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class SuccessorsBT {

  public static Node1 getRightTreeChildren(Node1 r){
    //If current Node does not have any children
    // return the current node
    if(r.getRight() == null && r.getLeft() == null)
      return r;

    //If current Node does not have a left subtree
    // Return the rightTreechildren of the right child
    if(r.getLeft() == null){
      return getRightTreeChildren(r.getRight());
    }
    else{
      return getRightTreeChildren(r.getLeft());
    }

  }

  public static Node1 postOrderSuccessor(Node1 node){
    //If node is the root , there is no post order successor,
    // return null
    if(node.parent == null)
      return null;

    //If node is the left child , you need to go to its parent's right child's
    // left most child node
    // if parent's right child is null , return parent
    if(node.parent.getLeft() == node){
      if(node.parent.getRight() != null)
        return getRightTreeChildren(node.parent.right);
      else
        return node.parent;
    }

    //If node is the right child of the parent return the parent
    if(node.parent.getRight() == node){
      return node.parent;
    }

    return null;
  }

  public static Node1 preOrderSuccessor(Node1 node){

    return null;
  }

  public static Node1 inOrderSuccessor(Node1 root){
    return null;
  }
}
