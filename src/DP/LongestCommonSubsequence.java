package DP;

/**
 * Created by vineet on 9/4/14.
 *
 * LCS(i , j) = max(LCS(i-1 ,j) , LCS(i , j-1) , if A[i-1] != B[j-1]
 *            = LCS(i-1,j-1) + 1               , if A[i-1] == B[j-1]
 * LCS(
 */
public class LongestCommonSubsequence {
  public static int getLongestCommonSubsequence(String a , String b){
    char[] A = a.toCharArray();
    char[] B = b.toCharArray();

    int[][] C = new int[A.length+1][B.length+1];

    for(int i = 0 ; i < A.length+1 ; i++)
      C[i][0] = 0;
    for (int j = 0; j < B.length+1 ; j++)
      C[0][j] = 0;

    for(int i =1 ; i < A.length+1 ; i++){
      for(int j = 1; j < B.length+1 ; j++){

        if(A[i-1] == B[j-1]){
          C[i][j] = C[i-1][j-1] + 1;
        }
        else
          C[i][j] = Math.max(C[i][j-1] , C[i-1][j]);
      }
    }
    return C[A.length][B.length];
  }

  public static void main(String args[]){
    String a1 = "AGGTAB";
    String a2 = "GXTXAYB";

    System.out.println("LCS of \"AGGTAB\" and \"GXTXAYB\" is :" + getLongestCommonSubsequence(a1,a2));
  }
}
