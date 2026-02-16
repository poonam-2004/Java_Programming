////////////////////////////////////////////////////////////////////
//
//  Program Name : Program63_3
//  Description  : Copy all files from one directory to another
//  Input        : Source directory, Destination directory
//  Output       : All files copied
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program63_3
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source directory : ");
        String srcDir = sobj.nextLine();

        System.out.print("Enter destination directory : ");
        String destDir = sobj.nextLine();

        File src = new File(srcDir);
        File dest = new File(destDir);

        dest.mkdir();

        File[] files = src.listFiles();

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(destDir + "\\" + f.getName());

                int data;
                while((data = fin.read()) != -1)
                {
                    fout.write(data);
                }

                fin.close();
                fout.close();
            }
        }

        System.out.println("All files copied successfully");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Output : All files copied successfully
//
////////////////////////////////////////////////////////////////////