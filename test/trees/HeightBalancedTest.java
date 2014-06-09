package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/8/14.
 */
public class HeightBalancedTest {
  @Test
  public void testIsHeightBalanced() throws Exception {
    BinaryTree bt = new BinaryTree();
    Assert.assertTrue(HeightBalanced.isHeightBalanced(bt.root));

    bt.root.getLeft().getLeft().setLeft(new Node(1));
    Assert.assertTrue(HeightBalanced.isHeightBalanced(bt.root));

    bt.root.getLeft().getLeft().setRight(new Node(3));
    Assert.assertTrue(HeightBalanced.isHeightBalanced(bt.root));

    bt.root.getLeft().getLeft().getLeft().setLeft(new Node(-1));
    Assert.assertFalse(HeightBalanced.isHeightBalanced(bt.root));

  }
}
