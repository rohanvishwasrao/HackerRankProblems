package Algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by rvishwasrao on 6/13/15.
 */
public class PlusMinus {

    public static void FindAndPrintFractions(int [] intArray)
    {
        int count = intArray.length;
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int i = 0 ;i < count; i++)
        {
            int curr = intArray[i];
            if(curr == 0)
            {
                zero++;
            }
            else if(curr > 0)
            {
                pos++;
            }
            else if (curr < 0)
            {
                neg++;
            }
        }
        System.out.println(String.format("%.3f",pos/count));
        System.out.println(String.format("%.3f",neg/count));
        System.out.println(String.format("%.3f",zero/count));
    }

    public static void main(String [] args) {
        Scanner sz = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int intSize = sz.nextInt();
        String input = in.nextLine();

        StringTokenizer strToken = new StringTokenizer(input);

        int[] intArray = new int[intSize];
        for (int x = 0; x < intSize; x++) {
            intArray[x] = Integer.parseInt((String) strToken.nextElement());
        }

        FindAndPrintFractions(intArray);
    }
}
