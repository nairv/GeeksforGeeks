package trees;

import junit.framework.Assert;
import junit.framework.TestCase;
import utils.PNode;

/**
 * Created by vineet on 9/21/14.
 */
public class BinaryTreeQuestionsTest extends TestCase {
  public void testGetInorderSuccessor() throws Exception {
    System.out.println("Running In order Tests ...");
    PNode root = utils.PTestBST.getTestBST();
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root).getData());
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root.getLeft().getLeft()).getData());
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root.getLeft().getRight().getRight()).getData());
    System.out.println(BinaryTreeQuestions.getInorderSuccessor(root.getLeft().getRight().getLeft()).getData());
  }


  public void testGetPreOrderSuccessor() throws Exception {
    System.out.println("Running Pre Order Test..");
    PNode root = utils.PTestBST.getTestBST();
    System.out.println(BinaryTreeQuestions.getPreOrderSuccessor(root).getData());
    System.out.println(BinaryTreeQuestions.getPreOrderSuccessor(root.getLeft().getLeft()).getData());
    System.out.println(BinaryTreeQuestions.getPreOrderSuccessor(root.getLeft().getRight().getRight()).getData());
    System.out.println(BinaryTreeQuestions.getPreOrderSuccessor(root.getLeft().getRight().getLeft()).getData());
  }


  public void testGetPostOrderSuccessor() throws Exception {
    System.out.println("Running Post Order Tests ...");
    PNode root = utils.PTestBST.getTestBST();
    System.out.println(BinaryTreeQuestions.getPostOrderSuccessor(root).getData());
    System.out.println(BinaryTreeQuestions.getPostOrderSuccessor(root.getLeft().getLeft()).getData());
    System.out.println(BinaryTreeQuestions.getPostOrderSuccessor(root.getLeft().getRight().getRight()).getData());
    System.out.println(BinaryTreeQuestions.getPostOrderSuccessor(root.getLeft().getRight().getLeft()).getData());
  }


  public void testGetLevel(){
    System.out.println("Running Level Test ...");
    PNode root = utils.PTestBST.getTestBST();
    System.out.println(BinaryTreeQuestions.getLevel(root, root.getLeft().getLeft(), 0));
    System.out.println(BinaryTreeQuestions.getLevel(root , root.getRight().getRight().getLeft() , 0));
   }

   public void testGetMaxWidth(){
    PNode root = utils.PTestBST.getTestBST();
    System.out.println("Maximum width of the binary tree :"+ BinaryTreeQuestions.getMaxWidth(root));
  }
}
