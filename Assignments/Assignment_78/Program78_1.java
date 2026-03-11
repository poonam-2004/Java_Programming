///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_1
//  Description  : Calculate hotel bill with discount for long stay
//  Input        : Number of days stayed
//  Output       : Final bill amount
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of days stayed : ");
        int days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int bill = days * 3000;

        if(days > 7)
        {
            bill = bill - (bill * 5 / 100);
        }

        System.out.println("Total Stay Duration : " + days + " days");
        System.out.println("Final Bill Amount : ₹" + bill);

        sobj.close();
    }
}
