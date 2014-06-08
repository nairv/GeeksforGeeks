package trees;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trees.LowestCommonAncestor;
import static org.junit.Assert.assertEquals;
/**
 * Created by vineet on 6/8/14.
 */
public class LowestCommonAncestorTest {
  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testLca() throws Exception {
    BinaryTree bt = new BinaryTree();
    assertEquals("The test passed" , LowestCommonAncestor.lca(bt.root , 5 , 18) , 10);
    //Assert.failNotEquals();
    Assert.assertNotSame("The test should fail" , LowestCommonAncestor.lca(bt.root , 15 , 12) , 10);
  }
}
