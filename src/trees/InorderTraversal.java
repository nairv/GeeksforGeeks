package trees;

import java.util.Stack;


public class InorderTraversal {
	public static void printInorderRecursive(Node node){
		if(node == null)
			return;
		else {
			printInorderRecursive(node.getLeft());
			System.out.print(node.getData() + "\t");
			printInorderRecursive(node.getRight());
		}
	}
	
	
	
	public static void printInorder(Node root){
		Stack<Node> s1 = new Stack<Node>();
		s1.add(root);
		
		while(!s1.empty()){
			Node top = s1.peek();
			if(top.getLeft() != null){
				s1.add(top.getLeft());
			}
			else{
				Node top1 = s1.pop();
				System.out.print(top1.getData() + "\t");
				if(top1.getRight()!= null){
					s1.add(top1.getRight());
				}
			}
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
		printInorderRecursive(root);
		System.out.println();
		printInorder(root);
	}
}
