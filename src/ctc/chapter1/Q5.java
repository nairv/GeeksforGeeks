package ctc.chapter1;

/**
 * Created by vineet on 8/31/14.
 *
 * //Implement a function to perform basic RLE string compression
 * if the string doesnt become smaller , return the original string
 */
public class Q5 {
  public static String compress(String s1){
    StringBuffer sb = new StringBuffer(s1.length());
    int i = 0;
    int nw = 0;
    while(i < s1.length()){
      int localchar = s1.charAt(i);
      int localcount = 0;
      while((i < s1.length()) && (s1.charAt(i) == localchar) ){
        localcount++;
        i++;
      }
      sb.append((char)localchar);
      sb.append(localcount);
    }
    if(sb.length() >= s1.length())
      return s1;
    else
      return sb.toString();
  }

  public static void main(String args[]){
    System.out.println(compress("aabbcde"));
  }
}
