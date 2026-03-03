///////////////////////////////////////////////////////////////////
//
//  Program Name : Program67_1
//  Description  : Count number of ON bits in given number
//  Input        : One integer number
//  Output       : Count of ON bits
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program67_1
{
    public static int CountOne(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCnt++;
            }
            iNo = iNo >> 1;
        }
        return iCnt;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = CountOne(iValue);

        System.out.println("Number of ON bits are : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 11
//  Output : 3
//
///////////////////////////////////////////////////////////////////