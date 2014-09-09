package DP;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by vineet on 9/5/14.
 * Given an array find a pair of elements which sum up to a given sum
 *
 * Two approaches
 * 1. Optimize for time
 * for each element in the array a[i] , search for a[i] in a hashmap
 * if not found put (sum - a[i]) in the hashmap
 */
public class TwoSum {
  public static int[] getTwoSumTime(int a[] , int sum){
    HashMap<Integer , Integer > hm = new HashMap<Integer , Integer>();
    int []result = new int[2];
    for(int i= 0 ; i < a.length ; i++){
      int diff = sum - a[i];
      if(hm.containsKey(a[i])){
        int index = hm.get(a[i]);
        result[0] = index+1;
        result[1] = i+1;
      }
      else{
        hm.put(diff , i);
      }
    }
    return result;

  }

  public static void main(String args[]){
    int a[] = {2, 7, 3 , 11, 15};
    utils.Arrays<Integer> arrayUtil = new utils.Arrays<Integer>();
    System.out.println(arrayUtil.toString(getTwoSumTime(a, 18)));
  }
}
