import java.util.*;
public class SubsetofArray
{
  public static void main (String[]args) throws Exception
  {
    try (Scanner scn = new Scanner (System.in)) {
      System.out.println("Enter the size of the elemlent:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array of your size:");
        for (int i = 0; i < arr.length; i++)
        {
          arr[i] = scn.nextInt ();
        }
        int limit = (int) Math.pow (2, arr.length);
        for (int i = 0; i < limit; i++)
        {
          String set = "";
          int temp = i;
          for (int j = arr.length - 1; j >= 0; --j)
          {
            int rem = temp % 2;
            temp = temp / 2;
            if (rem == 0)   //nothing to be printed
            {
              set = "-    " + set;
            }
            else
            {

              set = arr[j] + "    " + set;
            }
          }
          System.out.println (set);
        }
    }
  }
}