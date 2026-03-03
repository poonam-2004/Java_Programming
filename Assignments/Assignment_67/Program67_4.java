///////////////////////////////////////////////////////////////////
//
//  Program Name : Program67_4
//  Description  : Check whether bit at given two positions is ON
//  Input        : Number and two positions
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program67_4
{
    public static boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 1 << (iPos1 - 1);
        int iMask2 = 1 << (iPos2 - 1);

        if(((iNo & iMask1) != 0) || ((iNo & iMask2) != 0))
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.print("Enter first position : ");
        int iPos1 = sobj.nextInt();

        System.out.print("Enter second position : ");
        int iPos2 = sobj.nextInt();

        boolean bRet = ChkBit(iValue, iPos1, iPos2);

        if(bRet)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 10  3  7
//  Output : TRUE
//
///////////////////////////////////////////////////////////////////