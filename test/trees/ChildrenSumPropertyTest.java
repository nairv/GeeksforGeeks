package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/9/14.
 */
public class ChildrenSumPropertyTest {
  @Test
  public void testIsChildrenSumProperty() throws Exception {
    Node root = new Node(10);
    Node l1 = new Node(8);
    Node r1 = new Node(2);
    root.setLeft(l1);
    root.setRight(r1);
    Node l11 = new Node(5);
    Node l12 = new Node(3);
    Node r11 = new Node(2);
    root.getLeft().setLeft(l11);
    root.getLeft().setRight(l12);
    root.getRight().setLeft(r11);


    Assert.assertTrue("Children sum is true" , ChildrenSumProperty.isChildrenSumProperty(root));

    root.getLeft().getRight().setLeft(new Node(1));
    Assert.assertFalse("Children sum is false" , ChildrenSumProperty.isChildrenSumProperty(root));

  }
}
