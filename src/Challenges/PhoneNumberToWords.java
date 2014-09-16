package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vineet on 9/15/14.
 * print valid words corresponding to a given phone number, no dictionary given first case
 * print valid words for a phone number , given a dictionary

 */
public class PhoneNumberToWords {
  private static ArrayList<String> result = new ArrayList<String>();
  private static HashMap<Integer , List<Character>> numberToLetters = new HashMap<Integer, List<Character>>();
  static{
    numberToLetters.put(0 , new ArrayList<Character>(Arrays.asList('0')));
    numberToLetters.put(1 , new ArrayList<Character>(Arrays.asList('1')));
    numberToLetters.put(2 , new ArrayList<Character>(Arrays.asList('A', 'B', 'C')));
    numberToLetters.put(3 , new ArrayList<Character>(Arrays.asList('D','E','F')));
    numberToLetters.put(4 , new ArrayList<Character>(Arrays.asList('G','H' ,'I')));
    numberToLetters.put(5 , new ArrayList<Character>(Arrays.asList('J','K','L')));
    numberToLetters.put(6 , new ArrayList<Character>(Arrays.asList('M','N','O')));
    numberToLetters.put(7 , new ArrayList<Character>(Arrays.asList('P','Q','R')));
    numberToLetters.put(8 , new ArrayList<Character>(Arrays.asList('T','U','V')));
    numberToLetters.put(9 , new ArrayList<Character>(Arrays.asList('W','X','Y','Z')));
  }
  public static void generateWordsNoDictionary(String phoneNumber){
    StringBuilder partialWord = new StringBuilder();

    generateWords(phoneNumber , partialWord);

  }

  public static void generateWords(String partialPhoneNumber , StringBuilder partialWord){
    if(partialPhoneNumber.length() == 0){
      result.add(partialWord.toString());
      return;
    }

    int firstNumber = Integer.parseInt(partialPhoneNumber.substring(0,1));
    String remainingNumber = partialPhoneNumber.substring(1);

    int length = partialWord.length();
    for(Character c: numberToLetters.get(firstNumber)){
      partialWord.setLength(length);
      generateWords(remainingNumber, partialWord.append(c));
    }
  }

  public static void main(String args[]){
    generateWordsNoDictionary("432");
    System.out.println(result.toString());


  }
}
