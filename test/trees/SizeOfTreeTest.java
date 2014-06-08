package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/8/14.
 */
public class SizeOfTreeTest {
  @Test
  public void testPrintSize() throws Exception {
    BinaryTree bt = new BinaryTree();
    Assert.assertEquals("Binary tree size " , SizeOfTree.printSize(bt.root) , 7);
  }
}
