///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_2
//  Description  : Check personal loan eligibility
//  Input        : Age, Income, Credit score, Existing loan
//  Output       : Loan Approved / Loan Rejected
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sobj.nextInt();

        System.out.print("Enter monthly income : ");
        int income = sobj.nextInt();

        System.out.print("Enter credit score : ");
        int score = sobj.nextInt();

        System.out.print("Existing unpaid loan (Yes/No) : ");
        String loan = sobj.next();

        if(age < 0 || income < 0 || score < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(!(loan.equals("Yes") || loan.equals("No")))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(age < 21 || age > 60)
        {
            System.out.println("Loan Rejected: Age not eligible");
        }
        else if(income < 25000)
        {
            System.out.println("Loan Rejected: Income too low");
        }
        else if(score < 700)
        {
            System.out.println("Loan Rejected: Credit score too low");
        }
        else if(loan.equals("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}

/*

Test Case 1
Input :
Age : 30
Income : 40000
Score : 750
Loan : No
Output :
Loan Approved

--------------------------------

Test Case 2
Input :
Age : 19
Income : 40000
Score : 750
Loan : No
Output :
Loan Rejected: Age not eligible

--------------------------------

Test Case 3
Input :
Age : 30
Income : 20000
Score : 750
Loan : No
Output :
Loan Rejected: Income too low

*/