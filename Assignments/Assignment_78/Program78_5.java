///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_5
//  Description  : Calculate telecom call charge using slabs
//  Input        : Call duration in minutes
//  Output       : Total call charge
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter call duration in minutes : ");
        int minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int charge = 0;

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = (10 * 1) + ((minutes - 15) * 2);
        }

        System.out.println("Call Duration : " + minutes + " minutes");
        System.out.println("Total Call Charge : ₹" + charge);

        sobj.close();
    }
}
