////////////////////////////////////////////////////////////////////
//
//  Program Name : Program60_2
//  Description  : Display largest file from directory
//  Input        : Directory name
//  Output       : Largest file name
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program60_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();

            File largest = null;
            long max = 0;

            for(File f : arr)
            {
                if(f.isFile())
                {
                    if(f.length() > max)
                    {
                        max = f.length();
                        largest = f;
                    }
                }
            }

            if(largest != null)
            {
                System.out.println("Largest file is : " + largest.getName());
            }
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
//  Output : Largest file is : Marvellous.txt
//
////////////////////////////////////////////////////////////////////