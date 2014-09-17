package utils;

/**
 * Created by vineet on 9/6/14.
 */
public class Arrays<T> {
  public String toString(T[] arr){
    StringBuffer out = new StringBuffer();
    for(T a: arr){
      out.append(a.toString() + "\t");
    }
    out.append("\n");
    return new String(out);
  }

  public String toString(int[] arr){
    StringBuffer out = new StringBuffer();
    for(int a: arr){
      out.append(a + "\t");
    }
    out.append("\n");
    return new String(out);
  }

  public static void toString(int[][] arr){
    for(int i = 0 ; i < arr.length ; i++){
      for(int j = 0 ; j < arr[i].length ; j++){
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
