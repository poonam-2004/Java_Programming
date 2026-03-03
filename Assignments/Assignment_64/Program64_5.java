////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_5
//  Description  : Check whether 1st and 32nd bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program64_5
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x80000001;
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
            System.out.println("1st and 32nd bits are ON");
        else
            System.out.println("1st and 32nd bits are OFF");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : -2147483647
//  Output : 1st and 32nd bits are ON
//
////////////////////////////////////////////////////////////////////