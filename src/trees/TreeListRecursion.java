package trees;
/*
TO DO .. NOT WORKING
 */
/**
 * Created by vineet on 6/8/14.
 */
public class TreeListRecursion {
  public static void  join(Node a , Node b){
    a.setRight(b);
    b.setLeft(a);
  }
  public static void printList(Node head){
    Node current = head;
    while(current != null){
      System.out.print(current.getData()+ "\t");
      current.setRight(current);
      if(current == head) break;
    }
  }
  public static Node append(Node a , Node b){
    if(a == null) return b;
    if( b == null) return a;

    Node aLast = a.getLeft();
    Node bLast = b.getLeft();

    join(aLast , b);
    join(bLast  , a);

    return a;
  }


  public  static Node treeToList(Node root){
    if(root == null) return null;

    Node aList = treeToList(root.getLeft());
    Node bList = treeToList(root.getRight());

    root.setLeft(root);
    root.setRight(root);

    aList = append(aList , root);
    aList = append(aList , bList);

    return aList;
  }




}
