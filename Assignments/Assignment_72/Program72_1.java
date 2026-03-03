///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_1
//  Description  : Addition of diagonal element from matrix
//  Input        : Matrix element
//  Output       : Sum of diagonal elements
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program72_1
{
    public static int AddDiagonal(int Arr[][],int iRow, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements is : "+iRet);

        sobj.close();
    }
}