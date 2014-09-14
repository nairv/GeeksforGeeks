package Challenges;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * Created by vineet on 9/13/14.
 * Bounded FIFO, concurrency-safe memoize.

 Implement a bounded version of 'memoize' for functions of a single argument.  That is, your code should accept a single-argument function 'f' (or function Object, if you roll Java style) and an integer 'k', and return a new function that behaves identically to 'f' but caches the last k values computed.  The cache should be "first-in, first-out" -- that is, if 'x' is in the cache then calling f(x) does not change its eviction order.

 For example, suppose f' = bounded-memoize(f, 2).
 Calling f'(0) caches and returns f(0).
 Then calling f'(1) caches and returns f(1).
 Then calling f'(0) returns the cached f(0) without calling f.
 Then calling f'(2) caches and returns f(2) and evicts f(0).
 Finally calling f'(0), caches and returns f(0) and evicts f(1).

 */
class MyLinkedHashMap {
  private static MyLinkedHashMap instance;
  private static LinkedHashMap hmInstance;
  private int MAX_ENTRIES;
  private MyLinkedHashMap(int k){
    MAX_ENTRIES = k;
    hmInstance = new LinkedHashMap(MAX_ENTRIES+1 , 0.75F , false){
      protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>  MAX_ENTRIES;
      }
    };
    System.out.println("Creating a cache with "+ k + " entries");
    MAX_ENTRIES = k;

  }
  //Lock for modifying operations on the HashMap
  private static final Object hmlock = new Object();
  public synchronized boolean containsKey(Object obj){
      return hmInstance.containsKey(obj);

  }

  public synchronized Object put(Object obj , Boolean b){

      if(hmInstance.containsKey(obj)){
        System.out.println(obj.toString() + " already exists");
        return obj;
      }
      else{
        synchronized (hmlock){
          System.out.println("Putting "+ obj.toString() + " in the cache");
          return hmInstance.put(obj, b);
        }
      }

  }

  //Lock for exist check for the hashMap
  private static final Object existLock = new Object();
  public static synchronized MyLinkedHashMap getInstance(int k){
    synchronized (existLock){
      if(instance == null){
        instance = new MyLinkedHashMap(k);
      }

      return instance;
    }
  }

  public synchronized void printKeys(){
    System.out.println(hmInstance);
  }

}
public class ConcurrentMemoize {
  private static MyLinkedHashMap hm;
  public interface Function {
    // does not take or return nil
    Object call (Object x);
  }

  static class MyFunction implements Function{
    public Object call(Object obj){
      Object obj1 = hm.put(obj,true);
      return obj1;
    }
  }

  // Return a bounded memoized version of fn 'f'
  // that caches the last 'k' computed values
  public static Function boundedMemoize(Function f, int k) {
    // Your code here
    hm = MyLinkedHashMap.getInstance(k);
    return f;
  }

  public static void main(String args[]){

    Function f = boundedMemoize( new MyFunction(), 3);
    f.call("Vineet");
    f.call("Vineet");
    f.call("Vin1");
    f.call("Vin2");
    hm.printKeys();
    f.call("Vin3");
    hm.printKeys();

  }
}
