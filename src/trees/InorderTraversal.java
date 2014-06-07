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
		boolean done = false;
		Node current = root;
		
		while(!done){
			if(current!= null){
				s1.push(current);
				current = current.getLeft();		
			}
			else{
				if(!s1.empty()){
					current = s1.pop();
					System.out.print(current.getData() + "\t");
					current = current.getRight();
				}
				else
				done = true;
			}
		}
	}
	public static void main(String args[]){

    BinaryTree bt = new BinaryTree();
		printInorderRecursive(bt.root);
		System.out.println();
		printInorder(bt.root);
	}
}
