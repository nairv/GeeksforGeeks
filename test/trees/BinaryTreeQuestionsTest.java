package trees;

import junit.framework.Assert;
import junit.framework.TestCase;
import utils.PNode;

/**
 * Created by vineet on 9/21/14.
 */
public class BinaryTreeQuestionsTest extends TestCase {
  public void testGetInorderSuccessor() throws Exception {
    PNode root = utils.PTestBST.getTestBST();
    Assert.assertEquals(8,BinaryTreeQuestions.getInorderSuccessor(root).getData());
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root.getLeft().getLeft()).getData());
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root.getLeft().getRight().getRight()).getData());

  }
}
