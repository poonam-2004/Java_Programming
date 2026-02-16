////////////////////////////////////////////////////////////////////
//
//  Program Name : Program60_1
//  Description  : Calculate total size of all files from directory
//  Input        : Directory name
//  Output       : Total size of files
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program60_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        long total = 0;

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();

            for(File f : arr)
            {
                if(f.isFile())
                {
                    total = total + f.length();
                }
            }

            System.out.println("Total size is : " + total + " bytes");
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : .
//  Output : Total size is : 350 bytes
//
////////////////////////////////////////////////////////////////////