package trees;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/9/14.
 */
public class BSTCheckTest {
  @Test
  public void testIsBST() throws Exception {
    BinaryTree bt = new BinaryTree();
    Assert.assertTrue("BSTCheck should return true ", BSTCheck.isBST(bt.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
     bt.root.setData(40);
    Assert.assertFalse("BSTCheck should return false" ,BSTCheck.isBST(bt.root, Integer.MIN_VALUE, Integer.MAX_VALUE) );
  }

  @Test
  public void testIsBST1() throws Exception {
    BinaryTree bt = new BinaryTree();
    org.junit.Assert.assertTrue("BST Check should return true " , BSTCheck.isBST(bt.root , null));

    bt.root.getRight().setData(5);
    org.junit.Assert.assertFalse("BST Check should return false now" , BSTCheck.isBST(bt.root , null));
  }
}
