package utils;

/**
 * Created by vineet on 9/20/14.
 * Get a BST with Parent pointers for all PNodes
 */
public class PTestBST {
  public static PNode getTestBST(){
    PNode root = new PNode (6);
    PNode l1 = new PNode (2);
    PNode l11 = new PNode (1);
    PNode l12 = new PNode (4);
    PNode l121 = new PNode (3);
    PNode l122 = new PNode (5);
    PNode r1 = new PNode (7);
    PNode r12 = new PNode (9);
    PNode r121 = new PNode(8);
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
