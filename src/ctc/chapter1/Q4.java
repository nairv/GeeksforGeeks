package ctc.chapter1;

/**
 * Created by vineet on 8/24/14.
 * Replace all space characters in a string as %20.
 * Assume that there is enough space in the end for incorporating the new characters
 * Has to be done in place
 */
public class Q4 {
  public static String spaceManip(String s1){
    System.out.println("String before: "+ s1);
    // a is the character array we will be dealing with
    char a[] = s1.toCharArray();

    // Get the length of the array
    int length = s1.length();
    int before, after;
    before = after = length -1;

    //Start from the back of the array until you reach a non space character
    while(a[before] == 32){
      before--;
    }
    if(before <= 0)
      return null;
    //At this point we reached a non space character
    //Start copying the non space characters into the last position

    while(after >= 0){
      if(a[before] != 32){
        a[after--] = a[before--];
      }
      else{
        a[after--] = '0';
        a[after--] = '2';
        a[after--] = '%';
        before--;
      }
    }

    //At this point we have the modified character array
    //Reconvert into a string
    s1 = new String(a);
    return s1;
  }


  public static void main(String args[]){
    System.out.println(spaceManip("I am Vineet    "));
  }
}
