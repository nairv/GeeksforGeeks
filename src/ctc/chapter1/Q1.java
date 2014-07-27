package ctc.chapter1;

/**
 * Created by vineet on 7/26/14.
 *
 * Question : Determine if the string has all unique characters
 * Assumption : Only 8 bit characters taken into consideration here
 */
public class Q1 {
  public static boolean hasUniqueCharacters(String s){
    char arr[] = new char[256];

    //Initialize a char array of 256 characters
    for(char c:arr){
      c = 0;
    }

    //For each character in the string , check if the corresponding position in the char array
    // is non zero
    for(Character c: s.toCharArray()){
      if(arr[c.charValue()] != 0){
        return false;
      }
      arr[c.charValue()] = 1;
    }

    //If it went through all the characters in the string,
    // return true
    return true;
  }

  public static void main(String args[]){
    String test = "Vviajdm\\";
    System.out.println("The string \"" +test + "\" has unique characters is "+ hasUniqueCharacters(test));
  }
}
