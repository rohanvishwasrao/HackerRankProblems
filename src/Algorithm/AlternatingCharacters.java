package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/15/15.
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTestCases = in.nextInt();
        List<String> sl = new ArrayList<String>();
        for (int i =0;i < noOfTestCases; i++)
        {
            in = new Scanner(System.in);
            String tCase = in.nextLine();
            sl.add(tCase);
        }

        printDeletions(sl);
    }
    private static void printDeletions(List<String> sl)
    {
        for(String s: sl) {
            System.out.println(countDeletions(s));
        }
    }
    private static int countDeletions(String sl)
    {
        int noOfDeletions =0;
        String str = sl;
        int curr = 0;
        int next;
        char [] cArray = str.toCharArray();
        if (str.length() == 1 ) return 0;
        else{
             next = 1;
        }
        while(next < str.length())
        {
            if(cArray[curr] == cArray[next]) {
                noOfDeletions++;
            }
            else
            {
                curr = next;
            }
            next++;
        }
        return noOfDeletions;
    }

}
