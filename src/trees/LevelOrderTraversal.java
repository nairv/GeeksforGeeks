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
    BinaryTree bt = new BinaryTree();
		printLevelOrder(bt.root);
	}
}
