////////////////////////////////////////////////////////////////////
//
//  Program Name : Program65_2
//  Description  : Off 7th and 10th bit of given number
//  Input        : One integer number
//  Output       : Modified number
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program65_2
{
    public static int OffBit(int iNo)
    {
        int iMask = 0x00000240;   // 7th & 10th bit
        return (iNo & (~iMask));
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
//  Input  : 577
//  Output : 1
//
////////////////////////////////////////////////////////////////////