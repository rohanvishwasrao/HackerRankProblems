package Algorithm;

import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/13/15.
 */
public class DiagonalDifference {

    public static void DiagonalDiff(int dimentions, Scanner in)
    {
        Scanner row = new Scanner(System.in);
        int [][] matrix = new int[dimentions][dimentions];
        for(int i =0; i < dimentions; i++)
        {
            String strRow = row.nextLine();
            char [] temp = strRow.toCharArray();
            char [] charRow = new char[100];
            int indx=0;
            for(char c : temp)
            {
                if(c!= ' ')
                    charRow[indx++] = c;
            }
            CreateMatrix(charRow,i, dimentions, matrix);
        }
        ProcessMatrix(matrix,dimentions);
    }

    public static void CreateMatrix(char [] charRow , int rowIndex, int dimentions, int [][] matrix)
    {

        for(int col = 0; col  < dimentions; col++)
        {
            matrix[rowIndex][col] = (int)charRow[col] - (int)'0' ;
        }
    }

    public static void ProcessMatrix(int [][] matrix, int dimentions)
    {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i = 0; i< dimentions; i++)
        {
            for (int j=0;j< dimentions; j++)
            {
                if(i==j)
                {
                    diagonal1 += matrix[i][j];
                }
                else if(( i==0 && j==dimentions-1 ) || (i== dimentions-1 && j== 0))
                {
                    diagonal2 += matrix[i][j];
                }
            }
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int dimentions = in.nextInt();
        DiagonalDiff(dimentions, in);
    }
}
