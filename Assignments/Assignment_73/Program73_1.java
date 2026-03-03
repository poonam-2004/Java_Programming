///////////////////////////////////////////////////////////////////
//
//  Program Name : Program73_1
//  Description  : Display transpose of matrix
//  Input        : Matrix
//  Output       : Transpose matrix
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program73_1
{
    public static void Transpose(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iCol; i++)
        {
            for(int j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + "\t");
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

        System.out.println("Transpose of matrix :");
        Transpose(Arr,iRow,iCol);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
// Test Case
//
// Input
// 3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
//
// Output
// 3 4 8 3
// 2 3 4 9
// 5 2 1 7
// 9 2 5 5
//
///////////////////////////////////////////////////////////////////