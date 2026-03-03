///////////////////////////////////////////////////////////////////
//
//  Program Name : Program66_5
//  Description  : Toggle first and last nibble of given number
//  Input        : One integer number
//  Output       : Modified number
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program66_5
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0xF000000F;   // First & last nibble
        return (iNo ^ iMask);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = ToggleBit(iValue);

        System.out.println("Modified number is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 15
//  Output : 4026531840
//
///////////////////////////////////////////////////////////////////