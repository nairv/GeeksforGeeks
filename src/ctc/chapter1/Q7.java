package ctc.chapter1;
import utils.Matrix;
/**
 * Created by vineet on 9/1/14.
 */
public class Q7 {
  public static int[][] setZeros(int a[][]){
    boolean rows[] = new boolean[a.length];
    boolean cols[] = new boolean[a[0].length];

    for(int i = 0 ; i < rows.length; i++){
      rows[i] = true;
    }
    for (int i = 0; i < cols.length ; i++){
      cols[i] = true;
    }

    for(int i =0 ; i < rows.length ; i++){
      System.out.print(rows[i] + "\t");
    }
    System.out.println();

    for(int i =0 ; i < cols.length ; i++){
      System.out.print(cols[i] + "\t");
    }
    System.out.println();

    for (int i = 0; i < rows.length; i++){
      for(int j =0; j < cols.length ; j++){
        if(a[i][j] == 0){
          rows[i] = false;
          cols[j] = false;
        }
      }
    }

    for (int i = 0; i < rows.length; i++){
      for(int j =0; j < cols.length ; j++){
        if(!rows[i] || !cols[j])
          a[i][j] = 0;
      }
    }

    return a;
  }

  public static void main(String args[]){
    int a[][] = Matrix.generate2DMatrix(5);
    Matrix.print2DMatrix(a);
    Matrix.print2DMatrix(setZeros(a));

  }
}
