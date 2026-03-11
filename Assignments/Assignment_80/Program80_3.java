///////////////////////////////////////////////////////////////////
//
//  Program Name : Program80_3
//  Description  : Determine if robot path exists in warehouse grid
//  Input        : Grid with 0 (free) and -1 (obstacle)
//  Output       : Path Available or No Path Found
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program80_3
{
    public static boolean CheckPath(int arr[][], int i, int j, int R, int C)
    {
        if(i >= R || j >= C || arr[i][j] == -1)
        {
            return false;
        }

        if(i == R-1 && j == C-1)
        {
            return true;
        }

        return CheckPath(arr, i+1, j, R, C) || CheckPath(arr, i, j+1, R, C);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int R = sobj.nextInt();

        System.out.print("Enter columns : ");
        int C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[R][C];

        System.out.println("Enter grid values:");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != -1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        boolean bRet = CheckPath(arr,0,0,R,C);

        if(bRet == true)
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("No Path Found");
        }

        sobj.close();
    }
}

