///////////////////////////////////////////////////////////////////
//
//  Program Name : Program77_3
//  Description  : Suggest cheapest mobile plan
//  Input        : Call minutes, Data usage, SMS count
//  Output       : Recommended plan and cost
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program77_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter call minutes : ");
        int mins = sobj.nextInt();

        System.out.print("Enter data usage (GB) : ");
        int gb = sobj.nextInt();

        System.out.print("Enter SMS count : ");
        int sms = sobj.nextInt();

        int planA = 199;
        int planB = 299;
        int planC = 399;
        int planD = 499;

        int minCost = Math.min(Math.min(planA, planB), Math.min(planC, planD));

        if(minCost == planA)
            System.out.println("Recommended Plan: Plan A ₹199");
        else if(minCost == planB)
            System.out.println("Recommended Plan: Plan B ₹299");
        else if(minCost == planC)
            System.out.println("Recommended Plan: Plan C ₹399");
        else
            System.out.println("Recommended Plan: Plan D ₹499");

        sobj.close();
    }
}
