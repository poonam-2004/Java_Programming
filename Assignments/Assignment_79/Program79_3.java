///////////////////////////////////////////////////////////////////
//
//  Program Name : Program79_3
//  Description  : Analyze warehouse inventory using 2D array
//  Input        : Products and warehouses with stock
//  Output       : Total stock per product and warehouse
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program79_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of products : ");
        int P = sobj.nextInt();

        System.out.print("Enter number of warehouses : ");
        int W = sobj.nextInt();

        if(P <= 0 || W <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[P][W];

        System.out.println("Enter stock quantities :");

        for(int i = 0; i < P; i++)
        {
            for(int j = 0; j < W; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        System.out.println("\nTotal Stock Per Product:");

        for(int i = 0; i < P; i++)
        {
            int sum = 0;

            for(int j = 0; j < W; j++)
            {
                sum = sum + arr[i][j];
            }

            System.out.println("Product " + (i+1) + " : " + sum);
        }

        System.out.println("\nTotal Stock Per Warehouse:");

        for(int j = 0; j < W; j++)
        {
            int sum = 0;

            for(int i = 0; i < P; i++)
            {
                sum = sum + arr[i][j];
            }

            System.out.println("Warehouse " + (j+1) + " : " + sum);
        }

        sobj.close();
    }
}
