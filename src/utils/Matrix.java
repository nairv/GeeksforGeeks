package utils;

import java.util.Random;

/**
 * Created by vineet on 9/1/14.
 */
public class Matrix {
  public static int[][] generateMatrix(int n){
    int a[][] = new int[n][n];

    for(int i = 0 ; i < n; i++){
      for(int j = 0; j < n ; j++){
        Random r = new Random();
        a[i][j] = Math.abs(r.nextInt())%100;
      }
    }
    return a;
  }

  public static void printMatrix(int a[][]){
    System.out.println("Printing matrix->");
    System.out.println("---------------------------------");
    for (int i = 0 ; i < a.length ; i++){
      for( int j = 0; j < a[0].length; j++){
        System.out.print(a[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("---------------------------------");
  }
}
