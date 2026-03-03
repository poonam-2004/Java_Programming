///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_3
//  Description  : Find largest element from both diagonals
//  Input        : Matrix
//  Output       : Maximum element
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program72_3
{
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if((i == j) || (i + j == iRow - 1))
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
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

        int iRet = MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Maximum element from diagonals is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Output : 9
//
///////////////////////////////////////////////////////////////////