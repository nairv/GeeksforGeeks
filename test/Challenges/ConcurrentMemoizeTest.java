package Challenges;

import org.junit.Test;

import static Challenges.ConcurrentMemoize.boundedMemoize;

/**
 * Created by vineet on 9/13/14.
 */
public class ConcurrentMemoizeTest {
  @Test
  public void testBoundedMemoize() throws Exception {
    ConcurrentMemoize.Function f = null;
    f = boundedMemoize( f, 3);
    f.call("Vineet");
    f.call("Vineet");
    f.call("Vin1");
    f.call("Vin2");
    MyLinkedHashMap hm = MyLinkedHashMap.getInstance();
    hm.printKeys();
    f.call("Vin3");
    hm.printKeys();
  }
}
