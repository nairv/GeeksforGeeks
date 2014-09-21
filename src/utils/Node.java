package utils;

/**
 * Created by vineet on 9/20/14.
 *
 * Template Node with integer data
 *
 */
public class Node {
  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  private int data;
  private Node left;
  private Node right;

  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
