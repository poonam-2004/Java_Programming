////////////////////////////////////////////////////////////////////
//
//  Program Name : Program61_4
//  Description  : Merge two files into third file
//  Input        : Two input files, One output file
//  Output       : Files merged
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program61_4
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first file : ");
        String f1 = sobj.nextLine();

        System.out.print("Enter second file : ");
        String f2 = sobj.nextLine();

        System.out.print("Enter output file : ");
        String foutname = sobj.nextLine();

        FileInputStream fin1 = new FileInputStream(f1);
        FileInputStream fin2 = new FileInputStream(f2);
        FileOutputStream fout = new FileOutputStream(foutname);

        int data;

        while((data = fin1.read()) != -1)
        {
            fout.write(data);
        }

        while((data = fin2.read()) != -1)
        {
            fout.write(data);
        }

        System.out.println("Files merged successfully");

        fin1.close();
        fin2.close();
        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : File1.txt  File2.txt  Output.txt
//  Output : Files merged successfully
//
////////////////////////////////////////////////////////////////////