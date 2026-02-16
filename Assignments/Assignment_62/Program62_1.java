////////////////////////////////////////////////////////////////////
//
//  Program Name : Program62_1
//  Description  : Display total number of bytes from file
//  Input        : File name
//  Output       : Total bytes count
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program62_1
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        FileInputStream fin = new FileInputStream(fname);

        int iCnt = 0;
        while(fin.read() != -1)
        {
            iCnt++;
        }

        System.out.println("Total bytes are : " + iCnt);

        fin.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt
//  Output : Total bytes are : 120
//
////////////////////////////////////////////////////////////////////