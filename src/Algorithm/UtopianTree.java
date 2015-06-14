package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/11/15.
 */
public class UtopianTree {

    public static int  UtopianTreeProblem(int number)
    {
        if(number >= 0)
        {
            if(number == 0)
            {
                return 1;
            }
            if(number == 1)
            {
                return 2;
            }
            else if(number % 2 == 0)
            {
                return UtopianTreeProblem(number-1)+1;
            }
            else if (number % 2 == 1)
            {
                return UtopianTreeProblem(number-1) * 2;
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<Integer>();

        int numOfTestCases = in.nextInt();
        for(int i = 0 ;i <  numOfTestCases ;i++ )
        {
            int numOfCycle = in.nextInt();
            resultList.add(UtopianTreeProblem(numOfCycle));
        }
        for (int i = 0 ; i< resultList.size() ; i++) {
            System.out.println(resultList.get(i));
        }
    }
}
