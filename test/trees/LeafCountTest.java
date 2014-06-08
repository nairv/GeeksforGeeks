package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/8/14.
 */
public class LeafCountTest {
  @Test
  public void testGetLeafCount() throws Exception {
    BinaryTree bt = new BinaryTree();
    Assert.assertEquals("Should be equal" , LeafCount.getLeafCount(bt.root) ,4);

  }
}
