package General;

/**
 * Created by vineet on 6/15/14.
 */
public class XPowerY {
  public static double power(int x , int y){
    double z;
    if(y == 0)
      return 1;

    if(y%2 == 0){
      double temp = power(x , y/2);
      return temp*temp;
    }

    else{
      double temp = power(x , y/2);
      return x*temp*temp;
    }

  }
}
