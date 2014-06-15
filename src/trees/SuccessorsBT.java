package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class SuccessorsBT {

  public static Node1 getLeftMost(Node1 node){
    Node1 temp = node;
    while (temp.getLeft() != null){
      temp = temp.getLeft();
    }
    return temp;
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
        return getLeftMost(node.parent.right);
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
    //If node is a parent , return its left child, else return its right child
    if(node.getLeft() != null){
      return node.getLeft();
    }

    if(node.getRight() != null){
      return node.getRight();
    }

    // If it does not have a left or right child , return its parent's right child, else return null
    if(node.parent.getLeft() == node)
      return node.parent.getRight();
    else
      return null;

  }

  public static Node1 inOrderSuccessor(Node1 root){
    return null;
  }
}
