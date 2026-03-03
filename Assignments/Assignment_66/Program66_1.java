///////////////////////////////////////////////////////////////////
//
//  Program Name : Program66_1
//  Description  : Check whether bit at given position is ON or OFF
//  Input        : One integer number and position
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program66_1
{
    public static boolean ChkBit(int iNo, int iPos)
    {
        int iMask = 1 << (iPos - 1);
        int iResult = iNo & iMask;

        if(iResult == iMask)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.print("Enter position : ");
        int iPos = sobj.nextInt();

        boolean bRet = ChkBit(iValue, iPos);

        if(bRet)
            System.out.println("Bit is ON");
        else
            System.out.println("Bit is OFF");

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 10  2
//  Output : Bit is ON
//
///////////////////////////////////////////////////////////////////