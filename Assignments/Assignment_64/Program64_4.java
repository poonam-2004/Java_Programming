////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_4
//  Description  : Check whether 7th, 8th and 9th bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program64_4
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x000001C0;
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

        boolean bRet = ChkBit(iValue);

        if(bRet == true)
            System.out.println("7th, 8th and 9th bits are ON");
        else
            System.out.println("7th, 8th and 9th bits are OFF");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 448
//  Output : 7th, 8th and 9th bits are ON
//
////////////////////////////////////////////////////////////////////