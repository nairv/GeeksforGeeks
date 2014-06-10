package trees;

/**
 * Created by vineet on 6/9/14.
 */
public class Node1 {
  public int data;
  public Node1 left , right , parent;

  Node1(int data){
    this.data = data;
    this.left = this.parent= this.right = null;
  }

  public void setLeft(Node1 node){
    this.left = node;
    node.parent = this;
  }
  public void setRight(Node1 node){
    this.right = node;
    node.parent = this;
  }

  public Node1 getLeft(){
    return this.left;
  }

  public Node1 getRight(){
    return this.right;
  }

  public int getData(){
    return this.data;
  }
}
