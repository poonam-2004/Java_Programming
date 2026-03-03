///////////////////////////////////////////////////////////////////
//
//  Program Name : Program73_4
//  Description  : Check whether matrix is Identity matrix
//  Input        : Matrix
//  Output       : True / False
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program73_4
{
    public static boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        if(iRow != iCol)
        {
            return false;
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j && Arr[i][j] != 1)
                {
                    return false;
                }
                if(i != j && Arr[i][j] != 0)
                {
                    return false;
                }
            }
        }

        return true;
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

        boolean bRet = ChkIdentity(Arr,iRow,iCol);

        System.out.println(bRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case 
//
//  Input :
//  4 4
//  1 0 0 0
//  0 1 0 0
//  0 0 1 0
//  0 0 0 1
//
//  Output :
//  true
//
///////////////////////////////////////////////////////////////////