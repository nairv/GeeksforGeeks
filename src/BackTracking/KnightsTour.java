package BackTracking;

/**
 * Created by vineet on 9/25/14.
 *
 * Given a position on the chess board find the path of the knight on the chess board
 */
public class KnightsTour {
  public static void printSolution(int a[][]){
    int rows = a.length;
    int cols = a[0].length;
    System.out.println("Printing the chess board:");
    for( int i = 0 ; i < rows;i++){
      for(int j = 0; j < cols ;j++){
        System.out.format("%2d",a[i][j]);
        System.out.print("\t");
      }
      System.out.println();
    }
  }

  public static boolean isSafe(int a[][] , int nextX , int nextY){
    if(nextX >= a.length || nextY >= a[0].length || nextX < 0 || nextY < 0)
      return false;

    if(a[nextX][nextY] != -1){
      return false;
    }
    else return true;

  }

  public static boolean KnightsTourUtil(int sol[][] , int x, int y, int moveNo , int[] moveX , int[] moveY){
    if(moveNo == sol.length * sol[0].length)
      return true;


    for(int i = 0; i < moveX.length; i++){
      int nextX = x + moveX[i];
      int nextY = y + moveY[i];

      if(isSafe(sol , nextX , nextY)){
        sol[nextX][nextY] = moveNo + 1;
        if(KnightsTourUtil(sol,nextX , nextY , moveNo+1 , moveX , moveY))
          return true;
        else
        {
          sol[nextX][nextY] = -1;
        }
      }
    }
    return false;
  }
  public static boolean solveKnightsTour(int N){
    int sol[][] = new int[N][N];
    sol = initialize(sol);

    int[] moveY = new int[]{1 , 2, 2, 1, -1, -2, -2 , -1};
    int[] moveX = new int[]{-2,-1, 1, 2, 2 , 1 , -1 , -2};

    sol[0][0] = 1;

    if(KnightsTourUtil(sol , 0 , 0, 1 , moveX , moveY)){
      printSolution(sol);
      return true;
    }
    else{
      System.out.println("Solution does not exist");
      return false;
    }
  }

  public static int[][] initialize(int[][] a){
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        a[i][j] = -1;
      }
    }
    return a;
  }

  public static void main(String args[]){
    //int[ = new int[8][8];

    solveKnightsTour(16);

  }
}
