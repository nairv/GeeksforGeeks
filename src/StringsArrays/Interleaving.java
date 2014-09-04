package StringsArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by vineet on 9/2/14.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",
 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.

 */
public class Interleaving {
  //Returns true if s3 contains s1 and s2 interleaved in it
  public static boolean isInterleaved(String s1 , String s2 , String s3){
    if(s1.length() + s2.length() != s3.length())
      return false;

    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    Character[] c = new Character[s3.length()];
    for(int i = 0; i < s3.length() ; i++){
      c[i] = s3.charAt(i);
    }
    java.util.ArrayList<Character> al = new ArrayList<Character>(Arrays.asList(c));
    Iterator<Character> it = al.iterator();
    for(char ch: a){
      if(it.hasNext()){
        char temp;
        temp = it.next();
        while(temp != ch && it.hasNext()){
          temp = it.next();
        }
        it.remove();
      }
      else
        return false;
    }
    it = al.iterator();
    for(char ch: b){
      if(it.hasNext()){
        char temp;
        temp = it.next();
        while(temp != ch && it.hasNext()){
          temp = it.next();
        }
        it.remove();
      }
      else
        return false;
    }

    if(!it.hasNext()){
      return true;
    }
    else
      return false;

  }


  public static boolean isInterleaved1(String s1 , String s2 , String s3){
    if(s1.length() + s2.length() != s3.length())
      return false;

    HashMap<Character , Integer> hm = new HashMap<Character , Integer>();

    return true;
  }
  public static void main(String args[]){
    System.out.println(Interleaving.isInterleaved("XXY", "XXZ", "XXZXXXY"));
    System.out.println(Interleaving.isInterleaved("XY" ,"WZ" ,"WZXY"));
    System.out.println(Interleaving.isInterleaved("XY", "X", "XXY"));
    System.out.println(Interleaving.isInterleaved("YX", "X", "XXY"));
    System.out.println(Interleaving.isInterleaved("XXY", "XXZ", "XXXXZY"));

    System.out.println("\n");
    System.out.println(Interleaving.isInterleaved1("XXY", "XXZ", "XXZXXXY"));
    System.out.println(Interleaving.isInterleaved1("XY", "WZ", "WZXY"));
    System.out.println(Interleaving.isInterleaved1("XY", "X", "XXY"));
    System.out.println(Interleaving.isInterleaved1("YX", "X", "XXY"));
    System.out.println(Interleaving.isInterleaved1("XXY", "XXZ", "XXXXZY"));

  }
}
