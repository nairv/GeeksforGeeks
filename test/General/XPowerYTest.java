package General;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by vineet on 6/15/14.
 */
public class XPowerYTest {
  @Test
  public void testPower() throws Exception {
    Assert.assertEquals(new Double(256), XPowerY.power(2,8));
    Assert.assertEquals(new Double(64) , XPowerY.power(4,3));
  }
}
