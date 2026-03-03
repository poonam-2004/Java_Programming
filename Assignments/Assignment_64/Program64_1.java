////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_1
//  Description  : Check whether 15th bit is ON or OFF
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
        int iMask = 0x00004000;   
        int iResult = iNo & iMask;

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

class Program64_1
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
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input 1  : 16384
//  Output 1 : 15th bit is ON
//
//  Input 2  : 13579
//  Output 2 : 15th bit is OFF
//
////////////////////////////////////////////////////////////////////