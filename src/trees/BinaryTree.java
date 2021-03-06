package trees;

/**
 * Created by vineet on 6/7/14.
 * Template for creating a Binary tree
 *        10
 *      /    \
 *    5       15
 *   /  \    /   \
 * 2    8   12    18
 *
 */
public class BinaryTree {
  Node root = null;

  BinaryTree(){
    root = new Node(10);
    Node l1 = new Node(5);
    Node r1 = new Node(15);
    root.setLeft(l1);
    root.setRight(r1);
    l1.setLeft(new Node(2));
    l1.setRight(new Node(8));
    r1.setLeft(new Node(12));
    r1.setRight(new Node(18));
  }
}
