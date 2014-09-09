package DP;

/**
 * Created by vineet on 9/4/14.
 * Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

 Example:

 Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 Output: 3 (1-> 3 -> 8 ->9)
 First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.

 DOESN'T WORK
 */
public class IntegerArrayJump {
  public static int getMinJumpstoReachEndOfArray(int a[]){
    int jumps[] = new int[a.length];

    jumps[0] = 0;

    for(int i = 1 ; i < a.length ; i++){

      jumps[i] = Integer.MAX_VALUE;
      for(int j = 0; j < i; j++){
        if(i <= j + a[j] && jumps[j] != Integer.MAX_VALUE){
          jumps[i] = Math.min(jumps[i] , jumps[j]+1);
          break;
        }
      }
    }

    return jumps[a.length-1];

  }

  public static void main(String args[]){
    int a[] = {1 , 3 , 6 , 1 , 0 , 9};
    System.out.println("Minimum number of hops to reach the end of the array :"+ getMinJumpstoReachEndOfArray(a));
    int b[] = { 1 , 3 , 0 , 1 , 0 , 9};
    System.out.println("Minimum number of hops to reach the end of the array :"+ getMinJumpstoReachEndOfArray(b));
    int c[] = { 1 , 3, 5 , 8 , 4 , 1, 2 ,1 , 1 ,3};
    System.out.println("Minimum number of hops to reach the end of the array :"+ getMinJumpstoReachEndOfArray(c));
    int d[] = { 1 , 3, 2 , 1 , 0 , 1, 2 ,1 , 1 ,3};
    System.out.println("Minimum number of hops to reach the end of the array :"+ getMinJumpstoReachEndOfArray(d));

  }
}
