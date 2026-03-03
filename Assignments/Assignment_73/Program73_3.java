///////////////////////////////////////////////////////////////////
//
//  Program Name : Program73_3
//  Description  : Reverse contents of each column
//  Input        : Matrix
//  Output       : Updated matrix
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program73_3
{
    public static void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            int start = 0;
            int end = iRow - 1;

            while(start < end)
            {
                int temp = Arr[start][j];
                Arr[start][j] = Arr[end][j];
                Arr[end][j] = temp;

                start++;
                end--;
            }
        }
    }

    public static void Display(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        ReverseCol(Arr,iRow,iCol);

        System.out.println("Matrix after reversing columns :");
        Display(Arr,iRow,iCol);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input :
//  Rows : 4
//  Cols : 4
//
//  Matrix :
//  3 2 5 9
//  4 3 2 2
//  8 4 1 9
//  3 9 7 5
//
//  Output :
//  3 9 7 5
//  8 4 1 9
//  4 3 2 2
//  3 2 5 9
//
///////////////////////////////////////////////////////////////////