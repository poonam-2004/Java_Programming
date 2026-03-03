////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_3
//  Description  : Check whether 7th, 15th, 21st and 28th bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program64_3
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x08104040;
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
            System.out.println("All bits are ON");
        else
            System.out.println("All bits are OFF");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 135266368
//  Output : All bits are ON
//
////////////////////////////////////////////////////////////////////