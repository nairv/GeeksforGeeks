package StringsArrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vineet on 9/13/14.
 *
 * Hackerrank Question
 * https://www.hackerrank.com/challenges/bus-station
 *
 * There are n groups of friends, and each group is numbered from 1 to n. The i th group contains a i people.

 They live near a bus stop, and only a single bus operates on this route. An empty bus arrives at the bus stop and all the groups want to travel by the bus.

 However, group of friends do not want to get separated. So they enter the bus only if the bus can carry the entire group.

 Moreover, the groups do not want to change their relative positioning while travelling. In other words, group 3 cannot travel by bus, unless group 1 and group 2 have either (a) already traveled by the bus in the previous trip or (b) they are also sitting inside the bus at present.

 You are given that a bus of size x can carry x people simultaneously.

 Find the size x of the bus so that (1) the bus can transport all the groups and (2) every time when the bus starts from the bus station, there is no empty space in the bus (i.e. the total number of people present inside the bus is equal to x)?

 Input Format
 The first line contains an integer n (1≤n≤105). The second line contains n space-separated integers a1,a2,…,an (1≤ai≤104).

 Output Format

 Print all possible sizes of the bus in an increasing order.
 */
public class BusStation {
  public static void printBusSizes(ArrayList<Integer> groups){
    ArrayList<Integer> busSizes = new ArrayList<Integer>();
    int sum = 0;
    for(int i: groups){
      sum+= i;
    }

    for(int size = 1; size <= sum; size++){
      // For each bus size
      int num = 0;
      boolean nextSize = false;
      for(int group:groups){
        if(group > size){
          nextSize = true;
          break;
        }
        else{
          int thiscount = num + group;
          if(thiscount == size){
            num = 0;
          }
          else if(thiscount < size){
            num = thiscount;
          }
          else{
            nextSize = true;
            break;
          }
        }
      }
      if(num == 0 && !nextSize){
        busSizes.add(size);
      }

    }
    System.out.println(busSizes.toString());

  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int numGroups = Integer.parseInt(sc.nextLine());
    ArrayList<Integer> al = new ArrayList<Integer>();
    String s = sc.nextLine();
    String[] arr = s.split(" ");
    for(int i = 0; i < numGroups;i++){
      al.add(Integer.parseInt(arr[i]));
    }
    System.out.print("The bus sizes are :");
    printBusSizes(al);

  }
}
