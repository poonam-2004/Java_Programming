///////////////////////////////////////////////////////////////////
//
//  Program Name : Program77_5
//  Description  : Calculate cinema booking cost with group discount
//  Input        : Number of seats booked
//  Output       : Total cost
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program77_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of seats : ");
        int seats = sobj.nextInt();

        int price = seats * 200;

        if(seats >= 6)
        {
            price -= price * 0.10;
        }

        System.out.println("Total Cost: ₹" + price);

        sobj.close();
    }
}
