///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_5
//  Description  : Calculate income tax using slabs
//  Input        : Annual income
//  Output       : Tax payable
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter annual income : ");
        int income = sobj.nextInt();

        double tax = 0;

        if(income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(income <= 250000)
        {
            tax = 0;
        }
        else if(income <= 500000)
        {
            tax = (income - 250000) * 0.05;
        }
        else if(income <= 1000000)
        {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        }
        else
        {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        System.out.println("Annual Income: ₹" + income);
        System.out.println("Total Tax Payable: ₹" + tax);

        sobj.close();
    }
}
