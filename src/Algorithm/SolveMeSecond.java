package Algorithm;

import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/11/15.
 */
public class SolveMeSecond {
    public static int SolveMeFirst(int num1, int num2)
    {
        return num1+num2;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfInputs = in.nextInt();
        for(int i = 0; i< numOfInputs; i++) {
            int number1 = in.nextInt();
            int number2 = in.nextInt();
            int sum = SolveMeFirst(number1, number2);
            System.out.println(sum);
        }

    }
}