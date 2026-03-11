///////////////////////////////////////////////////////////////////
//
//  Program Name : Program76_5
//  Description  : Display battery status
//  Input        : Battery percentage
//  Output       : Battery status
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program76_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter battery percentage : ");
        int battery = sobj.nextInt();

        if(battery < 0 || battery > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        String status;

        if(battery <= 5)
        {
            status = "Critical";
        }
        else if(battery <= 15)
        {
            status = "Low";
        }
        else
        {
            status = "Normal";
        }

        System.out.println("Battery Percentage: " + battery + "%");
        System.out.println("Status: " + status);

        sobj.close();
    }
}

/*

Test Case 1
Input : 3
Output :
Battery Percentage: 3%
Status: Critical

--------------------------------

Test Case 2
Input : 10
Output :
Battery Percentage: 10%
Status: Low

--------------------------------

Test Case 3
Input : 50
Output :
Battery Percentage: 50%
Status: Normal

--------------------------------

Test Case 4
Input : 120
Output :
Invalid Input

*/