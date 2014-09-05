package DP;

/**
 * Created by vineet on 9/3/14.
 * Find the longest increasing subsequence in an integer array
 *
 *
 * The Recurrence relation for the optimal substructure property would be
 * if L{i} is the length of the longest subsequence in an array a[0.... i]
 *
 * L{i} = 1 + max{ L {j}} where j< i and a[j] < a[i]
 * L[0] = 1
 *
 */
public class LongestIncreasingSubsequence {

  public static int getLengthIncreasingSubsequence(int a[]){
    int lis[] = new int[a.length];

    for(int i = 0; i < lis.length ; i++)
      lis[i] = 1;

    for ( int i = 1 ; i < a.length ; i++){
      for( int j = 0 ; j < i ; j++){
        if(a[j] < a[i] && lis[i] < lis[j] + 1)
          lis[i] = lis[j] + 1;
      }

    }

    int max = 0;
    for(int i : lis){
      if(i > max)
        max = i;
    }

    return max;
  }

  public static void main(String args[]){
    int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
    System.out.println("LIS : "+ getLengthIncreasingSubsequence(arr));
  }


}
