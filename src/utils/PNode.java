package utils;

/**
 * Created by vineet on 9/20/14.
 * Node with parent pointers
 */
public class PNode {
  private int data;
  private PNode parent;
  private PNode left;
  private PNode right;

  public PNode getParent() {
    return parent;
  }

  public void setParent(PNode parent) {
    this.parent = parent;
  }

  public PNode getLeft() {
    return left;
  }

  public void setLeft(PNode left) {
    this.left = left;
    this.left.parent = this;
  }

  public PNode getRight() {
    return right;
  }

  public void setRight(PNode right) {
    this.right = right;
    this.right.parent = this;
  }

  public int getData() {

    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public PNode(int data){
    this.data = data;
    this.parent = this.left = this.right = null;
  }

  public PNode(int data , PNode parent){
    this.data = data;
    this.parent = parent;
    this.left = this.right = null;
  }
}
