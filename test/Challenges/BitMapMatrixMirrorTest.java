package Challenges;

import org.junit.Test;
import utils.Arrays;

/**
 * Created by vineet on 9/16/14.
 */
public class BitMapMatrixMirrorTest {
  @Test
  public void testMirrorImage() throws Exception {
    int matrix[][] = {{1 , 2 , 3 , 4}, {10 , 20 , 30 , 40}};
    matrix = Challenges.BitMapMatrixMirror.mirrorImage(matrix);
    Arrays al = new Arrays();
    Arrays.toString(matrix);
  }
}
