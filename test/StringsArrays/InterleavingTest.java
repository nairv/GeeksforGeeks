package StringsArrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vineet on 9/2/14.
 */
public class InterleavingTest {
  @Test
  public void testIsInterleaved() throws Exception {
    Assert.assertTrue(Interleaving.isInterleaved("XY" ,"WZ" ,"WZXY"));
    Assert.assertFalse(Interleaving.isInterleaved("XXY", "XXZ", "XXZXXXY"));

  }
}
