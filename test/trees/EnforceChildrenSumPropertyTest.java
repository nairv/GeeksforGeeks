package trees;

import org.junit.Test;

/**
 * Created by vineet on 6/9/14.
 */
public class EnforceChildrenSumPropertyTest {
  @Test
  public void testConvertTree() throws Exception {
    BinaryTree bt = new BinaryTree();


    EnforceChildrenSumProperty.convertTree(bt.root);

    InorderTraversal.printInorder(bt.root);

  }
}
