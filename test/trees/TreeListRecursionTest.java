package trees;

import org.junit.Test;
/*

TO DO : NOT WORKING
 */
/**
 * Created by vineet on 6/8/14.
 */

public class TreeListRecursionTest {
  @Test


  public void testTreeToList() throws Exception {
    BinaryTree bt = new BinaryTree();
    InorderTraversal.printInorder(bt.root);
    Node head = TreeListRecursion.treeToList(bt.root);
    System.out.println();
    TreeListRecursion.printList(head);
  }
}
