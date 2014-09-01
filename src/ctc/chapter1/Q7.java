package ctc.chapter1;

/**
 * Created by vineet on 9/1/14.
 */
public class Q7 {
  public static int[][] setZeros(int a[][]){
    boolean rows[] = new boolean[a.length];
    boolean cols[] = new boolean[a[0].length];

    for(boolean el : rows){
      el= true;
    }
    for (boolean el: cols){
      el = true;
    }

    for (int i = 0; i < rows.length; i++){
      for(int j =0; j < cols.length ; j++){
        if(a[i][j] == 0){
          rows[i] = false;
          cols[j] = false;
        }
      }
    }

    for (int i = 0; i < rows.length; i++){
      for(int j =0; j < cols.length ; j++){
        if(!rows[i] || !cols[j])
          a[i][j] = 0;
      }
    }

    return a;
  }

  public static void main(String args[]){

  }
}
