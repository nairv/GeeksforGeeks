package DP;

import utils.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vineet on 9/13/14.
 * Alice is a kindergarden teacher. She wants to give some candies to the children in her class.  All the children sit in a line, and each  of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to save money, so she needs to minimize the total number of candies.

 Input
 The first line of the input is an integer N, the number of children in Alice's class. Each of the following N lines contains an integer that indicates the rating of each child.

 Ouput
 Output a single line containing the minimum number of candies Alice must buy.

 Constraints
 1 <= N <= 105
 1 <= ratingi <= 105

 Sample Input

 3
 1
 2
 2
 */
public class Candies {

  public static int getMinCandies(ArrayList<Integer> al){
    ArrayList<Integer> right = new ArrayList<Integer>();
    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> solution = new ArrayList<Integer>();
    System.out.println("Original array : "+ al.toString());
    for(int i = 0; i < al.size(); i++){
      right.add(1);
      left.add(1);
    }

    for(int i = al.size()-2 ; i >= 0; i--){
      if(al.get(i) > al.get(i+1))
        right.set(i , right.get(i+1) + 1);
    }

    for(int i = 1 ; i <al.size() ; i++){
      if(al.get(i-1) < al.get(i)){
        left.set(i , left.get(i-1)+1);
      }
    }
    int count = 0;
    for(int i = 0 ; i < al.size() ; i++){
      solution.add(Math.max(left.get(i), right.get(i)));
      count+= solution.get(i);
    }


    System.out.println(right.toString());
    System.out.println(left.toString());
    System.out.println("Final Distribution :" + solution.toString());

    return count;


  }

  public static void main(String args[]) throws Exception{
    Scanner sc = new Scanner(System.in);
    Integer i = Integer.parseInt(sc.nextLine());
    if(i > 100000)
      throw new Exception("Integer cannot be greater than 100000");
    ArrayList<Integer> al = new ArrayList<Integer>();
    while(i > 0){
      int k = Integer.parseInt(sc.nextLine());
      if(k > 100000)
        throw new Exception("Integer cannot be greater than 100000");
      al.add(k);
      i--;
    }

    System.out.println("Minimum Number of candies needed :" + getMinCandies(al));

  }
}
