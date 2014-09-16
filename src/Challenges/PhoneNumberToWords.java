package Challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
  private static HashMap<String , Boolean> dict = new HashMap<String ,Boolean>();
  static{
    try{
      FileInputStream fis = new FileInputStream("/usr/share/dict/words");
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      String line;
      while((line = br.readLine()) != null){
        dict.put(line , true);
      }
    }
    catch(Exception ex){
      System.out.println("File not found");
    }
  }
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
    result = new ArrayList<String>();
    generateWords(phoneNumber , partialWord , false);

  }

  public static void generateWords(String partialPhoneNumber , StringBuilder partialWord , boolean useDict){
    if(partialPhoneNumber.length() == 0){
      if(useDict){
        if(!dict.containsKey(partialWord.toString()))
          return;
      }
      result.add(partialWord.toString());
      return;
    }

    int firstNumber = Integer.parseInt(partialPhoneNumber.substring(0,1));
    String remainingNumber = partialPhoneNumber.substring(1);

    int length = partialWord.length();
    for(Character c: numberToLetters.get(firstNumber)){
      partialWord.setLength(length);
      generateWords(remainingNumber, partialWord.append(c) , useDict);
    }
  }

  public static void generateWordsInDictionary(String phoneNumber){
    StringBuilder partialWord = new StringBuilder();
    result = new ArrayList<String>();
    generateWords(phoneNumber , partialWord , true);
  }

  public static void main(String args[]){
    generateWordsNoDictionary("432");

    System.out.println(result.toString());

    generateWordsInDictionary("432");

    System.out.println(result.toString());

  }
}
