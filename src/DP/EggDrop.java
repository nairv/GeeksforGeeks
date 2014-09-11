package DP;

/**
 * Created by vineet on 9/10/14.
 * Egg Dropping puzzle : Find the minimum number of trials that would be needed to find the safest floors among
 * k floors from which an egg can be dropped if we have n eggs
 *
 * Base cases :
 * 1) if we have 1 egg and k floors , we would need k trials in the worst case
 * 2) if we have 0 eggs and k floors , we would have 0 trials
 * 3) if we have n eggs and 0/1  floors , we would have 0/1 trials
 *
 * Let egg[i][j] represent the min no of trials that would be needed to get the solution with j floors and i eggs
 * if egg[i][j] = 1+ min(max(egg[i-1][x-1] , egg[i][j-x])
 * Two cases:
 * we drop the egg at xth floor:
 * 1) it breaks then we are left with i-1 eggs and we need to check all floors less than x floors(x-1) floors
 * 2) it doesnt break, that means we have i eggs and we need to check for j-x floors
 *
 */
public class EggDrop {
  public static int getMinTrials(int n , int k){
    int[][] egg = new int[n+1][k+1];

    for(int i = 0; i < n ; i++){
      egg[i][0] = 0;
      egg[i][1] = 1;
    }

    for(int j = 0; j < k; j++){
      egg[1][j] = j;
    }

    for(int i = 2; i <= n ; i++){

      for( int j = 2 ; j <= k ; j++){

        egg[i][j] = Integer.MAX_VALUE;
        for(int x = 1; x <= j ; x++){
          int res = 1 + Math.max(egg[i-1][x-1] , egg[i][j-x]);
          if(res < egg[i][j])
            egg[i][j] = res;
        }
      }
    }


    return egg[n][k];
  }


  public static void main(String args[]){
    System.out.println("Minimum number of trials required for 2 eggs and 100 floors is "+ getMinTrials(2,100));
    System.out.println("Minimum number of trials required for 3 eggs and 100 floors is "+ getMinTrials(3,100));

  }
}
