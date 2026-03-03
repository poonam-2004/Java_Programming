///////////////////////////////////////////////////////////////////
//
//  Program Name : Program66_3
//  Description  : ON bit at given position
//  Input        : One integer number and position
//  Output       : Modified number
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program66_3
{
    public static int OnBit(int iNo, int iPos)
    {
        int iMask = 1 << (iPos - 1);
        return (iNo | iMask);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.print("Enter position : ");
        int iPos = sobj.nextInt();

        int iRet = OnBit(iValue, iPos);

        System.out.println("Modified number is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 10  3
//  Output : 14
//
///////////////////////////////////////////////////////////////////