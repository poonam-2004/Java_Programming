////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_2
//  Description  : Check whether 5th annd 18th bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckBit
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0, iResult = 0;

        iMask1 = 0x00000010;
        iMask2 = 0x00020000;

        iMask = iMask1 | iMask2;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program64_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        CheckBit bobj = new CheckBit();

        boolean bRet = bobj.ChkBit(iValue);

        if(bRet == true)
        {
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }

        sobj.close();
    }
}