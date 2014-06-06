package trees;

public class LevelOrderTraversal {
	
	public static void printLevelOrder(Node root){
		
	}
	public static void main(String args[]){
		Node root = new Node(10);
		Node l1 = new Node(5);
		Node r1 = new Node(15);
		root.setLeft(l1);
		root.setRight(r1);
		l1.setLeft(new Node(2));
		l1.setRight(new Node(8));
		
		printLevelOrder(root);
	}
}
