///////////////////////////////////////////////////////////////////
//
//  Program Name : Program76_3
//  Description  : Calculate courier charge based on parcel weight
//  Input        : Parcel weight
//  Output       : Courier charge
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program76_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter parcel weight in kg : ");
        int weight = sobj.nextInt();

        int charge = 0;

        if(weight <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(weight <= 1)
        {
            charge = 50;
        }
        else if(weight <= 5)
        {
            charge = 50 + ((weight - 1) * 20);
        }
        else
        {
            charge = 150 + ((weight - 5) * 30);
        }

        System.out.println("Parcel Weight: " + weight + " kg");
        System.out.println("Courier Charge: ₹" + charge);

        sobj.close();
    }
}

/*

Test Case 1
Input : 1
Output :
Parcel Weight: 1 kg
Courier Charge: ₹50

--------------------------------

Test Case 2
Input : 3
Output :
Parcel Weight: 3 kg
Courier Charge: ₹90

--------------------------------

Test Case 3
Input : 7
Output :
Parcel Weight: 7 kg
Courier Charge: ₹210

*/