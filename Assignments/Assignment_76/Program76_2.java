///////////////////////////////////////////////////////////////////
//
//  Program Name : Program76_2
//  Description  : Check scholarship eligibility
//  Input        : Marks, Attendance, Family income
//  Output       : Scholarship Approved / Rejected
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program76_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter marks percentage : ");
        int marks = sobj.nextInt();

        System.out.print("Enter attendance percentage : ");
        int attendance = sobj.nextInt();

        System.out.print("Enter family income : ");
        int income = sobj.nextInt();

        if(marks < 0 || marks > 100 || attendance < 0 || attendance > 100 || income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(marks < 80)
        {
            System.out.println("Scholarship Rejected: Marks too low");
        }
        else if(attendance < 75)
        {
            System.out.println("Scholarship Rejected: Attendance too low");
        }
        else if(income > 300000)
        {
            System.out.println("Scholarship Rejected: Income too high");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }

        sobj.close();
    }
}

/*

Test Case 1
Input :
85
80
200000

Output :
Scholarship Approved

--------------------------------

Test Case 2
Input :
70
80
200000

Output :
Scholarship Rejected: Marks too low

--------------------------------

Test Case 3
Input :
85
70
200000

Output :
Scholarship Rejected: Attendance too low

--------------------------------

Test Case 4
Input :
85
80
400000

Output :
Scholarship Rejected: Income too high

*/