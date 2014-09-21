package Challenges;

import java.util.Random;

/**
 * Created by vineet on 9/19/14.
 *
 * Generate k random samples from n items , n is very large
 */
public class ReservoirSampling {

  public int generateRandomNumbers(){
    Random r = new Random();
    //r.setSeed(System.currentTimeMillis());
    int randomNumber = r.nextInt();
    return randomNumber;
  }
}
