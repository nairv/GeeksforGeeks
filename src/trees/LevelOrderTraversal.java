package trees;
import java.util.*;
public class LevelOrderTraversal {
	
	public static void printLevelOrder(Node root){
		ArrayDeque<Node> q1 = new ArrayDeque<Node>();
		q1.add(root);
		
		while(!q1.isEmpty()){
			Node t1 = q1.removeFirst();
			System.out.print(t1.getData() + "\t");
			if(t1.getLeft() != null)
				q1.add(t1.getLeft());
			if(t1.getRight() != null)
				q1.add(t1.getRight());
		}
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
