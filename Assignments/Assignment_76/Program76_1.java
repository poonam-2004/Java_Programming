///////////////////////////////////////////////////////////////////
//
//  Program Name : Program76_1
//  Description  : Calculate ride fare based on distance and peak hour
//  Input        : Distance and peak hour status
//  Output       : Total ride fare
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program76_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter distance in km : ");
        int distance = sobj.nextInt();

        System.out.print("Peak hour (Yes/No) : ");
        String peak = sobj.next();

        if(distance < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int fare = 50;

        if(distance <= 10)
        {
            fare = fare + (distance * 12);
        }
        else
        {
            fare = fare + (10 * 12) + ((distance - 10) * 15);
        }

        if(peak.equals("Yes"))
        {
            fare = (int)(fare + (fare * 0.20));
        }

        System.out.println("Distance: " + distance + " km");
        System.out.println("Peak Hour: " + peak);
        System.out.println("Total Fare: ₹" + fare);

        sobj.close();
    }
}

/*

Test Case 1
Input :
5
No

Output :
Distance: 5 km
Peak Hour: No
Total Fare: ₹110

--------------------------------

Test Case 2
Input :
12
No

Output :
Distance: 12 km
Peak Hour: No
Total Fare: ₹200

--------------------------------

Test Case 3
Input :
12
Yes

Output :
Distance: 12 km
Peak Hour: Yes
Total Fare: ₹240

*/