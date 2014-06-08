package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class LowestCommonAncestor {
  public static int lca(Node root , int a , int b){
    if(root == null) return -1;

    if(a < root.getData() && b < root.getData())
    {
      return lca(root.getLeft() , a , b);
    }
    else if(a > root.getData() && b > root.getData()){
      return lca(root.getRight() , a , b);
    }else
      return root.getData();
  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    System.out.println(lca(bt.root , 5, 18));;
    System.out.println(lca(bt.root , 2, 8));;
    System.out.println(lca(bt.root , 8 , 15));;
    System.out.println(lca(bt.root , 12 , 15));;
    System.out.println(lca(bt.root , 10 , 18));;
    System.out.println(lca(bt.root , 15 , 18));;



  }
}
