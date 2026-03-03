////////////////////////////////////////////////////////////////////
//
//  Program Name : Program65_1
//  Description  : Off 7th bit of given number if it is ON
//  Input        : One integer number
//  Output       : Modified number
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program65_1
{
    public static int OffBit(int iNo)
    {
        int iMask = 0x00000040;   // 7th bit
        int iResult = iNo & iMask;

        if(iResult == iMask)
        {
            iNo = iNo ^ iMask;
        }
        return iNo;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = OffBit(iValue);

        System.out.println("Modified number is : " + iRet);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 79
//  Output : 15
//
////////////////////////////////////////////////////////////////////