package StringsArrays;

/**
 * Created by vineet on 7/14/14.
 */
public class LCS {
  public static String lcs(String text1, String text2){
    int x = text1.length();
    int y = text2.length();
    int L[][] = new int[x+1][y+1];

    for(int i = 0;i <= x ; i++)
      for(int j = 0 ; j<= y ; j++){
        if(i == 0 || j == 0){
          L[i][j] = 0;
        }
        else if(text1.charAt(i-1) == text2.charAt(j-1))
          L[i][j] = L[i-1][j-1] + 1;
        else
          L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
      }
    int index = L[x][y];
    char[]lcsText = new char[index];
    int i = 0;
    while(x > 0 && y > 0){
      if(text1.charAt(x) == text2.charAt(y)){
        lcsText[i] = text1.charAt(x);
        x--;
        y--;
        index--;
      }
      else if(L[x-1][y] > L[x][y-1])
        x--;
      else
        y--;
    }
    //System.out.print
    return String.copyValueOf(lcsText);
  }
  public static void main(String args[]){
    String text1 = "AGGTAB";
    String text2 = "GXTXAYB";
    System.out.println(lcs(text1, text2));

  }
}
