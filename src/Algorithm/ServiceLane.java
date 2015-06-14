package Algorithm;

import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/12/15.
 */
public class ServiceLane {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int [] widthArray = new int [100000];
        String lenghtOfHigwayAndT = in.nextLine();
        int n =  Integer.parseInt(lenghtOfHigwayAndT.split(" ")[0]);
        int t = Integer.parseInt(lenghtOfHigwayAndT.split(" ")[1]);
        String strWidth = in.nextLine().replaceAll(" ","");
        char [] charWidth = strWidth.toCharArray();
        for(int i = 0 ; i < n ; i++ )
        {
            widthArray[i] = (int)charWidth[i] - (int)'0' ;
        }
        for (int i = 0 ; i < t ; i++)
        {
            String testCase = in.nextLine();
            int start =  Integer.parseInt(lenghtOfHigwayAndT.split(" ")[0]);
            int end = Integer.parseInt(lenghtOfHigwayAndT.split(" ")[1]);
        }

    }
}
