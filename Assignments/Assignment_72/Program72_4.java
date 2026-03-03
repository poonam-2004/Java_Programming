///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_4
//  Description  : Addition of elements from each column
//  Input        : Matrix
//  Output       : Column wise sum
//  Author       : Poonam Narayan Palkar
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program72_4
{
    public static void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;

        for(int j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + "\t");
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

        AddColumn(Arr, iRow, iCol);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Output :
//  18   18   15   25
//
///////////////////////////////////////////////////////////////////