///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_3
//  Description  : Count goal achieved days and maximum steps
//  Input        : Steps of 7 days
//  Output       : Goal achieved days and maximum steps
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int steps[] = new int[7];
        int goalDays = 0;
        int max = 0;

        System.out.println("Enter steps for 7 days : ");

        for(int i = 0; i < 7; i++)
        {
            steps[i] = sobj.nextInt();

            if(steps[i] < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(steps[i] >= 10000)
            {
                goalDays++;
            }

            if(steps[i] > max)
            {
                max = steps[i];
            }
        }

        System.out.println("Goal Achieved Days : " + goalDays);
        System.out.println("Maximum Steps in Week : " + max);

        sobj.close();
    }
}
