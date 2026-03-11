///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_4
//  Description  : Calculate movie ticket price based on age group
//  Input        : Age of person
//  Output       : Ticket price
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sobj.nextInt();

        int ticket = 0;

        if(age < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        else if(age <= 12)
        {
            ticket = 100;
        }
        else if(age <= 59)
        {
            ticket = 200;
        }
        else
        {
            ticket = 150;
        }

        System.out.println("Ticket Price : ₹" + ticket);

        sobj.close();
    }
}
