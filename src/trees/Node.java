package trees;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public Node getLeft(){
		return this.left;
	}
	
	public Node getRight(){
		return this.right;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	public Node(int data){
		setData(data);
		setLeft(null);
		setRight(null);
	}
}
