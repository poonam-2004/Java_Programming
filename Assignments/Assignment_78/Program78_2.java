///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_2
//  Description  : Count valid and duplicate votes
//  Input        : Number of votes and voter IDs
//  Output       : Valid votes and duplicate votes
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of votes : ");
        int n = sobj.nextInt();

        if(n < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;

        System.out.println("Enter voter IDs : ");

        for(int i = 0; i < n; i++)
        {
            int id = sobj.nextInt();

            if(id < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(set.contains(id))
            {
                duplicate++;
            }
            else
            {
                set.add(id);
            }
        }

        System.out.println("Valid Votes : " + set.size());
        System.out.println("Rejected Duplicate Votes : " + duplicate);

        sobj.close();
    }
}