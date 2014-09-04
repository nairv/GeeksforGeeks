package DP;

/**
 * Created by vineet on 9/3/14.
 */
public class MaxSizeSquareSubMatrix {
  public static int getMaxSizeSqSubMatrix(int [][] a){
    int [][] S = new int[a.length][a[0].length];
    for (int i = 0; i < a.length ; i++){
      for (int j = 0 ; j< a[0].length; j++){
        if(i == 0)
          S[i][j] = a[i][j];
        else if( j == 0){
          S[i][j] = a[i][j];
        }
        else if(a[i][j] == 1)
          S[i][j] = Math.min(Math.min(S[i][j-1] , S[i-1][j]) , S[i-1][j-1]) + 1;
        else
          S[i][j] = 0;
      }
    }


    int maxseen = 0;
    for(int i = 0; i < S.length ; i++){
      for (int j = 0 ; j < S[0].length ; j++){
        if(S[i][j] > maxseen)
          maxseen = S[i][j];
      }
    }

    return maxseen;
  }



  public static void main(String args[]){
    int a[][] = {
      {0, 1, 1, 0, 1},
      {1, 1, 0, 1, 0},
      {0, 1, 1, 1, 0},
      {1, 1, 1, 1, 0},
      {1, 1, 1, 1, 1},
      {0, 0, 0, 0, 0}
    };


    System.out.println(getMaxSizeSqSubMatrix(a));
  }
}
