package trees;
import utils.PNode;
import utils.Node;

import java.util.Stack;

/**
 * Created by vineet on 9/20/14.
 */
public class BinaryTreeQuestions {

  /*
    Given a Node in a binary Tree with Node parent pointers
    find the inorder successor

    The
   */
  public static PNode getInorderSuccessor(PNode node){
    System.out.println("Current Node Data :"+ node.getData());
    //If the current node is root
    if(node.getParent() == null){
      if(node.getRight() == null)
        return new PNode(-1);
      else{
        return getLeftMostOfRightSubtree(node);
      }
    }

    //If current node is left child of its parent
    if(node.getParent().getLeft() == node){
      //If node does not have a right subtree
      if(node.getRight() == null){
        return node.getParent();
      }

      //if the node has a right child
      else{
        return getLeftMostOfRightSubtree(node);
      }
    }

    //If current node is right child of its parent
    else{

      //If current node has a right child
      if(node.getRight() != null){
        return getLeftMostOfRightSubtree(node);
      }

      //If current node does not have a right child
      //Traverse up until you reach a node which is the left child of its parent
      //If that node has a parent return the parent
      //If that node does not have a parent , you have reached the root, return null
      else{
        PNode temp = node.getParent();
        while(temp != null && temp == temp.getParent().getRight()){
          temp = temp.getParent();
        }
        if(temp == null)
          return new PNode(-1);
        else{
          return temp.getParent();
        }
      }

    }
  }

  public static PNode getLeftMostOfRightSubtree(PNode root){
    // Assuming right subtree exists
    // Do check before calling this function
    PNode temp = root.getRight();
    while( temp.getLeft() != null){
      temp = temp.getLeft();
    }
    return temp;

  }

  public static PNode getPostOrderSuccessor(PNode node){
    System.out.println("Current Node Data :"+ node.getData());

    //If current Node is a root
    if(node.getParent() == null){
      return new PNode(-1);
    }

    //If current Node is the right child of its parent
    if(node == node.getParent().getRight()){
      return node.getParent();
    }

    //If current Node is the left child of its parent
    else{
      //Node
      if(node.getParent().getRight() == null)
        return node.getParent();
      else
        return getLeftMostOfRightSubtree(node.getParent());
    }
  }



  public static PNode getPreOrderSuccessor(PNode node){
    System.out.println("Current Node :"+node.getData());
    if(node.getLeft()!= null || node.getRight() != null){
      return node.getLeft()!= null?node.getLeft():node.getRight();
    }
    if(node.getParent() == null) return new PNode(-1);
    if(node.getParent().getLeft() == node){
      if(node.getParent().getRight() != null)
        return node.getParent().getRight();
      else
        return new PNode(-1);
    }
    else{
      PNode temp = node.getParent();
      while(temp != null && temp == temp.getParent().getRight()){
        temp = temp.getParent();
      }
      if(temp == null)
        return new PNode(-1);
      else{
        return temp.getParent().getRight();
      }
    }
  }


  //Check if two nodes are cousins in a binary tree


  //Find the level of a node in a tree
  public static int getLevel(PNode root , PNode currentNode , int level){
    if(root == null) return 0;
    if(root == currentNode) return level;

    int l = getLevel(root.getLeft(), currentNode, level + 1);
    if(l != 0 )return l;

    int r = getLevel(root.getRight(), currentNode, level + 1);
    if(r != 0 )
      return r;
    else
      return 0;
  }

  /*
    Get the maximum lateral width of a Binary tree
   */
  public static int getMaxWidth(PNode root){
    Stack<PNode> s1 = new Stack<PNode>();
    Stack<PNode> s2 = new Stack<PNode>();

    int maxWidth = 0;
    s1.push(root);
    while(!s1.empty() || !s2.empty()){
      if(maxWidth < s1.size())
        maxWidth = s1.size();

      while(!s1.empty()){
        PNode temp = s1.pop();
        if(temp.getLeft() != null)
          s2.push(temp.getLeft());

        if(temp.getRight() != null)
          s2.push(temp.getRight());
      }

      if(maxWidth < s2.size())
        maxWidth = s2.size();

      while(!s2.empty()){
        PNode temp = s2.pop();
        if(temp.getRight() != null)
          s1.push(temp.getRight());

        if(temp.getLeft() != null)
          s1.push(temp.getLeft());
      }

    }
    return maxWidth;
  }
}
