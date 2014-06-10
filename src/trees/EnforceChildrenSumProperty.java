package trees;

/**
 * Created by vineet on 6/9/14.
 * Question: Given an arbitrary binary tree, convert it to a binary tree that holds Children Sum Property.
 * You can only increment data values in any node (You cannot change structure of tree and cannot decrement value of any node).

 For example, the below tree doesn’t hold the children sum property, convert it to a tree that holds the property.

          50
        /    \
      /        \
    7             2
   /  \           /\
  /    \         /  \
 3      5      1     30
 */
public class EnforceChildrenSumProperty {
  public static void increment(Node root , int diff){
    if(root.getLeft() != null){
      root.getLeft().setData(root.getLeft().getData()+diff);
      increment(root.getLeft() , diff);
    }
    else if(root.getRight() != null){
      root.getRight().setData(root.getRight().getData() + diff);
      increment(root.getRight() , diff);

    }
  }
  public static void convertTree(Node root){
    if(root == null || (root.getLeft() == null && root.getRight() == null))
      return;

    convertTree(root.getLeft());
    convertTree(root.getRight());

    int left = root.getLeft()== null? 0:root.getLeft().getData();
    int right = root.getRight()== null?0:root.getRight().getData();

    int diff = left + right - root.getData();

    if(diff > 0){
      root.setData(root.getData()+ diff);
      return;
    }
    if(diff < 0){
      diff = - diff; // Make diff positive
      increment(root , diff);

    }
  }
}
