///////////////////////////////////////////////////////////////////
//
//  Program Name : Program67_5
//  Description  : Toggle all bits in given range
//  Input        : Number and range
//  Output       : Modified number
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program67_5
{
    public static int ToggleBitRange(int iNo, int iStart, int iEnd)
    {
        int iMask = 0;

        for(int i = iStart; i <= iEnd; i++)
        {
            iMask = iMask | (1 << (i - 1));
        }

        return (iNo ^ iMask);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.print("Enter start position : ");
        int iStart = sobj.nextInt();

        System.out.print("Enter end position : ");
        int iEnd = sobj.nextInt();

        int iRet = ToggleBitRange(iValue, iStart, iEnd);

        System.out.println("Modified number is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 897  9  13
//  Output : 879
//
///////////////////////////////////////////////////////////////////