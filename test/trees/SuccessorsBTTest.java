package trees;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/11/14.
 */
public class SuccessorsBTTest {
  @Test
  public void testPostOrderSuccessor() throws Exception {
    Node1<Character> root = new Node1<Character>('a');
    Node1<Character> l1 = new Node1<Character>('b');
    Node1<Character> l11 = new Node1<Character>('c');
    Node1<Character> l12 = new Node1<Character>('d');
    Node1<Character> l121 = new Node1<Character>('h');
    Node1<Character> l122 = new Node1<Character>('g');
    Node1<Character> r1 = new Node1<Character>('e');
    Node1<Character> r11 = new Node1<Character>('f');
    root.setLeft(l1);
    root.setRight(r1);
    l1.setLeft(l11);
    l1.setRight(l12);
    l12.setLeft(l121);
    l12.setRight(l122);
    r1.setLeft(r11);

    Assert.assertEquals(SuccessorsBT.postOrderSuccessor(l11).data,'h');
    Assert.assertEquals(SuccessorsBT.postOrderSuccessor(root) , null);
    Assert.assertEquals(SuccessorsBT.postOrderSuccessor(l122).data , 'd');
    Assert.assertEquals(SuccessorsBT.postOrderSuccessor(l1).data , 'f');
    Assert.assertEquals(SuccessorsBT.postOrderSuccessor(r11).data , 'e');

  }

  @Test
  public void testPreOrderSuccessor() throws Exception {

  }

  @Test
  public void testInOrderSuccessor() throws Exception {

  }
}
