package ctc.chapter2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by vineet on 9/2/14.
 * 1. Remove duplicates from an unsorted linked list
 * 2. What if temporary buffer was not allowed
 */
public class Q1<T> {

  public LinkedList<T> removeDuplicates(LinkedList<T> a){
    HashMap<T, Boolean> hm = new HashMap<T, Boolean>();
    Iterator<T> it = a.iterator();
    int i = 0;
   while(it.hasNext()){
      T temp = it.next();
      if(hm.get(temp) != null){
        it.remove();
      }
      else{
        hm.put(temp , Boolean.valueOf(true));
      }
     i++;
    }
    return a;
  }

  public LinkedList<T> removeDuplicatesWOBuffer(LinkedList<T> a){
    for(int i = 0 ; i < a.size(); i++){
      T temp = a.get(i);
      for ( int j = i+1; j < a.size() ; j++)
        if(temp == a.get(j))
          a.remove(j);

    }
    return a;
  }


  public static void main(String args[]){
    Q1<Integer> q1 = new Q1<Integer>();
    LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,2,1,5,6));
    utils.LinkedList.toStrings(l1);
    LinkedList<Integer> l2 = q1.removeDuplicates(l1);
    utils.LinkedList.toStrings(l2);;
    LinkedList<Integer> l3 = q1.removeDuplicatesWOBuffer(l1);
    utils.LinkedList.toStrings(l3);;
  }

}
