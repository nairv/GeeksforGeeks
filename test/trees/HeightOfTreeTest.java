package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/8/14.
 */
public class HeightOfTreeTest {
  @Test
  public void testGetHeight() throws Exception {
    BinaryTree bt = new BinaryTree();
    bt.root.getLeft().getLeft().setLeft(new Node(1));

    Assert.assertEquals("TestEqual" , HeightOfTree.getHeight(bt.root)-1 , 3);
  }
}
