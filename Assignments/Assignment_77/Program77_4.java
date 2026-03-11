///////////////////////////////////////////////////////////////////
//
//  Program Name : Program77_4
//  Description  : Calculate water bill with late payment penalty
//  Input        : Units and weeks late
//  Output       : Total bill amount
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program77_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter water units : ");
        int units = sobj.nextInt();

        System.out.print("Enter weeks late : ");
        int weeks = sobj.nextInt();

        int bill = units * 10 + 100;

        double penalty = weeks * 0.02 * bill;

        if(penalty > bill * 0.10)
        {
            penalty = bill * 0.10;
        }

        double finalBill = bill + penalty;

        System.out.println("Bill Amount: ₹" + finalBill);

        sobj.close();
    }
}
