package Challenges;

import utils.Arrays;

/**
 * Created by vineet on 9/16/14.
 * Given a bitmap matrix create the mirror image of it
 */
public class BitMapMatrixMirror {
  public static int[] flipRow(int[] row){
    int rowlength = row.length;
    for(int i = 0; i < rowlength/2 ; i++){
      int temp = row[i];
      row[i] = row[rowlength -i-1];
      row[rowlength - i-1] = temp;
    }
    return row;
  }

  public static int[][] mirrorImage(int matrix[][]){
    int colLength = matrix.length;
    for(int i = 0; i < colLength ; i++){
      matrix[i] = flipRow(matrix[i]);
    }
    return matrix;
  }


  public static void main(){
    int matrix[][] = {{1 , 2 , 3 , 4}, {10 , 20 , 30 , 40}};
    matrix = mirrorImage(matrix);
    //System.out.println();
  }
}
