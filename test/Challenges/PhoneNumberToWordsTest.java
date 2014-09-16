package Challenges;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by vineet on 9/15/14.
 */
public class PhoneNumberToWordsTest {
  @Test
  public void testGenerateWordsNoDictionary() throws Exception {
    ArrayList<String> result = Challenges.PhoneNumberToWords.generateWordsNoDictionary("432");

    System.out.println(result.toString());

  }

  @Test
  public void testGenerateWordsInDictionary() throws Exception {
    ArrayList<String> result = Challenges.PhoneNumberToWords.generateWordsInDictionary("263");

    System.out.println(result.toString());
  }
}
