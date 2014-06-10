package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class BinaryTree1 {
  Node1 root = null;
  BinaryTree1(){
    root = new Node1(10);
    Node1 l1 = new Node1(5);
    Node1 r1 = new Node1(15);
    root.setLeft(l1);
    root.setRight(r1);
    l1.setLeft(new Node1(2));
    l1.setRight(new Node1(8));
    r1.setLeft(new Node1(12));
    r1.setRight(new Node1(18));
  }
}
