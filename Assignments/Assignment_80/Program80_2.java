///////////////////////////////////////////////////////////////////
//
//  Program Name : Program80_2
//  Description  : Check whether given square matrix is Magic Square
//  Input        : Size and matrix elements
//  Output       : Magic Square or Not
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program80_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter size of matrix : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[N][N];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int diag1 = 0, diag2 = 0;

        for(int i = 0; i < N; i++)
        {
            diag1 += arr[i][i];
            diag2 += arr[i][N-i-1];
        }

        boolean magic = true;

        for(int i = 0; i < N; i++)
        {
            int rowSum = 0, colSum = 0;

            for(int j = 0; j < N; j++)
            {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            if(rowSum != diag1 || colSum != diag1)
            {
                magic = false;
                break;
            }
        }

        if(magic && diag1 == diag2)
        {
            System.out.println("Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");
        }

        sobj.close();
    }
}
