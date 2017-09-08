
/**PURPOSE:
 *  Determines what day Easter falls on. Can be used for any date in the Gregorian calendar from 1583 
 *  to any date after.
 * 
 * @author Created by Aarohi Zade 
 * @version September 7th 2017
 */
public class Easter
{
   public static void main(String[]args)
   {
      int y;
      int a;
      int b;
      int c;
      int d;
      int e;
      int f;
      int g;
      int h;
      int i;
      int k;
      int r;
      int m;
      int n;
      int p;
      y = 2017;
      a = y/19;
      b = y/100;
      c = (int)(y%100);
      d = b/4;
      e =(b%4);
      f = (b+8)/25;
      g = (b - f + 1)/3;
      h = (19 * a + b - d - g + 15)% 30 ;
      i = (c / 4);
      k = (c%4);
      r = (32 + 2 * e + 2 * i - h - k)/ 7 ;
      m = (a + 11 * h + 22 * r)/451;
      n = (h + r - 7 * m +114)/31;
      p = (h + r - 7 * m +114)/31;
      System.out.println("Easter month is" + n + "/" + (p+1) + "/" + y);
      
      
      
      
      
      
      
      
      
       
       
}
}
