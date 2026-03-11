///////////////////////////////////////////////////////////////////
//
//  Program Name : Program77_2
//  Description  : Calculate train fare with class, Tatkal and senior discount
//  Input        : Distance, Class type, Booking hours before journey, Age
//  Output       : Final fare
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program77_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter distance : ");
        int distance = sobj.nextInt();

        System.out.print("Enter class (Sleeper/3AC/2AC) : ");
        String type = sobj.next();

        System.out.print("Enter booking hours before journey : ");
        int hours = sobj.nextInt();

        System.out.print("Enter age : ");
        int age = sobj.nextInt();

        int baseFare = distance * 2;

        if(type.equals("Sleeper"))
            baseFare += 200;
        else if(type.equals("3AC"))
            baseFare += 500;
        else if(type.equals("2AC"))
            baseFare += 800;
        else
        {
            System.out.println("Invalid Class");
            return;
        }

        if(hours <= 24)
        {
            baseFare += baseFare * 0.30;
        }

        if(age >= 60)
        {
            baseFare -= baseFare * 0.40;
        }

        System.out.println("Final Fare: ₹" + baseFare);

        sobj.close();
    }
}
