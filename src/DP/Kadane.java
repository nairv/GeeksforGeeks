package DP;

/**
 * Created by vineet on 9/3/14.
 * Find the largest contiguous sum of a subarray in an array
 */
public class Kadane {
  public static int maxsumsubarray(int [] a){
    int max_sofar , max_endinghere;
    max_sofar = max_endinghere = a[0];
    for (int i = 0 ; i < a.length ; i++){
      max_endinghere = Math.max(a[i] , max_endinghere+ a[i]);
      max_sofar = Math.max(max_sofar , max_endinghere);
    }
    return max_sofar;
  }


  public static void main(String args[]){
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    System.out.println(maxsumsubarray(a));
  }
}
