package utils;

/**
 * Created by vineet on 9/20/14.
 */
public class TestBST {
  public static Node getTestBST(){
    Node root = new Node (6);
    Node l1 = new Node (2);
    Node l11 = new Node (1);
    Node l12 = new Node (4);
    Node l121 = new Node (3);
    Node l122 = new Node (5);
    Node r1 = new Node (7);
    Node r12 = new Node (9);
    Node r121 = new Node(8);
    root.setLeft(l1);
    root.setRight(r1);
    l1.setLeft(l11);
    l1.setRight(l12);
    l12.setLeft(l121);
    l12.setRight(l122);
    r1.setRight(r12);
    r12.setLeft(r121);
    return root;
  }
}
