///////////////////////////////////////////////////////////////////
//
//  Program Name : Program79_5
//  Description  : Analyze sales of products across months
//  Input        : Sales matrix
//  Output       : Best selling product and total monthly sales
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program79_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of products : ");
        int P = sobj.nextInt();

        System.out.print("Enter number of months : ");
        int M = sobj.nextInt();

        if(P <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[P][M];

        System.out.println("Enter sales data:");

        for(int i = 0; i < P; i++)
        {
            for(int j = 0; j < M; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int bestProduct = 0;
        int maxSales = 0;

        for(int i = 0; i < P; i++)
        {
            int sum = 0;

            for(int j = 0; j < M; j++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > maxSales)
            {
                maxSales = sum;
                bestProduct = i;
            }
        }

        System.out.println("\nBest Selling Product : Product " + (bestProduct + 1));
        System.out.println("Total Sales : " + maxSales);

        System.out.println("\nMonthly Sales:");

        for(int j = 0; j < M; j++)
        {
            int sum = 0;

            for(int i = 0; i < P; i++)
            {
                sum = sum + arr[i][j];
            }

            System.out.println("Month " + (j+1) + " : " + sum);
        }

        sobj.close();
    }
}

