package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/8/14.
 */
public class DiameterBTTest {
  @Test
  public void testDiameter() throws Exception {
    BinaryTree bt = new BinaryTree();
    Assert.assertEquals("Diameter of the tree" , DiameterBT.diameter(bt.root) , 5);
  }
}
