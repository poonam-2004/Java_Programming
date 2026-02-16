////////////////////////////////////////////////////////////////////
//
//  Program Name : Program63_4
//  Description  : Create Combined.bin from all files in directory
//  Input        : Directory name
//  Output       : Combined.bin created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program63_4
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dir = new File(dname);
        File[] files = dir.listFiles();

        FileOutputStream fout = new FileOutputStream("Combined.bin");

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fin = new FileInputStream(f);
                int data;
                while((data = fin.read()) != -1)
                {
                    fout.write(data);
                }
                fin.close();
            }
        }

        System.out.println("Combined.bin created successfully");

        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Output : Combined.bin created successfully
//
////////////////////////////////////////////////////////////////////