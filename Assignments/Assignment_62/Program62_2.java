////////////////////////////////////////////////////////////////////
//
//  Program Name : Program62_2
//  Description  : Copy first N bytes into new file
//  Input        : File name, Number
//  Output       : New file created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program62_2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int iNo = sobj.nextInt();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        int data = 0;
        int iCnt = 0;

        while((data = fin.read()) != -1 && iCnt < iNo)
        {
            fout.write(data);
            iCnt++;
        }

        System.out.println("First N bytes copied successfully");

        fin.close();
        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt Copy.txt 10
//  Output : First N bytes copied successfully
//
////////////////////////////////////////////////////////////////////