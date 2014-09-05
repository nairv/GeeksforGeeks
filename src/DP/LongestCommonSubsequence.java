package DP;

/**
 * Created by vineet on 9/4/14.
 *
 * LCS(i , j) = max(LCS(i-1 ,j) , LCS(i , j-1) , if A[i-1] != B[j-1]
 *            = LCS(i-1,j-1) + 1               , if A[i-1] == B[j-1]
 * LCS(
 */
public class LongestCommonSubsequence {
  public static String getLongestCommonSubsequence(String a , String b){
    char[] A = a.toCharArray();
    char[] B = b.toCharArray();

    int[][] C = new int[A.length+1][B.length+1];

    int i = 0;
    int j = 0;

    for(i = 0 ; i < A.length+1 ; i++){
      for(j = 0; j < B.length+1 ; j++){
        if(i == 0 || j == 0){
          C[i][j] = 0;
          continue;
        }
        if(A[i-1] == B[j-1]){
          C[i][j] = C[i-1][j-1] + 1;
        }
        else{
          C[i][j] = Math.max(C[i][j-1] , C[i-1][j]);
        }
      }
    }
    int length = C[A.length][B.length];
    int index = length -1;
    char[] subsequence = new char[length];
    i = i -1;
    j = j -1;
    while(i > 0 && j > 0){

      if(C[i][j]> C[i-1][j-1]){
        subsequence[index--] = A[i-1];
        i--;j--;
      }
      else if(C[i-1][j] > C[i][j-1]){
        i--;
      }
      else
        j--;

    }
    System.out.println(new String(subsequence));
    return new String(subsequence);
    //return C[A.length][B.length];
  }

  public static int getLengthLCS(String a , String b){
    char[] A = a.toCharArray();
    char[] B = b.toCharArray();

    int[][] C = new int[A.length+1][B.length+1];

    int i , j;

    for(i =0 ; i < A.length+1 ; i++){
      for(j = 0; j < B.length+1 ; j++){
        if(i == 0 || j == 0){
          C[i][j] = 0;
          continue;
        }
        if(A[i-1] == B[j-1]){
          C[i][j] = C[i-1][j-1] + 1;
        }
        else{
          C[i][j] = Math.max(C[i][j-1] , C[i-1][j]);
        }
      }
    }
    int length = C[A.length][B.length];
    return length;
  }

  public static void main(String args[]){
    String a1 = "AGTGAB";
    String a2 = "GXTXAYB";

    System.out.println("LCS of \"" + a1 + "\" and \"" + a2 + "\" is :" + getLongestCommonSubsequence(a1,a2));
    System.out.println("Length of LCS of \"" + a1 + "\" and \"" + a2 + "\" is :" + getLengthLCS(a1 , a2));
  }
}
