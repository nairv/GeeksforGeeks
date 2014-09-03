package utils;

/**
 * Created by vineet on 9/2/14.
 */
public class LinkedList<T> {
  public static void toStrings(java.util.LinkedList<Integer> a){
    for(Integer obj : a){
      System.out.print(obj + "\t");
    }
    System.out.println();
  }
}
