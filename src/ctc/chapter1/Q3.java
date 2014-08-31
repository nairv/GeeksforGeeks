package ctc.chapter1;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by vineet on 8/24/14.
 * Given two strings find whether one string is a permutation of the other
 * Assumption that the string contains 8-bit characters
 */
public class Q3 {
  public static boolean isPermutation(String a , String b){

    int arrCheck[] = new int[256];
    for(char c:a.toCharArray()){
      arrCheck[c]++;
    }

    for(char c:b.toCharArray()){
      arrCheck[c]--;
    }

    for(int i :arrCheck){
      if(i != 0 )
        return false;
    }

    return true;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    System.out.println(isPermutation(s1 , s2));
  }
}
