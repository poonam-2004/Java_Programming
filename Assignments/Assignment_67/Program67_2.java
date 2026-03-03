///////////////////////////////////////////////////////////////////
//
//  Program Name : Program67_2
//  Description  : Display positions of common ON bits
//  Input        : Two integer numbers
//  Output       : Positions of common ON bits
//  Author       : Poonam Narayan Palkar
//  Date         : 05/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program67_2
{
    public static void CommonBits(int iNo1, int iNo2)
    {
        int iResult = iNo1 & iNo2;
        int iPos = 1;

        while(iResult != 0)
        {
            if((iResult & 1) == 1)
            {
                System.out.print(iPos + " ");
            }
            iResult = iResult >> 1;
            iPos++;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        int iValue2 = sobj.nextInt();

        System.out.print("Common ON bit positions are : ");
        CommonBits(iValue1, iValue2);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 10  15
//  Output : 2 4
//
///////////////////////////////////////////////////////////////////