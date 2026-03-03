///////////////////////////////////////////////////////////////////
//
//  Program Name : Program73_5
//  Description  : Check whether matrix is Sparse matrix
//  Input        : Matrix
//  Output       : True / False
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program73_5
{
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int iZero = 0;
        int iTotal = iRow * iCol;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZero++;
                }
            }
        }

        if(iZero > (iTotal/2))
        {
            return true;
        }
        else
        {
            return false;
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

        System.out.println("Enter matrix elements : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        boolean bRet = ChkSparse(Arr,iRow,iCol);

        System.out.println("Matrix is sparse : " + bRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Enter number of rows : 4
//  Enter number of columns : 4
//
//  Enter matrix elements :
//  1 0 3 0
//  0 6 0 0
//  0 0 1 0
//  9 0 0 9
//
//  Output :
//  Matrix is sparse : true
//
///////////////////////////////////////////////////////////////////