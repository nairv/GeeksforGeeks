package ctc.chapter1;

import java.util.Random;

/**
 * Created by vineet on 8/31/14.
 *
 * Given an image as a N x N integer matrix , do matrix rotation IN PLACE
 * anticlockwise
 */
public class Q6 {

  public doRotation(int a[][] , int num){
    for (int i = 0; i < num; i++){
      doRotationOnce(a , a.length);
    }
  }
  /*
  a[][] - The N x N matrix
  n - length of each side of the matrix
   */
  public void doRotationOnce(int a[][]  , int n){
    int n = a.length;
    for(int layer = 0 ; layer < n/2 ; layer++){
      int first = layer;
      int last = n-1-layer;

      for (int i = first; i < last ; i++){
        int offset = i - first;
        int top = a[first][i];
        a[first][i] = a[last-offset][first];
        a[last-offset][first] = a[last][last-offset];
        a[last][last-offset] = a[i][last];
        a[i][last] = top;
      }
    }
  }

  public int[][] generateMatrix(int n){
    int a[][] = new int[n][n];

    for(int i = 0 ; i < n; i++){
      for(int j = 0; j < n ; j++){
        Random r = new Random();
        a[i][j] = r.nextInt();
      }
    }
  }

  public static void main(String args[]){

  }
}
