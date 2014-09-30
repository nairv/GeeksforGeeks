package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by vineet on 9/5/14.
 * Given an array find a pair of elements which sum up to a given sum
 *
 * Two approaches
 * 1. Optimize for time
 * for each element in the array a[i] , search for a[i] in a hashmap
 * if not found put (sum - a[i]) in the hashmap
 */
class Pair{
  int first;
  int second;
  Pair(int first , int second){
    this.first = first;
    this.second = second;
  }
  public String toString(){
    return new String("("+first+","+second+")" );
  }
}
public class TwoSum {
  public static ArrayList<Pair> getTwoSumTime(int a[] , int sum){
    HashSet<Integer> hm = new HashSet<Integer>();
    ArrayList<Pair> result = new ArrayList<Pair>();
    for(int i= 0 ; i < a.length ; i++){
      int diff = sum - a[i];
      if(hm.contains(diff)){
        int first = a[i];
        int second = diff;
        result.add(new Pair(first , second));
      }
      else{
        hm.add(a[i]);
      }
    }
    return result;
  }

  public static void main(String args[]){
    int a[] = {2, 7, 3 , 11, 15};
    utils.Arrays<Integer> arrayUtil = new utils.Arrays<Integer>();
    System.out.println(getTwoSumTime(a, 18).toString());
  }
}
