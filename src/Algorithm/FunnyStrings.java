package Algorithm;

import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/13/15.
 */
public class FunnyStrings {

    public static String  DetermineIfFunnyOrNot(String str)
    {
        String revString = new StringBuilder(str).reverse().toString();
        char [] strArray = str.toCharArray();
        char [] revArray = revString.toCharArray();

        for(int i = 1;i< strArray.length ; i++)
        {
            if(Math.abs(strArray[i] - strArray[i-1]) != Math.abs(revArray[i] - revArray[i-1]))
            {
                return "Not Funny";
            }
            else if(i == strArray.length-1)
            {
                return "Funny";
            }
        }
        return "Not Funny";

    }
    public static void main(String [] aregs)
    {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        String [] inputString = new String[testCases];
        for(int i = 0 ;i < testCases ; i++)
        {
            Scanner inp = new Scanner(System.in);
            inputString[i]= inp.nextLine();
        }
        for(int i =0;i< testCases; i++)
        {
            System.out.println(DetermineIfFunnyOrNot(inputString[i]));
        }

    }
}
