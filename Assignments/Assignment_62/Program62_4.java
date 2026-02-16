////////////////////////////////////////////////////////////////////
//
//  Program Name : Program62_4
//  Description  : Create backup copy of file
//  Input        : File name
//  Output       : Backup file created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program62_4
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        String backup = fname.substring(0, fname.lastIndexOf('.')) + "_backup" +
                        fname.substring(fname.lastIndexOf('.'));

        FileInputStream fin = new FileInputStream(fname);
        FileOutputStream fout = new FileOutputStream(backup);

        int data = 0;
        while((data = fin.read()) != -1)
        {
            fout.write(data);
        }

        System.out.println("Backup file created successfully");

        fin.close();
        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt
//  Output : Backup file created successfully
//
////////////////////////////////////////////////////////////////////