package trees;

/**
 * Created by vineet on 6/8/14.
 */
public class RootLeafPaths {
  static int[] path= new int[1000];
  //static int pathLen = 0;
  public static void printpaths(int pathLen){
    for(int i= 0 ; i < pathLen; i++){
      System.out.print(path[i]+"\t");
    }
    System.out.println();
  }
  public static void printPathsRecurs(Node root , int pathLen ){
    if(root == null) return;
    path[pathLen++] = root.getData();
    if(root.getLeft() == null && root.getRight() == null)
      printpaths(pathLen);
    else{
        printPathsRecurs(root.getLeft() , pathLen);
        printPathsRecurs(root.getRight() , pathLen);

    }
  }
  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    printPathsRecurs(bt.root , 0);
  }
}
