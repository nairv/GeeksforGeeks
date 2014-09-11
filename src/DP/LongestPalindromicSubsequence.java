package DP;

import java.util.Arrays;

/**
 * Created by vineet on 9/9/14.
 *
 * The optimal substructure property:
 *
 * if L[0][n-1] be the length of the longest palindrome in the string x[0...n-1]
 * Base :
 * each L[i][i] = 1
 *
 * if x[i] == x[j]
 *      L[i][j] = L[i+1][j-1] + 2 ...(if i+1<j)
 *      L[i][j] = 2 .. if(i+1 == 2)
 * else
 *      L[i][j] = max(L[i+1][j] , L[i][j-1]
 *
 * return L[0][n-1]
 */
public class LongestPalindromicSubsequence<T> {

  public int getLengthLongestPalindromicSubsequence(char [] a){
    int n = a.length;

    int[][]L = new int[n][n];

    for(int i=0;i<n;i++){
      L[i][i] = 1;
    }

    for(int cl = 2; cl <= n; cl++){
      for(int i = 0; i < n-cl+1 ;i++){
        int j = i+cl-1;
        if(a[i] == a[j] && cl==2)
            L[i][j] = 2;
        else if(a[i] == a[j]){
            L[i][j] = L[i+1][j-1] + 2;
        }
        else
          L[i][j] = Math.max(L[i+1][j] , L[i][j-1]);
      }
    }
    for(int i = 0 ; i < n ; i++){
      for ( int j = 0 ; j < n ; j++){
        System.out.print(L[i][j] + "\t");
      }
      System.out.println();
    }

    return L[0][n-1];
  }



  public static void main(String args[]){
    LongestPalindromicSubsequence<Character> lps = new LongestPalindromicSubsequence<Character>();
    String s = "GEEKS FOR GEEKS";
    Character[] charArray = new Character[s.length()];
    int i= 0;
    for(char c: s.toCharArray()){
      charArray[i++] = new Character(c);
    }
    System.out.println(lps.getLengthLongestPalindromicSubsequence(s.toCharArray()));
  }
}
