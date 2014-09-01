package ctc.chapter1;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by vineet on 7/26/14.
 * Write a function to reverse a string like the C/C++ string representation of chars
 * Horrible way to do it but no other option in Java :)
 */
public class Q2 {

  public static String reverse(String s1){
    char a[] = s1.toCharArray();

    int length = a.length;
    char b[] = new char[length];
    for(int i = length-1,j=0 ; i >=0 ; i--,j++){
      b[j]= a[i];
    }
    String s2 = new String(b);
    return s2;
  }

  public static void main(String args[]){
    Scanner s = new Scanner(new InputStreamReader(System.in));
    String s1 = s.nextLine();

    System.out.println(reverse(s1));
  }
}
