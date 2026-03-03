///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_2
//  Description  : Count frequency of given number in matrix
//  Input        : Matrix and one number
//  Output       : Frequency
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program72_2
{
    public static int Frequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int iCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
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

        System.out.print("Enter number to search : ");
        int iNo = sobj.nextInt();

        int iRet = Frequency(Arr, iRow, iCol, iNo);

        System.out.println("Frequency is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input :
//  Number : 9
//
//  Output :
//  3
//
///////////////////////////////////////////////////////////////////