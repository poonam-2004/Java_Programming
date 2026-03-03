///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_5
//  Description  : Swap contents of consecutive rows
//  Input        : Matrix
//  Output       : Matrix after swapping rows
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program72_5
{
    public static void SwapRows(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow - 1; i = i + 2)
        {
            for(int j = 0; j < iCol; j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = temp;
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

        SwapRows(Arr, iRow, iCol);

        System.out.println("Matrix after swapping rows :");
        Display(Arr, iRow, iCol);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Output :
//
//  4 3 2 2
//  3 2 5 9
//  3 9 7 5
//  8 4 1 9
//
///////////////////////////////////////////////////////////////////