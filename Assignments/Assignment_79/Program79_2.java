///////////////////////////////////////////////////////////////////
//
//  Program Name : Program79_2
//  Description  : Manage cinema hall seating using 2D array
//  Input        : Rows, Columns and seat status
//  Output       : Total booked seats, row with max bookings, full row check
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program79_2
{
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

        System.out.println("Enter seat matrix (0 or 1):");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int totalBooked = 0;
        int maxRow = 0;
        int maxCount = 0;
        boolean fullRow = false;

        for(int i = 0; i < R; i++)
        {
            int count = 0;

            for(int j = 0; j < C; j++)
            {
                if(arr[i][j] == 1)
                {
                    totalBooked++;
                    count++;
                }
            }

            if(count > maxCount)
            {
                maxCount = count;
                maxRow = i;
            }

            if(count == C)
            {
                fullRow = true;
            }
        }

        System.out.println("\nTotal Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + (maxRow + 1));

        if(fullRow == true)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        sobj.close();
    }
}
