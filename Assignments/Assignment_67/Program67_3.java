///////////////////////////////////////////////////////////////////
//
//  Program Name : Program67_3
//  Description  : Check whether 9th or 12th bit is ON
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program67_3
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00000900;   // 9th and 12th bit
        int iResult = iNo & iMask;

        if(iResult != 0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        boolean bRet = ChkBit(iValue);

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
//  Input  : 257
//  Output : TRUE
//
///////////////////////////////////////////////////////////////////