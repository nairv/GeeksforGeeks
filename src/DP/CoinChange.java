package DP;

/**
 * Created by vineet on 9/10/14.
 *
 * Coin change is a problem in which you are given a sum and some coins upto a given denomination
 * You are to go and find the way to distribute the coins in such a way as to minimize the number of coins
 *
 * Suppose we have denominations of coins of all values upto k
 * S[n] be the solution such that given a sum n , such that n > k
 *
 * S[n] = min(i + S[n-i]) ,for all 1<= i <= k
 * S[1] = 1
 *
 */
public class CoinChange {

  public static int coinChangeCount(int n , int k){

    int S[] = new int[n+1];
    S[0] = 0;
    S[1] = 1;
    for(int i = 2; i <= n; i++){
      S[i] = Integer.MAX_VALUE;
    }

    for(int i = 2; i <= n ; i++){
      for(int j = 1; j <= i && j <= k; j++){
        int count = S[i-j] + 1;
        if(count < S[i])
          S[i] = count;
      }
    }

    return S[n];

  }



  public static void main(String args[]){
    System.out.println("The minimum number of coins for a sum of 957 and 14 denominations are :"+ coinChangeCount(957 , 14));
  }
}
