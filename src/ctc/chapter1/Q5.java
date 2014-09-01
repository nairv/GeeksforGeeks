package ctc.chapter1;

/**
 * Created by vineet on 8/31/14.
 *
 * //Implement a function to perform basic RLE string compression
 * if the string doesnt become smaller , return the original string
 */
public class Q5 {
  public static int checkCompression(String s1){
    int i = 0;
    int count= 0;
    int len = s1.length();
    while(i < len){
      char localchar = s1.charAt(i);
      int localcount = 0;
      while((i<len) && s1.charAt(i) == localchar){
        localcount++;
        i++;
      }
      count += 1+ String.valueOf(localcount).length();
    }
    return count;
  }

  public static String compress(String s1){
    int len = s1.length();
    if(checkCompression(s1) >= len){
      return s1;
    }
    StringBuffer sb = new StringBuffer(len);
    int i = 0;
    int nw = 0;
    while(i < len){
      int localchar = s1.charAt(i);
      int localcount = 0;
      while((i < len) && (s1.charAt(i) == localchar) ){
        localcount++;
        i++;
      }
      sb.append((char)localchar);
      sb.append(localcount);
    }
    return sb.toString();
  }

  public static void main(String args[]){
    System.out.println(compress("aabbcde"));
  }
}
