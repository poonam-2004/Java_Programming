///////////////////////////////////////////////////////////////////
//
//  Program Name : Program73_2
//  Description  : Reverse contents of each row
//  Input        : Matrix
//  Output       : Updated matrix
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program73_2
{
    public static void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            int start = 0;
            int end = iCol - 1;

            while(start < end)
            {
                int temp = Arr[i][start];
                Arr[i][start] = Arr[i][end];
                Arr[i][end] = temp;

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

        System.out.print("Enter rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        ReverseRow(Arr,iRow,iCol);

        System.out.println("Matrix after reversing rows :");
        Display(Arr,iRow,iCol);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
// Example
//
// 3 2 5 9
// becomes
// 9 5 2 3
//
///////////////////////////////////////////////////////////////////