package DP;

/**
 Created by vineet on 9/3/14.
 Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",
 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.
 */
public class StringInterleavingCheck {
  public static boolean isInterleaved(String s1 , String s2 , String s3){
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    char[] c = s3.toCharArray();

    boolean[][] C = new boolean[s1.length()+1][s2.length()+1];
    //c[0....i+j-1] is a char representation of a string which is an interleaving of a[0...i-1] and b[0....j-1]
    // if C[i][j] is true

    //C[i][j] is true
    // 1. if C[i-1][j] is true and a[i-1] == c[i+j-1]
    // 2. if C[i][j-1] is true and b[j-1] == c[i+j-1]


    for(int i = 0 ; i < a.length+1 ; i++){
      for (int j = 0 ; j < b.length+1 ; j++){
        //Both A and B are empty
        if(j == 0 && i == 0)
          C[i][j] = true;
        //A is empty
        else if( i == 0 && b[j-1] == c[j-1])
          C[i][j] = C[i][j-1];
        //B is empty
        else if( j== 0 && a[i-1] == c[i-1])
          C[i][j] = C[i-1][j];

        else if(i!= 0 && j!=0 && a[i-1] == c[i+j-1] && b[j-1] != c[i+j-1])
          C[i][j] = C[i-1][j];

        else if(i!= 0 && j!=0 && b[j-1] == c[i+j-1] && a[i-1] != c[i+j-1])
          C[i][j] = C[i][j-1];

        else if (i!= 0 && j!=0 && b[j-1] == c[i+j-1] && a[i-1] == c[i+j-1]){
          C[i][j] = (C[i-1][j] || C[i][j-1]);
        }

      }
    }

    return C[a.length][b.length];

  }



  public static void main(String args[]){
    System.out.println(StringInterleavingCheck.isInterleaved("XXY", "XXZ", "XXZXXXY"));
    System.out.println(StringInterleavingCheck.isInterleaved("XY" ,"WZ" ,"WZXY"));
    System.out.println(StringInterleavingCheck.isInterleaved("XY", "X", "XXY"));
    System.out.println(StringInterleavingCheck.isInterleaved("YX", "X", "XXY"));
    System.out.println(StringInterleavingCheck.isInterleaved("XXY", "XXZ", "XXXXZY"));
  }
}
