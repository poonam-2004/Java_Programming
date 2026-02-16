////////////////////////////////////////////////////////////////////
//
//  Program Name : Program61_1
//  Description  : Copy data from source file to destination file (byte by byte)
//  Input        : Source file name, Destination file name
//  Output       : File copied
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program61_1
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        int data;

        while((data = fin.read()) != -1)
        {
            fout.write(data);
        }

        System.out.println("File copied successfully");

        fin.close();
        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt  Copy.txt
//  Output : File copied successfully
//
////////////////////////////////////////////////////////////////////